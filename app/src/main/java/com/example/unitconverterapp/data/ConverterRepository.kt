package com.example.unitconverterapp.data

import kotlinx.coroutines.flow.Flow

interface ConverterRepository {
    suspend fun insertResul(result: ConversionResult)
    suspend fun deleteResul(result: ConversionResult)
    suspend fun deleteAllResult()
    fun getSavedResult(): Flow<List<ConversionResult>>
}