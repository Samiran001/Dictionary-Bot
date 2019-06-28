/**
 * 
 */
package com.example.ai.kore.bean;

import java.util.List;

/**
 * @author Admin
 *
 */
public class Response {

	private List<Word> response;

	public Response(List<Word> response) {
		super();
		this.response = response;
	}

	/**
	 * @return the response
	 */
	public List<Word> getResponse() {
		return response;
	}

	/**
	 * @param response
	 *            the response to set
	 */
	public void setResponse(List<Word> response) {
		this.response = response;
	}

}
