package com.web.ldap;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.web.ldap.dao.EmployeeDao;
import com.web.ldap.dao.FullTimeEmployeeRepository;
import com.web.ldap.dao.InstrucrorDetailsRepository;
import com.web.ldap.dao.InstrucrorRepository;
import com.web.ldap.dao.DefiningRepositoryInterfaces.FinetuningRepositoryDefinition.CustomUserMyBaseRepository;
import com.web.ldap.model.Instrucror;
import com.web.ldap.model.InstrucrorDetails;
import com.web.ldap.model.entityinheritance.ContractEmployee;
import com.web.ldap.model.entityinheritance.FullTimeEmployee;
import com.web.ldap.model.entityinheritance.PartTimeEmployee;
import com.web.ldap.service.EmployeeService;

@SpringBootApplication
/* @EnableCaching */
public class SpringbootWebJpaJspApplication implements CommandLineRunner /* extends SpringBootServletInitializer */ {
	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder builder) { return
	 * builder.sources(SpringbootWebJpaJspApplication.class); }
	 */
	@Autowired
	CustomUserMyBaseRepository customUserMyBaseRepository;
	@Autowired
	InstrucrorRepository instrucrorRepository;
	@Autowired
	InstrucrorDetailsRepository instrucrorDetailsRepository;
	@Autowired
	FullTimeEmployeeRepository fullTimeEmployeeRepository;
	@Autowired
	EmployeeService employeeDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebJpaJspApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("This is Created" + customUserMyBaseRepository.findByEmailAddress("dasarishiva1@gmail.com"));
		InstrucrorDetails ind = new InstrucrorDetails();
		ind.setHobby("Programming");
		ind.setYoutubeChannel("No");
		Instrucror in = new Instrucror();
		in.setFirstName("Shiva");
		in.setLastName("Dasari");
		in.setInstrucrorDetails(ind);
		instrucrorRepository.save(in);
		InstrucrorDetails ind1 = new InstrucrorDetails();
		ind1.setHobby("Programming");
		ind1.setYoutubeChannel("No");
		Instrucror in1 = new Instrucror();
		in1.setFirstName("Shiva");
		in1.setLastName("Dasari");
		in1.setInstrucrorDetails(ind1);
		instrucrorRepository.save(in1);
		/* instrucrorRepository.delete(in); */
		InstrucrorDetails instrucrorDetails2 = null;
		Optional<InstrucrorDetails> instrucrorDetails = instrucrorDetailsRepository.findById(2);
		if (instrucrorDetails.isPresent()) {
			instrucrorDetails2 = instrucrorDetails.get();
		}
		System.out.println("AAA" + instrucrorDetails2);
		System.out.println("AAA" + instrucrorDetails2.getInstrucror());
		instrucrorDetails2.getInstrucror().setInstrucrorDetails(null);
		/* bi-directional delete */
		instrucrorDetailsRepository.deleteById(2);
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
		partTimeEmployee.setName("Shiva");
		partTimeEmployee.setWeeklySalary(100);
		employeeDao.savePart(partTimeEmployee);
		FullTimeEmployee fullTimeEmployee =new FullTimeEmployee();
		fullTimeEmployee.setName("Satish");
		fullTimeEmployee.setSalary(10000);
		employeeDao.saveFull(fullTimeEmployee);
		ContractEmployee contractEmployee=new ContractEmployee();
		contractEmployee.setHourlyRate(100);
		contractEmployee.setName("SD");
		
		employeeDao.saveContr(contractEmployee);
		// fullTimeEmployeeRepository.save(partTimeEmployee);
	}
}
