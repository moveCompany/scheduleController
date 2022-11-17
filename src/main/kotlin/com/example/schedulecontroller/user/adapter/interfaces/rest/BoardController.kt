package com.example.schedulecontroller.user.adapter.interfaces.rest

import com.example.schedulecontroller.user.adapter.interfaces.rest.entity.Board
import com.example.schedulecontroller.user.adapter.interfaces.rest.entity.BoardDetail
import com.example.schedulecontroller.user.adapter.interfaces.rest.entity.CreateBoardDTO
import com.example.schedulecontroller.user.adapter.interfaces.rest.entity.UpdateBoardDTO
import com.example.schedulecontroller.user.application.service.BoardService
import com.example.schedulecontroller.user.common.utils.ResponseUtils
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/boards")
class BoardController(
    private val boardService: BoardService
) {

    @GetMapping("")
    fun getBoardList(): ResponseEntity<List<Board>> {
        return ResponseUtils.ok(boardService.getBoardList())
    }

    @GetMapping("{id}")
    fun getBoardDetail(
        @PathVariable id: Long
    ): ResponseEntity<BoardDetail> {
        return ResponseUtils.ok(boardService.getBoardDetail(id))
    }

    @PostMapping("")
    fun postBoard(
        @RequestBody dto: CreateBoardDTO
    ): ResponseEntity<Void> {
        boardService.postBoard(dto)
        return ResponseUtils.created()
    }

    @PutMapping("")
    fun updateBoard(
        @RequestBody dto: UpdateBoardDTO
    ): ResponseEntity<Void> {
        boardService.updateBoard(dto)
        return ResponseUtils.ok()
    }

    @DeleteMapping("{id}")
    fun deleteBoard(
        @PathVariable id: Long
    ): ResponseEntity<Void> {
        boardService.deleteBoard(id)
        return ResponseUtils.ok()
    }
}