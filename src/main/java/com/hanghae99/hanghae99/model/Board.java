package com.hanghae99.hanghae99.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@EntityListeners(value = AuditingEntityListener.class)
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String writer;
    private String description;
    private String password;
    @CreatedDate
    private LocalDateTime createdAt;

    public Board(String title, String writer, String description, String password) {
        this.title = title;
        this.writer = writer;
        this.description = description;
        this.password = password;
    }

    public Board() {

    }


}
