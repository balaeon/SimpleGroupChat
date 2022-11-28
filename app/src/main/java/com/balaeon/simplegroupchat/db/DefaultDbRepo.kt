package com.balaeon.simplegroupchat.db

import androidx.lifecycle.LiveData
import com.balaeon.simplegroupchat.db.data.ChatUser
import com.balaeon.simplegroupchat.db.data.ChatUserWithMessages
import kotlinx.coroutines.flow.Flow

interface DefaultDbRepo {

    fun insertUser(user: ChatUser)

    fun insertMultipleUser(users: List<ChatUser>)

    fun getAllChatUser(): LiveData<List<ChatUser>>

    fun getChatUserList(): List<ChatUser>

    fun getChatUserById(id: String): ChatUser?

    fun deleteUserById(userId: String)

    fun getChatUserWithMessages(): Flow<List<ChatUserWithMessages>>

    fun getChatUserWithMessagesList(): List<ChatUserWithMessages>

    fun nukeTable()
}