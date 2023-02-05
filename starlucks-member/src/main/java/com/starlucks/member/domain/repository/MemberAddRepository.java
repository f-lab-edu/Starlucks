package com.starlucks.member.domain.repository;

import com.starlucks.member.domain.entity.MemberAdd;

public interface MemberAddRepository {

    MemberAdd save(MemberAdd member);
}
