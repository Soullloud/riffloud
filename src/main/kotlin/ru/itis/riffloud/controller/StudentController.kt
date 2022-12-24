package ru.itis.riffloud.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import ru.itis.riffloud.model.Student
import ru.itis.riffloud.service.StudentService

@RestController
class StudentController(
    private val studentService: StudentService
) {

    @GetMapping("/student/{id}")
    fun findOneById(@PathVariable id: Int): Student = studentService.findOneById(id)
}