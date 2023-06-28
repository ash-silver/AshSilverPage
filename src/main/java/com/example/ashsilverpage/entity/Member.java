package com.example.ashsilverpage.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "member")
public class Member {
    @Id
    private Long Id;


    private String m_nickname;
    private String m_email;
    private String m_password;
    private String m_telephone;
    private LocalDateTime m_joinAt = LocalDateTime.now();
    private int m_editAt;

    private int secessionAt;

}
