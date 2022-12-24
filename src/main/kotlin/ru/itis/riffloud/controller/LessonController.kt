package ru.itis.riffloud.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import ru.itis.riffloud.model.Lesson
import ru.itis.riffloud.service.LessonService

@RestController
class LessonController(
    private val lessonService: LessonService
) {

    @GetMapping("/course/{courseId}/lesson")
    fun findAllLessonsInCourse(@PathVariable courseId: Int): List<Lesson> = lessonService.findAllLessonsInCourse(courseId)

    @GetMapping("/lesson/{id}")
    fun findOneById(@PathVariable id: Int): Lesson = lessonService.findOneById(id)
}