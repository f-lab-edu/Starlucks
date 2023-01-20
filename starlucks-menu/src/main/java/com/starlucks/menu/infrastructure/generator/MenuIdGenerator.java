package com.starlucks.menu.infrastructure.generator;

import com.starlucks.menu.domain.IdGenerator;
import java.util.concurrent.atomic.AtomicLong;

public class MenuIdGenerator implements IdGenerator {

    private final AtomicLong inc = new AtomicLong(1L);

    @Override
    public long generate() {
        return inc.getAndIncrement();
    }
}
