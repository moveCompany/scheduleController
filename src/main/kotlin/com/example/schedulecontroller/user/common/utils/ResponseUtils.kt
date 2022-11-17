package com.example.schedulecontroller.user.common.utils

import com.example.schedulecontroller.user.common.exception.dto.ErrorResponse
import java.net.URI
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

object ResponseUtils {

    fun ok(): ResponseEntity<Void> {
        return ResponseEntity
            .ok()
            .contentType(MediaType.APPLICATION_JSON)
            .build()
    }

    fun <T> ok(body: T): ResponseEntity<T> {
        return ResponseEntity
            .ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(body)
    }

    fun <T> pagingResponse(body: T, totalPage: Int, total: Long): ResponseEntity<T> {
        return ResponseEntity
            .ok()
            .header("X-Total-Page", totalPage.toString())
            .header("X-Total", total.toString())
            .contentType(MediaType.APPLICATION_JSON)
            .body(body)
    }

    fun created(): ResponseEntity<Void> {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .build()
    }

    fun created(uri: String): ResponseEntity<URI> {
        return ResponseEntity
            .created(URI(uri))
            .contentType(MediaType.APPLICATION_JSON)
            .build()
    }

    fun noContent(): ResponseEntity<Void> {
        return ResponseEntity.noContent().build()
    }

    fun internalServerError(errorResponse: ErrorResponse): ResponseEntity<ErrorResponse> {
        return ResponseEntity
            .internalServerError()
            .contentType(MediaType.APPLICATION_JSON)
            .body(errorResponse)
    }

    fun badRequest(errorResponse: ErrorResponse): ResponseEntity<ErrorResponse> {
        return ResponseEntity
            .badRequest()
            .contentType(MediaType.APPLICATION_JSON)
            .body(errorResponse)
    }

    fun notFound(errorResponse: ErrorResponse): ResponseEntity<ErrorResponse> {
        return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .contentType(MediaType.APPLICATION_JSON)
            .body(errorResponse)
    }

    fun error(errorResponse: ErrorResponse, statusCode: Int): ResponseEntity<ErrorResponse> {
        return ResponseEntity
            .status(statusCode)
            .contentType(MediaType.APPLICATION_JSON)
            .body(errorResponse)
    }
}
