package com.starlucks.member.application.processor;

import com.starlucks.member.application.command.MemberAddCommand;
import com.starlucks.member.domain.repository.MemberRepository;
import com.starlucks.member.infrastructure.generator.MemberIdGenerator;

public class MemberAddProcessor {

    private final MemberRepository memberRepository;

    public MemberAddProcessor(
        MemberRepository memberRepository
    ) {
        this.memberRepository = memberRepository;
    }

    public void excute(MemberAddCommand command) {
        memberRepository.save(command.from(command.getPassword()));
    }
}
