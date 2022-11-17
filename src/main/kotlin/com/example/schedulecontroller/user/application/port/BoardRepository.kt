package com.example.schedulecontroller.user.application.port

import com.example.schedulecontroller.user.adapter.interfaces.rest.entity.Board
import com.example.schedulecontroller.user.adapter.interfaces.rest.entity.BoardDetail
import com.example.schedulecontroller.user.adapter.interfaces.rest.entity.CreateBoardDTO
import com.example.schedulecontroller.user.adapter.interfaces.rest.entity.UpdateBoardDTO

interface BoardRepository {
    fun getBoardList(): List<Board>
    fun getBoardDetail(id: Long): BoardDetail?
    fun postBoard(dto: CreateBoardDTO)
    fun updateBoard(dto: UpdateBoardDTO)
    fun deleteBoard(id: Long)
}