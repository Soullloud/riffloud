package ru.itis.riffloud.repository

import java.util.UUID
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import ru.itis.riffloud.model.Media

@Repository
interface MediaRepository: MongoRepository<Media, UUID> {

    fun findAllByIdIn(ids: List<UUID>): List<Media>
}