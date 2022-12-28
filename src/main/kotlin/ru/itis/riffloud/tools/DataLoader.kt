package ru.itis.riffloud.tools

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import ru.itis.riffloud.model.Course
import ru.itis.riffloud.model.Lesson
import ru.itis.riffloud.repository.CourseRepository
import ru.itis.riffloud.repository.LessonRepository

@Component
class DataLoader @Autowired constructor(val lessonRepository: LessonRepository, val courseRepository: CourseRepository) : ApplicationRunner {
    override fun run(args: ApplicationArguments) {
        for (i in 0..6) {
            val lessons: MutableList<Lesson> = mutableListOf()
            for (j in 0..5) {
                val lesson = Lesson(0, "Lesson${j}", "Do push ups")
                lessons.add(lesson)
                lessonRepository.save(lesson)
            }
            val course = Course(0, "Course${i}", "The best course you've ever seen in ${i+1} years", lessons)
            courseRepository.save(course)
        }
    }
}
