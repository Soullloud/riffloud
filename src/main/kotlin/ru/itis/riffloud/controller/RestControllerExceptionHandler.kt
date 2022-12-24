package ru.itis.riffloud.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import ru.itis.riffloud.exception.NotFoundException
import ru.itis.riffloud.model.http.ErrorMessage

@RestControllerAdvice
class RestControllerExceptionHandler {

    @ExceptionHandler(NotFoundException::class)
    fun handleNotFoundException(e: NotFoundException): ResponseEntity<ErrorMessage> = ResponseEntity
        .status(HttpStatus.NOT_FOUND)
        .body(ErrorMessage(e.message ?: "not found"))
}