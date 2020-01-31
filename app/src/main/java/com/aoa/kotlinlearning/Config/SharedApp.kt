package com.aoa.kotlinlearning.Config

import android.app.Application
import androidx.room.Room
import com.aoa.kotlinlearning.database.db.TasksDatabase

class SharedApp : Application() {
    companion object {
        lateinit var prefs: Prefs
        lateinit var database: TasksDatabase
    }

    override fun onCreate() {
        super.onCreate()
        prefs = Prefs(applicationContext)
        SharedApp.database =  Room.databaseBuilder(this, TasksDatabase::class.java, "tasks-db").build()
        println("Init app notas")
        println("Init app prefs")
    }
}