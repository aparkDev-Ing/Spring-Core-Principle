package hello.core.members.domain;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Member {

    private static AtomicLong idG = new AtomicLong(0);
    private String name;

    private Grade grade;

    private Long id;

    public Member(String name,Grade grade){
        this.name = name;
        this.id=idG.incrementAndGet();
        this.grade=grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}

