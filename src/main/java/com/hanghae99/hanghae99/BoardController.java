package com.hanghae99.hanghae99;

import com.hanghae99.hanghae99.model.Board;
import com.hanghae99.hanghae99.model.CreateBoardRequest;
import com.hanghae99.hanghae99.model.UpdateBoardRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
public class BoardController {

    @Autowired
    public BoardRepository boardRepository;

    @GetMapping("/")
    public List<Board> getAllBoards(){
        return boardRepository.findAll(Sort.by(Sort.Direction.DESC, "createdAt"));
    }

    @GetMapping("/{id}")
    public Board getBoard(@PathVariable long id) throws Throwable {
        return (Board) boardRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException());
    }

    @PostMapping ("/")
    public Board insertBoard(@RequestBody CreateBoardRequest request){
        Board board = request.toBoard();
        return (Board)boardRepository.save(board);
    }

    @PutMapping("/{id}")
    public Board UpdateBoard(@PathVariable long id, @RequestBody UpdateBoardRequest request)  throws Throwable {


        Board board = (Board) boardRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException());


        request.updateBoard(board);
        return (Board) boardRepository.save(board);
    }

    @DeleteMapping("/{id}")
    public long DeleteBoard(@PathVariable long id){
        boardRepository.deleteById(id);
        return id;
    }
}
