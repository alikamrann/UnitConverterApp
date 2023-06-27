package com.example.unitconverterapp.compose
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.unitconverterapp.ConverterViewModel
import com.example.unitconverterapp.HistoryScreen
import com.example.unitconverterapp.TopScreen

@Composable
fun BaseScreen(
    modifier: Modifier = Modifier,
    converterViewModel: ConverterViewModel = viewModel()
){
    val list = converterViewModel.getConvertions()
    Column(modifier = modifier.padding(30.dp)) {

        TopScreen(list)
        Spacer(modifier = Modifier.height(20.dp))
        HistoryScreen()
    }
}