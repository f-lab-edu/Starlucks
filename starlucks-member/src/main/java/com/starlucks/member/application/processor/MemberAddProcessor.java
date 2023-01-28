package com.starlucks.member.application.processor;

import com.starlucks.member.application.command.MemberAddCommand;
import com.starlucks.member.domain.repository.MemberRepository;
import com.starlucks.member.infrastructure.generator.MemberIdGenerator;

public class MemberAddProcessor {

    private final MemberRepository memberRepository;
    private final MemberIdGenerator memberIdGenerator;

    public MemberAddProcessor(
        MemberRepository memberRepository,
        MemberIdGenerator memberIdGenerator
    ) {
        this.memberRepository = memberRepository;
        this.memberIdGenerator = memberIdGenerator;
    }


    public void excute(MemberAddCommand command) {
        memberRepository.save(command.from(command.getPassword()));
    }
}
