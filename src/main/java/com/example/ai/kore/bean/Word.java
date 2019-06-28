/**
 * 
 */
package com.example.ai.kore.bean;

import java.util.List;

/**
 * @author Admin
 *
 */
public class Word {

	private String word;
	private List<String> meaning;

	public Word(String word, List<String> meaning1) {
		this.word = word;
		this.meaning = meaning1;
	}

	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}

	/**
	 * @param word
	 *            the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}

	/**
	 * @return the meaning
	 */
	public List<String> getMeaning() {
		return meaning;
	}

	/**
	 * @param meaning
	 *            the meaning to set
	 */
	public void setMeaning(List<String> meaning) {
		this.meaning = meaning;
	}

}
