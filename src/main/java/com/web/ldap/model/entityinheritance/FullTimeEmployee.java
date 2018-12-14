package com.web.ldap.model.entityinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value="F")
@Table
public class FullTimeEmployee extends Employee{
	 private int annualSalary;

	    public int getSalary() {
	        return annualSalary;
	    }

	    public void setSalary(int salary) {
	        this.annualSalary = salary;
	    }

	    @Override
	    public String toString() {
	        return "FullTimeEmployee{" +
	                super.toString() +
	                ", salary=" + annualSalary +
	                '}';
	    }
}
