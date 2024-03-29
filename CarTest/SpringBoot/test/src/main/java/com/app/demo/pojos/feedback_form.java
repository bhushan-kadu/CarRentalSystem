package com.app.demo.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
 
@Getter
@Setter
@ToString(exclude = { "order" })
public class feedback_form {
	@Id
	private long o_id;
	private int Cleaning_points;
	private int Service_points;
	private String Comments;
	@OneToOne
	@JoinColumn(name = "o_id")
	@MapsId
	private Orders_Details order;

	public long getO_id() {
		return o_id;
	}

	public void setO_id(long o_id) {
		this.o_id = o_id;
	}

	public int getCleaning_points() {
		return Cleaning_points;
	}

	public void setCleaning_points(int cleaning_points) {
		Cleaning_points = cleaning_points;
	}

	public int getService_points() {
		return Service_points;
	}

	public void setService_points(int service_points) {
		Service_points = service_points;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public Orders_Details getOrder() {
		return order;
	}

	public void setOrder(Orders_Details order) {
		this.order = order;
	}

	public feedback_form() {
		super();
	}

	@Override
	public String toString() {
		return "feedback_form [o_id=" + o_id + ", Cleaning_points=" + Cleaning_points + ", Service_points="
				+ Service_points + ", Comments=" + Comments + "]";
	}

	public feedback_form(long o_id, int cleaning_points, int service_points, String comments) {
		super();
		this.o_id = o_id;
		Cleaning_points = cleaning_points;
		Service_points = service_points;
		Comments = comments;
	}

}
