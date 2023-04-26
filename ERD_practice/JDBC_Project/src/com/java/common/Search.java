package com.java.common;

public class Search {

    private Condition condition;
    private String keyword;

    public Search(Condition condition, String keyword) {
        this.condition = condition;
        this.keyword = keyword;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
