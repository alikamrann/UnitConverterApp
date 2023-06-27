package com.example.unitconverterapp.compose.converter


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.unitconverterapp.ConverterViewModel
import com.example.unitconverterapp.ConverterViewModelFactory
import com.example.unitconverterapp.compose.HistoryScreen
import com.example.unitconverterapp.compose.TopScreen

@Composable
fun BaseScreen(
    factory : ConverterViewModelFactory,
    modifier: Modifier = Modifier,
    converterViewModel: ConverterViewModel = viewModel(factory = factory)
){
    val list = converterViewModel.getConvertions()
    Column(modifier = modifier.padding(30.dp)) {

        TopScreen(list){message1,message2->

                converterViewModel.addResult(message1, message2)

        }
        Spacer(modifier = Modifier.height(20.dp))
        HistoryScreen()
    }
}