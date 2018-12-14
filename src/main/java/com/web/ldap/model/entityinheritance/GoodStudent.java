package com.web.ldap.model.entityinheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="good_student")
public class GoodStudent extends Student {

	private String appriciate;
	private String helpOthers;

	public String getAppriciate() {
		return appriciate;
	}

	public void setAppriciate(String appriciate) {
		this.appriciate = appriciate;
	}

	public String getHelpOthers() {
		return helpOthers;
	}

	public void setHelpOthers(String helpOthers) {
		this.helpOthers = helpOthers;
	}
	
}
