package com.example.m71.domain.usecase

import com.example.m71.domain.model.Note
import com.example.m71.domain.repository.NoteRepository

class UpdateNoteUseCase(private val noteRepository: NoteRepository) {
    fun updateNote(note: Note){
        noteRepository.updateNote(note)
    }
}