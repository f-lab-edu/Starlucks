package com.starlucks.member.application.processor;

import com.starlucks.member.application.command.MemberAddCommand;
import com.starlucks.member.domain.repository.MemberAddRepository;

public class MemberAddProcessor {

    private final MemberAddRepository memberAddRepository;

    public MemberAddProcessor(
        MemberAddRepository memberAddRepository
    ) {
        this.memberAddRepository = memberAddRepository;
    }

    public void excute(MemberAddCommand command) {
        memberAddRepository.save(command.from(command.getPassword()));
    }
}
