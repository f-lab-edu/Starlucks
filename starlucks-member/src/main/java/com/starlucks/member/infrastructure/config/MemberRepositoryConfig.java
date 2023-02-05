package com.starlucks.member.infrastructure.config;

import com.starlucks.member.domain.entity.Member;
import com.starlucks.member.domain.repository.MemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberRepositoryConfig {
    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepository() {
            @Override
            public Member save(Member member) {
                return null;
            }
        };
    }
}
