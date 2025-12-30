package hello.core.members.domain;

public enum Grade {

    VIP("VIP"),
    BASIC("BASIC");

    Grade(String description) {
        this.description = description;
    }

    public String description;

}
