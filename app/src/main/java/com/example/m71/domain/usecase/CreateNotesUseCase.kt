package com.example.m71.domain.usecase

import com.example.m71.domain.model.Note
import com.example.m71.domain.repository.NoteRepository

class CreateNotesUseCase(private val noteRepository: NoteRepository) {
    fun createNotes(note: Note) {
        noteRepository.createNote(note)
    }
}