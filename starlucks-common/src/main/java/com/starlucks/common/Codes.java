package com.starlucks.common;

public final class Codes {
    public enum Size {
        NONE, TALL, GRANDE, VENTI
    }

    public enum OptionCategory {
        COFFEE("커피"),
        SYRUP("시럽"),
        BASE("베이스"),
        ICE("얼음"),
        WHIPPED_CREAM("휘핑 크림"),
        DRIZZLE("드리즐"),
        ETC("기타");

        private final String name;

        OptionCategory(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
