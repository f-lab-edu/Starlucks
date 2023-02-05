package com.starlucks.member.infrastructure.config;

import com.starlucks.member.application.processor.MemberAddProcessor;
import com.starlucks.member.domain.repository.MemberAddRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberAddConfig {

    @Bean
    public MemberAddProcessor memberAddProcessor(MemberAddRepository memberAddRepository) {
        return new MemberAddProcessor(memberAddRepository);
    }
}
