package com.web.ldap.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="P")
public class PartTimeEmployee extends Employee{
	private int weeklySalary;

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                super.toString()+
                "weeklySalary=" + weeklySalary +
                '}';
    }
}
