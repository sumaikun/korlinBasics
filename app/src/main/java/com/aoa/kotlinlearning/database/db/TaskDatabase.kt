package com.aoa.kotlinlearning.database.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aoa.kotlinlearning.database.Entities.TaskEntity
import com.aoa.kotlinlearning.database.dao.TaskDao

@Database(entities = arrayOf(TaskEntity::class), version = 1)
abstract class TasksDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}