package com.web.ldap.controller;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.ldap.model.PhoneNumber;
import com.web.ldap.model.UserModel;
import com.web.ldap.service.UserModelService;

@Controller
public class UserController {
	@Autowired
	UserModelService userModelService;

	@GetMapping(value = "/")
	public String welcomepage() {
		return "Welcome";
	}

	@GetMapping(value = "/userform")
	public String userForm(Model model) {
		UserModel userModel = new UserModel();
		model.addAttribute("userModel", userModel);
		return "Userform";
	}

	@GetMapping(value = "/userlist")
	public String getAllUsers(Model model) {
		model.addAttribute("userList", userModelService.getAllUsers());
		return "UserList";
	}

	@PostMapping(value = "/saveuser")
	public String saveUser(@ModelAttribute("userModel") UserModel userModel) {
		List<PhoneNumber> phoneNumberList = new ArrayList<>();
		System.out.println(userModel);
		ArrayList<PhoneNumber> dcvasv = new ArrayList<>();
		userModel.getPhoneNumbers().clear();
		List<PhoneNumber> phon = userModel.getDummayList();
		for (PhoneNumber ph : phon) {
			userModel.addPhoneNumbers(ph);
		}
		System.out.println(userModel);
		userModelService.saveUser(userModel);
		return "redirect:/userlist";
	}

	@GetMapping(value = "/edituserpage/{userid}")
	public String editpage(@PathVariable("userid") Integer userid, Model model) {
		UserModel usermodel = userModelService.findbyuserid(userid);
		usermodel.getDummayList().addAll(usermodel.getPhoneNumbers());
		/* usermodel.getPhoneNumbers().clear(); */
		System.out.println(usermodel);
		model.addAttribute("userModel", usermodel);
		return "Editform";
	}

	@PostMapping(value = "/updateuser")
	public String updateUser(@ModelAttribute("userModel") UserModel userModel) {

		System.out.println(userModel.getId());
		List<PhoneNumber> phon = userModel.getDummayList();
		userModel.getPhoneNumbers().clear();
		for (PhoneNumber ph : phon) {
			userModel.addPhoneNumbers(ph);
		}
		if (phon == null) {
			userModel.getPhoneNumbers().clear();
			userModel.setPhoneNumbers(null);
		}
		userModelService.updateUser(userModel);

		return "redirect:/userlist";
	}

	@GetMapping(value = "deleteuser/{userid}")
	public String deleteUser(@PathVariable("userid") Integer userid) {
		userModelService.deleteUser(userid);
		return "redirect:/userlist";
	}

	@ModelAttribute("languageList")
	List<String> listoflanguages() {
		List<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add(".NET");
		return languages;
	}
	@ModelAttribute("alphabets")
	Map<Integer, String> multiselect() {
		Map<Integer, String> maplist = new TreeMap<>();
		maplist.put(1,"A");
		maplist.put(2,"B");
		maplist.put(3,"C");
		maplist.put(4,"D");
		return maplist;
	}

	@GetMapping("/cachaedusers")
	@ResponseBody
	public List<UserModel> getCachedUsers() {
		return userModelService.getCachedUsers();
	}

	@GetMapping("/findByEmailAddresss/{emailAddress}")
	@ResponseBody
	public UserModel findByEmailAddress(@PathVariable("emailAddress") String emailAddress) {
		return userModelService.findByEmailAddress(emailAddress);
	}

	@GetMapping("/findLanguageByNamedquery/{language}")
	@ResponseBody
	public List<UserModel> findByLanguageNamedQuery(@PathVariable("language") String language) {
		System.out.println(language);
		return userModelService.findByLanguageNamedQuery(language);
	}

	@GetMapping("/findByUserNameAndLanguage/{userName}/{language}")
	@ResponseBody
	public UserModel findByUserNameAndLanguage(@PathVariable("userName") String userName,
			@PathVariable("language") String language) {
		return userModelService.findByUserNameAndLanguage(userName, language);
	}

	@GetMapping("/findByUserNameEndsWith/{userName}")
	@ResponseBody
	public List<UserModel> findByUserNameEndsWith(@PathVariable("userName") String userName) {
		return userModelService.findByUserNameEndsWith(userName);
	}

	@GetMapping("/findUserModelByUserNameOrEmailAddress/{username}/{emailAddress}")
	@ResponseBody
	public List<UserModel> findUserModelByUserNameOrEmailAddress(@PathVariable("username") String username,
			@PathVariable("emailAddress") String emailAddress) {
		return userModelService.findUserModelByUserNameOrEmailAddress(username, emailAddress);
	}

	@GetMapping("/searchpage")
	public String searchPage() {
		return "SearchPage";
	}

	@GetMapping("/explicitlyNamedPlus1inout/{arg}")
	@ResponseBody
	public Integer explicitlyNamedPlus1inout(@PathVariable("arg") Integer arg) {
		return userModelService.explicitlyNamedPlus1inout(arg);
	}
}
