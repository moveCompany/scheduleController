package com.example.schedulecontroller.user.common.exception.dto

data class ErrorResponse(
    val code: String,
    val message: String,
    val traceId: String
)
