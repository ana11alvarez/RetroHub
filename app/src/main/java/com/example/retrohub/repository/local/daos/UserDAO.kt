package com.example.retrohub.repository.local.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.retrohub.repository.local.entities.UserEntity


@Dao
interface UserDAO {
    @Query("SELECT * FROM userentity LIMIT 1")
    suspend fun getPersistedUser(): UserEntity

    @Insert
    suspend fun insert(user: UserEntity)

    @Query("DELETE FROM userentity")
    suspend fun delete()

}