package com.balaeon.simplegroupchat.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.balaeon.simplegroupchat.db.daos.ChatUserDao
import com.balaeon.simplegroupchat.db.daos.GroupDao
import com.balaeon.simplegroupchat.db.daos.GroupMessageDao
import com.balaeon.simplegroupchat.db.daos.MessageDao
import com.balaeon.simplegroupchat.db.data.ChatUser
import com.balaeon.simplegroupchat.db.data.Group
import com.balaeon.simplegroupchat.db.data.GroupMessage
import com.balaeon.simplegroupchat.db.data.Message

@Database(entities = [ChatUser::class, Message::class,Group::class,GroupMessage::class],
    version = 1, exportSchema = false)
@TypeConverters(TypeConverter::class)
abstract class ChatUserDatabase : RoomDatabase()  {
    abstract fun getChatUserDao(): ChatUserDao
    abstract fun getMessageDao(): MessageDao
    abstract fun getGroupDao(): GroupDao
    abstract fun getGroupMessageDao(): GroupMessageDao
}