package com.example.carteiradigital.feature.home.presentation.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.room.util.copy
import com.example.carteiradigital.core.designsystem.component.AppDrawerItem
import com.example.carteiradigital.core.designsystem.component.AppScaffold
import com.example.carteiradigital.core.designsystem.navigation.Routes
import com.example.carteiradigital.feature.home.HomeEvent
import com.example.carteiradigital.feature.home.HomeViewModel

@Composable
fun HomeScreen(
    usuarioNome: String,
    usuarioDescricao: String,
    drawerItems: List<AppDrawerItem>,
    onLogoutClick: () -> Unit,
    modifier: Modifier = Modifier,
    onCarteirinhaClick: () -> Unit,
    onUnidadesCurricularesClick: () -> Unit,
    viewModel: HomeViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    AppScaffold(
        title = "Início",
        subtitle = "Área do aluno",
        usuarioNome = usuarioNome,
        usuarioDescricao = usuarioDescricao,
        drawerItems = drawerItems,
        onLogoutClick = onLogoutClick
    ) { innerPadding ->
        HomeContent(
            uiState = uiState.copy(nomeAluno = usuarioNome),
            onEvent = { event ->
                viewModel.onEvent(event)
                when (event) {
                    HomeEvent.OnCarteirinhaClick -> onCarteirinhaClick()
                    HomeEvent.OnUnidadesCurricularesClick -> onUnidadesCurricularesClick()
                }
            },
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
        )
    }
}