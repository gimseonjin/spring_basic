package com.hanghae99.hanghae99.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateBoardRequest {
    String title;
    String writer;
    String description;
    String password;

    public Boolean updateBoard(Board board){
        if (!board.getPassword().equals(password))
            return false;

        board.setTitle(title);
        board.setWriter(writer);
        board.setDescription(description);
        return true;
    }
}
