package com.manuel.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.manuel.model.Branch;
import com.manuel.model.Response;
import com.manuel.service.BranchService;

@RestController(value = "/branch")
public class BranchController {
	
	@Autowired
	private BranchService branchService;
	
	@GetMapping
	public ResponseEntity<Response> get() {
		return ResponseEntity.status(HttpStatus.OK)
				.body(new Response(branchService.get(), new Date()));
	}
	
	@PostMapping
	public ResponseEntity<Response> save(@RequestBody Branch student) {
		return ResponseEntity.status(HttpStatus.OK)
				.body(new Response(branchService.save(student), new Date()));
	}
	
	@PutMapping
	public ResponseEntity<Response> update(@RequestBody Branch student) {
		return ResponseEntity.status(HttpStatus.OK)
				.body(new Response(branchService.save(student), new Date()));
	}
	
	@DeleteMapping
	public ResponseEntity<Response> delete(@RequestParam("id") int id) {
		branchService.delete(id);
		return ResponseEntity.status(HttpStatus.OK)
				.body(new Response(true, new Date()));
	}
}
