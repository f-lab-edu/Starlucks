package com.starlucks.member.application.processor;

import com.starlucks.member.application.command.MemberAddCommand;
import com.starlucks.member.domain.repository.MemberAddRepository;
import com.starlucks.member.infrastructure.generator.MemberIdGenerator;

public class MemberAddProcessor {

    private final MemberAddRepository memberAddRepository;
    private final MemberIdGenerator memberIdGenerator;

    public MemberAddProcessor(
        MemberAddRepository memberAddRepository,
        MemberIdGenerator memberIdGenerator
    ) {
        this.memberAddRepository = memberAddRepository;
        this.memberIdGenerator = memberIdGenerator;
    }

    public void excute(MemberAddCommand command) {
        memberAddRepository.save(command.from(memberIdGenerator.generate(), command.getPassword()));
    }
}
