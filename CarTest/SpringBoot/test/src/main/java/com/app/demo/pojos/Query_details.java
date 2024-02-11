package com.app.demo.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
 
@Getter
@Setter
@ToString(exclude = { "order" })
public class Query_details {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "order_seq")
	private long q_id;
	@Column(nullable = false)
	private String query_comments;
	private boolean staus;
	@OneToOne
	@JoinColumn(name = "o_id")
	private Orders_Details order;

	public long getQ_id() {
		return q_id;
	}

	public void setQ_id(long q_id) {
		this.q_id = q_id;
	}

	public String getQuery_comments() {
		return query_comments;
	}

	public void setQuery_comments(String query_comments) {
		this.query_comments = query_comments;
	}

	public boolean isStaus() {
		return staus;
	}

	public void setStaus(boolean staus) {
		this.staus = staus;
	}

	public Orders_Details getOrder() {
		return order;
	}

	public void setOrder(Orders_Details order) {
		this.order = order;
	}

	public Query_details() {
		super();
	}

	@Override
	public String toString() {
		return "Query_details [q_id=" + q_id + ", query_comments=" + query_comments + ", staus=" + staus + "]";
	}

	public Query_details(long q_id, String query_comments, boolean staus, Orders_Details order) {
		super();
		this.q_id = q_id;
		this.query_comments = query_comments;
		this.staus = staus;
		this.order = order;
	}

}
