package com.example.schedulecontroller.user.adapter.interfaces.rest.entity

import org.springframework.data.annotation.Id
import java.time.LocalDateTime

class BoardDetail(
    @Id
    val id: Long,
    val password: String,
    val name: String,
    val profileImg: String,
    val createdAt: LocalDateTime
) {
    private var updatedBy: String? = null
    private var updatedAt: LocalDateTime? = null

    fun of(): BoardDetail {
        return BoardDetail(
            id = id,
            password = password,
            name = name,
            profileImg = profileImg,
            createdAt = createdAt
        )
    }
}