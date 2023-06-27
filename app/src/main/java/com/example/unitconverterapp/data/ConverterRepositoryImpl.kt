package com.example.unitconverterapp.data

import kotlinx.coroutines.flow.Flow

class ConverterRepositoryImpl(private val dao : ConverterDAO) : ConverterRepository {
    override suspend fun insertResul(result: ConversionResult) {
        dao.insertResult(result)
    }

    override suspend fun deleteResul(result: ConversionResult) {
        dao.deleteResult(result)
    }

    override suspend fun deleteAllResult() {
        dao.deleteAll()
    }

    override fun getSavedResult(): Flow<List<ConversionResult>> {
     return  dao.getResult()
    }
}