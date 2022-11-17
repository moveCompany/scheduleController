package com.example.schedulecontroller.user.application.service

import com.example.schedulecontroller.user.adapter.interfaces.rest.entity.Board
import com.example.schedulecontroller.user.adapter.interfaces.rest.entity.BoardDetail
import com.example.schedulecontroller.user.adapter.interfaces.rest.entity.CreateBoardDTO
import com.example.schedulecontroller.user.adapter.interfaces.rest.entity.UpdateBoardDTO
import com.example.schedulecontroller.user.application.port.BoardRepository
import org.springframework.stereotype.Service

interface BoardService {
    fun getBoardList(): List<Board>
    fun getBoardDetail(id: Long): BoardDetail
    fun postBoard(dto: CreateBoardDTO)
    fun updateBoard(dto: UpdateBoardDTO)
    fun deleteBoard(id: Long)
}

@Service
class BoardServiceImpl(
    private val boardRepository: BoardRepository
): BoardService {
    override fun getBoardList(): List<Board> {
        return boardRepository.getBoardList()
    }

    override fun getBoardDetail(id: Long): BoardDetail {
        return boardRepository.getBoardDetail(id)
    }

    override fun postBoard(dto: CreateBoardDTO) {
        boardRepository.postBoard(dto)
    }

    override fun updateBoard(dto: UpdateBoardDTO) {
        boardRepository.updateBoard(dto)
    }

    override fun deleteBoard(id: Long) {
        boardRepository.deleteBoard(id)
    }

}