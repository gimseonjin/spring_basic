package com.hanghae99.hanghae99.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBoardRequest {
    String title;
    String writer;
    String description;
    String password;

    public Board toBoard(){
        return new Board(title,writer,description,password);
    }
}