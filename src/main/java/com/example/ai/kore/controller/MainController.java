/**
 * 
 */
package com.example.ai.kore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ai.kore.bean.Response;
import com.example.ai.kore.service.DicService;

/**
 * @author Admin
 *
 */
@RestController
class MainController {

	@Autowired
	DicService dicService;

	@GetMapping
	public Response displayName() {
		return new Response(dicService.getDicService());
	}

}
