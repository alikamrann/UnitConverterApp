package com.example.unitconverterapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ConversionResult::class], version = 1)
abstract class ConvertDataBase : RoomDatabase() {

    abstract val converterDAO : ConverterDAO

    companion object{
        @Volatile
        private var INSTANCE : ConvertDataBase?=null
        fun getInstance(context: Context):ConvertDataBase{
            synchronized(this){
                var instance = INSTANCE
                if(instance==null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ConvertDataBase::class.java,
                        "converter_data_database"
                    ).build()

                }
                return instance
            }
        }
    }
}