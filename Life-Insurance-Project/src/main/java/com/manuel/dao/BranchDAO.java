package com.manuel.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manuel.model.Branch;
import com.manuel.repository.BranchRepo;

@Repository
public class BranchDAO {
	
	@Autowired
	private BranchRepo branchRepository;
	
	public List<Branch> get() {
		return (List<Branch>) branchRepository.findAll();
	}
	
	public Branch save(Branch branch) {
		return branchRepository.save(branch);
	}
	
	public void delete(int branch_id) {
		branchRepository.deleteById(branch_id);
	}


}
