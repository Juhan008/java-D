package com.boardTest.board.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boardTest.board.dao.BoardDAO;
import com.boardTest.board.domain.Board;


@Service
public class BoardService {
  @Autowired
  BoardDAO boardDAO;

  public void add(Board board) {
    boardDAO.add(board);
  }

  public List<Board> getAll() {
    return boardDAO.getAll();
  }
}
