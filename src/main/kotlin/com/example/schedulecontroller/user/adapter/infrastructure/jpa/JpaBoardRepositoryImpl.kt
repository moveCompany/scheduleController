package com.example.schedulecontroller.user.adapter.infrastructure.jpa

import com.example.schedulecontroller.user.adapter.interfaces.rest.entity.Board
import com.example.schedulecontroller.user.adapter.interfaces.rest.entity.BoardDetail
import com.example.schedulecontroller.user.adapter.interfaces.rest.entity.CreateBoardDTO
import com.example.schedulecontroller.user.adapter.interfaces.rest.entity.UpdateBoardDTO
import com.example.schedulecontroller.user.application.port.BoardRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository

interface SpringJpaBoardRepository: JpaRepository<BoardDetail, Long>
interface SpringJpaBoardListRepository: JpaRepository<Board, Long>
interface SpringJpaBoardSaveRepository: JpaRepository<CreateBoardDTO, Long>
interface SpringJpaBoardUpdateRepository: JpaRepository<UpdateBoardDTO, Long>

@Repository
class JpaBoardRepositoryImpl(
    private val springJpaBoardRepository: SpringJpaBoardRepository,
    private val springJpaBoardListRepository: SpringJpaBoardListRepository,
    private val springJpaBoardSaveRepository: SpringJpaBoardSaveRepository,
    private val springJpaBoardUpdateRepository: SpringJpaBoardUpdateRepository
): BoardRepository {
    override fun getBoardList(): List<Board> {
        return springJpaBoardListRepository.findAll()
    }

    override fun getBoardDetail(id: Long): BoardDetail? {
        return springJpaBoardRepository.findByIdOrNull(id)
    }

    override fun postBoard(dto: CreateBoardDTO) {
        springJpaBoardSaveRepository.save(dto)
    }

    override fun updateBoard(dto: UpdateBoardDTO) {
        springJpaBoardUpdateRepository.save(dto)
    }

    override fun deleteBoard(id: Long) {
        springJpaBoardRepository.deleteById(id)
    }

}