package com.example.m71.domain.usecase

import com.example.m71.domain.model.Note
import com.example.m71.domain.repository.NoteRepository

class DeleteNotesUseCase(private val noteRepository: NoteRepository) {
    fun deleteNotes(note: Note) {
        noteRepository.deleteNote(note)
    }
}