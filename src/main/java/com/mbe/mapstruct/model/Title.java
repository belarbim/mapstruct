package com.mbe.mapstruct.model;

public enum Title {



    MR("Monsieur"),MME("MADAME");

    private String value;
    Title(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
