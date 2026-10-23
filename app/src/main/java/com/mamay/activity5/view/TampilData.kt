package com.mamay.activity5.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick: () -> Unit
){
    val items = listOf(
        Pair(stringResource(id = R.string.namaLengkap), "Contoh Nama"),
        Pair(stringResource(id = R.string.jenisKelamin), "lainnya"),
        Pair(stringResource(id = R.string.alamat), "Contoh Alamat")
    )
}