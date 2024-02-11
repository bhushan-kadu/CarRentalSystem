package com.app.demo.pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
 
@ToString
  
public class Authentication {
	private String username;
	private String password;

	@Override
	public String toString() {
		return "Authentication [username=" + username + ", password=" + password + "]";
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

	public Authentication(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Authentication() {
		super();
	}

}
