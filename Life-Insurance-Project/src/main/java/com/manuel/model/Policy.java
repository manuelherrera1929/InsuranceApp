package com.manuel.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int policy_id;
	
	private String policy_name;
	private int policy_term;
	private double policy_amount;
	private float policy_interest;
	private Date date;
	private String policy_type;
	private double maturity_amount;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = CustomerPolicyRegistration.class)
	@JoinColumn(name="cust_policy_id")
	private Set<CustomerPolicyRegistration> CustomerPolicyRegistration = new HashSet<>();
	
	public Policy(int policy_id, String policy_name, int policy_term, double policy_amount, float policy_interest,
			Date date, String policy_type, double maturity_amount) {
		super();
		this.policy_id = policy_id;
		this.policy_name = policy_name;
		this.policy_term = policy_term;
		this.policy_amount = policy_amount;
		this.policy_interest = policy_interest;
		this.date = date;
		this.policy_type = policy_type;
		this.maturity_amount = maturity_amount;
	}

	public int getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}

	public String getPolicy_name() {
		return policy_name;
	}

	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}

	public int getPolicy_term() {
		return policy_term;
	}

	public void setPolicy_term(int policy_term) {
		this.policy_term = policy_term;
	}

	public double getPolicy_amount() {
		return policy_amount;
	}

	public void setPolicy_amount(double policy_amount) {
		this.policy_amount = policy_amount;
	}

	public float getPolicy_interest() {
		return policy_interest;
	}

	public void setPolicy_interest(float policy_interest) {
		this.policy_interest = policy_interest;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPolicy_type() {
		return policy_type;
	}

	public void setPolicy_type(String policy_type) {
		this.policy_type = policy_type;
	}

	public double getMaturity_amount() {
		return maturity_amount;
	}

	public void setMaturity_amount(double maturity_amount) {
		this.maturity_amount = maturity_amount;
	}
	
}
