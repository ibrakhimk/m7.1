package com.example.m71.domain.model

import android.icu.text.CaseMap.Title

data class Note(
    val id:Int= DEFAULT_ID,
    val title: String,
    val description:String
){
    companion object{
        const val DEFAULT_ID = 0
    }
}
