package com.sparta.clonecodingunicorn.domain.member.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(unique = true)
    private String email;

    @Column
    private String password;

    @Column
    private String passwordConfirm;

    @Column
    private String name;

    @Column
    private Integer birthYear;

    private String gender;

    @Column
    private String job;

    @Column
    private String interestArea;

    @Column
    private Boolean deleteMember;

    @Column
    private Boolean subscribeAgree;

    public Member(Long memberId, String email, String password, String passwordConfirm, String name, Integer birthYear, String gender, String job, String interestArea, Boolean deleteMember, Boolean subscribeAgree) {
        this.memberId = memberId;
        this.email = email;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.job = job;
        this.interestArea = interestArea;
        this.deleteMember = deleteMember;
        this.subscribeAgree = subscribeAgree;
    }
}