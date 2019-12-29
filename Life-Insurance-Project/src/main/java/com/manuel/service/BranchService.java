package com.manuel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manuel.dao.BranchDAO;
import com.manuel.model.Branch;

@Service
public class BranchService {
	
	@Autowired
	private BranchDAO branchDAO;
	
	public List<Branch> get() {
		return branchDAO.get();
	}
	
	public Branch save(Branch student) {
		return branchDAO.save(student);
	}
	
	public void delete(int id) {
		branchDAO.delete(id);
	}
	
	
}
