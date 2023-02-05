package com.starlucks.member.infrastructure.config;

import com.starlucks.member.domain.entity.MemberAdd;
import com.starlucks.member.domain.repository.MemberAddRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberAddRepositoryConfig {
    @Bean
    public MemberAddRepository memberRepository() {
        return new MemberAddRepository() {
            @Override
            public MemberAdd save(MemberAdd member) {
                return null;
            }
        };
    }
}
