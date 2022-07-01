package com.hanghae99.hanghae99;

import com.hanghae99.hanghae99.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository <T extends Board> extends JpaRepository<T, Long> {

}
