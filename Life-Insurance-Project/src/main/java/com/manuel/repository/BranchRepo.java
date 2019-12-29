package com.manuel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manuel.model.Branch;

@Repository
public interface BranchRepo extends CrudRepository<Branch, Integer>{

}
