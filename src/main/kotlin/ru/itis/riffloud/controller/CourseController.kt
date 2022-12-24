package ru.itis.riffloud.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.itis.riffloud.model.Course
import ru.itis.riffloud.service.CourseService

@RestController
class CourseController(
    private val courseService: CourseService
) {

    @GetMapping("/course/{id}")
    fun findOneById(@PathVariable id: Int): Course = courseService.findOneById(id)

    @GetMapping("/course")
    fun getCoursesPaginated(@RequestParam page: Int, @RequestParam amount: Int): List<Course> =
        courseService.getPaginated(page, amount)
}