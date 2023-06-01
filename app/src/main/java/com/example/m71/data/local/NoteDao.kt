package com.example.m71.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.m71.data.model.NoteEntity

@Dao
interface NoteDao {

    @Query("SELECT * FROM notes")
    fun getAllNotes():List<NoteEntity>

    @Insert
    fun createNote(noteEntity: NoteEntity)

    @Update
    fun updateNote(noteEntity: NoteEntity)

    @Delete
    fun deleteNote(noteEntity: NoteEntity)
}