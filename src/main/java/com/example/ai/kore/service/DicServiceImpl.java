/**
 * 
 */
package com.example.ai.kore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ai.kore.bean.Word;

/**
 * @author Admin
 *
 */
@Service
public class DicServiceImpl implements DicService {

	@Override
	public List<Word> getDicService() {
		List<Word> list = new ArrayList<>();

		List<String> meaning1 = new ArrayList<>();
		meaning1.add("nice");
		meaning1.add("good");
		Word w1 = new Word("great", meaning1);
		list.add(w1);
		List<String> meaning2 = new ArrayList<>();
		meaning2.add("bad");
		meaning2.add("evil");
		Word w2 = new Word("dishonest", meaning2);
		list.add(w2);

		return list;
	}

}
