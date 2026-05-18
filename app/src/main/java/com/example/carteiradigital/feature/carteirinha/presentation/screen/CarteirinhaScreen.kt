package com.example.carteiradigital.feature.carteirinha.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CarteirinhaScreen(
    modifier: Modifier = Modifier
) {
    CarteirinhaContent(
        qrCodeContent = "90000000001417170883",
        modifier = modifier
    )
}