package com.app.demo.pojos;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
 
@Getter
@Setter
@ToString(exclude = { "order" })
public class payment_details {
	@Id
	private long o_id;
	@NotNull
	private double total_amount;
	@Embedded
	private CardDetails cards;
	@Column(nullable = true)
	private boolean cash;
	@Embedded
	private UpiDetails upi;
	@Column(nullable = true)
	private boolean razorpay;
	@OneToOne
	@JoinColumn(name = "o_id")
	@MapsId
	@JsonIgnore
	private Orders_Details order;

	public long getO_id() {
		return o_id;
	}

	public void setO_id(long o_id) {
		this.o_id = o_id;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public CardDetails getCards() {
		return cards;
	}

	public void setCards(CardDetails cards) {
		this.cards = cards;
	}

	public boolean isCash() {
		return cash;
	}

	public void setCash(boolean cash) {
		this.cash = cash;
	}

	public UpiDetails getUpi() {
		return upi;
	}

	public void setUpi(UpiDetails upi) {
		this.upi = upi;
	}

	public boolean isRazorpay() {
		return razorpay;
	}

	public void setRazorpay(boolean razorpay) {
		this.razorpay = razorpay;
	}

	public Orders_Details getOrder() {
		return order;
	}

	public void setOrder(Orders_Details order) {
		this.order = order;
	}

	public payment_details() {
		super();
	}

	@Override
	public String toString() {
		return "payment_details [o_id=" + o_id + ", total_amount=" + total_amount + ", cards=" + cards + ", cash="
				+ cash + ", upi=" + upi + ", razorpay=" + razorpay + "]";
	}

	public void addorderinpayment(Orders_Details or1) {

	}
}
