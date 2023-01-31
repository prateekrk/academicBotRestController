package com.prateek.academicbotserver.dto;

import lombok.Data;

public enum Designation {
    PROFESSOR("PROFESSOR"), STUDENT("STUDENT"), FACULTY("FACULTY"), ADMIN("ADMIN"), HOD("HOD");

    private final String name;
    Designation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
