package com.web.ldap.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="C")
public class ContractEmployee extends Employee{
	private int hourlyRate;

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                super.toString() +
                ", hourlyRate='" + hourlyRate + '\'' +
                '}';
    }
}
