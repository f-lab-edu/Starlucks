package com.starlucks.member.infrastructure.config;

import static java.awt.font.OpenType.TAG_NAME;

import com.starlucks.member.domain.entity.MemberAdd;
import com.starlucks.member.domain.repository.MemberAddRepository;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberAddRepositoryConfig {

    private static HashMap<Long, MemberAdd> map = new HashMap<>();

    @Bean
    public MemberAddRepository memberRepository() {
        return new MemberAddRepository() {
            @Override
            public MemberAdd save(MemberAdd member) {
                map.put(member.getId(), member);
                System.out.println(member.getId()
                    + member.getNickname() + " "
                    + member.getEmail() + " "
                    + member.getPassword());
                return null;
            }
        };
    }
}
