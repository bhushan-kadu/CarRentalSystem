package com.app.demo.pojos;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Account_details")
 
@Getter
@Setter
@ToString(exclude = { "orders" })
public class AccountDetails {
	@Id
	@Min(value = 1000000000000000L)
	@Max(value = 9999999999999999L)
	private long adhar_no;
	@Column(unique = true, nullable = false)
	private String username;
	@Column(unique = true, nullable = false)
	private String password;
	@Column(nullable = false)
	private String adhar_name;
	@Embedded
	@Valid
	@Column(nullable = false)
	private Address address;
	private Date dob;
	@Column(nullable = false)
	private boolean gender;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false, unique = true)
	@Min(value = 1000000000L)
	@Max(value = 9999999999L)
	private long mob_no;
	@Column(unique = true)
	private String license_no;
	@Enumerated(EnumType.STRING)
	private Role role;
	@OneToMany(mappedBy = "user", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Orders_Details> orders;

	public long getAdhar_no() {
		return adhar_no;
	}

	public void setAdhar_no(long adhar_no) {
		this.adhar_no = adhar_no;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdhar_name() {
		return adhar_name;
	}

	public void setAdhar_name(String adhar_name) {
		this.adhar_name = adhar_name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMob_no() {
		return mob_no;
	}

	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}

	public String getLicense_no() {
		return license_no;
	}

	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Orders_Details> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders_Details> orders) {
		this.orders = orders;
	}

	public AccountDetails() {
		super();
	}

	@Override
	public String toString() {
		return "AccountDetails [adhar_no=" + adhar_no + ", username=" + username + ", password=" + password
				+ ", adhar_name=" + adhar_name + ", address=" + address + ", dob=" + dob + ", gender=" + gender
				+ ", email=" + email + ", mob_no=" + mob_no + ", license_no=" + license_no + ", role=" + role + "]";
	}

	public void addorderin(Orders_Details or1) {
		if (orders == null) {
			orders = new ArrayList<>();
		}
		orders.add(or1);
		or1.setUser(this);
	}

	public AccountDetails(@Min(1000000000000000L) @Max(9999999999999999L) long adhar_no, String username,
			String password, String adhar_name, @Valid Address address, Date dob, boolean gender, String email,
			@Min(1000000000L) @Max(9999999999L) long mob_no, String license_no, Role role) {
		super();
		this.adhar_no = adhar_no;
		this.username = username;
		this.password = password;
		this.adhar_name = adhar_name;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.mob_no = mob_no;
		this.license_no = license_no;
		this.role = role;
	}

}
