
package com.app.demo.pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
 
  
public class JwtAuthResponse {
	private String Token;

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		Token = token;
	}

	public JwtAuthResponse(String token) {
		super();
		Token = token;
	}

	public JwtAuthResponse() {
		super();
	}

}
