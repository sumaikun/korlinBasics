package com.aoa.kotlinlearning.Config

import android.app.Application
import androidx.room.Room
import com.aoa.kotlinlearning.database.db.TasksDatabase

class MisNotasApp: Application() {

    companion object {
        lateinit var database: TasksDatabase
    }

    override fun onCreate() {
        super.onCreate()
        MisNotasApp.database =  Room.databaseBuilder(this, TasksDatabase::class.java, "tasks-db").build()
        println("Init app notas")
    }
}