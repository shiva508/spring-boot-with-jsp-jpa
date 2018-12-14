package com.web.ldap.model.entityinheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="poor_student")
public class PoorStudent extends Student{
private String needtoImprove;
private String takeHelp;
public PoorStudent() {
	super();
}
public String getNeedtoImprove() {
	return needtoImprove;
}
public void setNeedtoImprove(String needtoImprove) {
	this.needtoImprove = needtoImprove;
}
public String getTakeHelp() {
	return takeHelp;
}
public void setTakeHelp(String takeHelp) {
	this.takeHelp = takeHelp;
}

}
