package com.nt.ajax.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.ajax.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Serializable> {

}
