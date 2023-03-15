package com.starlucks.member.infrastructure.persistence.jpa;

import com.starlucks.member.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaMemberRepository extends JpaRepository<Member, Long> {

}