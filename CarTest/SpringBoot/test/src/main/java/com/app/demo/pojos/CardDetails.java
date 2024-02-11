package com.app.demo.pojos;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
 
  
@Getter
@Setter
@ToString
public class CardDetails {
	@Column(nullable = true)
	private boolean debit_credit;
	@Column(nullable = true)
	private long card_no;
	@Column(nullable = true)
	private String card_name;
	@Column(nullable = true)
	private int card_cvv;
	@Column(nullable = true)
	private Date card_expiry;

	@Override
	public String toString() {
		return "CardDetails [debit_credit=" + debit_credit + ", card_no=" + card_no + ", card_name=" + card_name
				+ ", card_cvv=" + card_cvv + ", card_expiry=" + card_expiry + "]";
	}

	public boolean isDebit_credit() {
		return debit_credit;
	}

	public void setDebit_credit(boolean debit_credit) {
		this.debit_credit = debit_credit;
	}

	public long getCard_no() {
		return card_no;
	}

	public void setCard_no(long card_no) {
		this.card_no = card_no;
	}

	public String getCard_name() {
		return card_name;
	}

	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}

	public int getCard_cvv() {
		return card_cvv;
	}

	public void setCard_cvv(int card_cvv) {
		this.card_cvv = card_cvv;
	}

	public Date getCard_expiry() {
		return card_expiry;
	}

	public void setCard_expiry(Date card_expiry) {
		this.card_expiry = card_expiry;
	}

	public CardDetails(boolean debit_credit, long card_no, String card_name, int card_cvv, Date card_expiry) {
		super();
		this.debit_credit = debit_credit;
		this.card_no = card_no;
		this.card_name = card_name;
		this.card_cvv = card_cvv;
		this.card_expiry = card_expiry;
	}

	public CardDetails() {
		super();
	}

}
