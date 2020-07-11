package com.nt.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.lms.entities.MemberEntity;


@Repository
public interface UserRespository  extends JpaRepository<MemberEntity, Integer>{

}
