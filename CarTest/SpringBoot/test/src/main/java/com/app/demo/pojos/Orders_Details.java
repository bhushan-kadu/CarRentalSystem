package com.app.demo.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
 
@Getter
@Setter
public class Orders_Details {
	@Id
	private long o_id;

	@ManyToOne
	@JoinColumn(name = "adhar_no")
	private AccountDetails user;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "o_id")
	@MapsId
	private Customer_pickup cust;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "car_model")
	private Car_Details car1;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "license_no")
	private Driver_Details dr1;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "order")
	@PrimaryKeyJoinColumn
	@JsonIgnore
	private feedback_form f1;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "order")
	@PrimaryKeyJoinColumn
	private payment_details p1;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "order")
	@PrimaryKeyJoinColumn
	@JsonIgnore
	private after_return_form afr1;

	public long getO_id() {
		return o_id;
	}

	public void setO_id(long o_id) {
		this.o_id = o_id;
	}

	public AccountDetails getUser() {
		return user;
	}

	public void setUser(AccountDetails user) {
		this.user = user;
	}

	public Customer_pickup getCust() {
		return cust;
	}

	public void setCust(Customer_pickup cust) {
		this.cust = cust;
	}

	public Car_Details getCar1() {
		return car1;
	}

	public void setCar1(Car_Details car1) {
		this.car1 = car1;
	}

	public Driver_Details getDr1() {
		return dr1;
	}

	public void setDr1(Driver_Details dr1) {
		this.dr1 = dr1;
	}

	public feedback_form getF1() {
		return f1;
	}

	public void setF1(feedback_form f1) {
		this.f1 = f1;
	}

	public payment_details getP1() {
		return p1;
	}

	public void setP1(payment_details p1) {
		this.p1 = p1;
	}

	public after_return_form getAfr1() {
		return afr1;
	}

	public void setAfr1(after_return_form afr1) {
		this.afr1 = afr1;
	}

	public Orders_Details() {
		super();
	}

	public void addorderinpdetails(payment_details p2) {
		this.p1 = p2;
		p2.setOrder(this);

	}

	public void addorderinfdetails(feedback_form p2) {
		this.f1 = p2;
		p2.setOrder(this);

	}

	public void addorderinadetails(after_return_form p2) {
		this.afr1 = p2;
		p2.setOrder(this);

	}

}
