package ru.itis.riffloud.service

import java.util.UUID
import org.springframework.stereotype.Service
import ru.itis.riffloud.exception.NotFoundException
import ru.itis.riffloud.model.Media
import ru.itis.riffloud.repository.MediaRepository

@Service
class MediaService(
    private val mediaRepository: MediaRepository
) {

    fun findMediaById(id: UUID): Media = mediaRepository.findById(id).orElseThrow {
        NotFoundException("media not found by id $id")
    }

    fun findAllMediaByIds(ids: List<UUID>): List<Media> = mediaRepository.findAllByIdIn(ids)
    
    fun saveMedia(media: Media) = mediaRepository.save(media)
}