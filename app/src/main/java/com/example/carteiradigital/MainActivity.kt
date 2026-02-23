package com.example.carteiradigital

import android.R.attr.fontWeight
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.carteiradigital.ui.theme.CarteiraDigitalTheme
import com.rafaelcosta.myapplication.QrCode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteiraDigitalTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding -> CarteiraDigital(
                    Modifier.padding(paddingValues = innerPadding)
                )


                }

            }
        }
    }
    @Composable
    fun CarteiraDigital(modifier: Modifier = Modifier){
        Column(modifier = modifier) {
            Image(
                painter = painterResource(id = R.drawable.senai),
                contentDescription = "logo senai",
                modifier = Modifier.size(400.dp)

            )

            Image(
                painter = painterResource(id = R.drawable.perfil),
                contentDescription = "foto de perfil",
            )

            Row() {
                Text(text = "Nome: ",
                fontWeight = FontWeight.Bold)
                Text(text = "Jamily Alecrim")

            }

            Row() {
                Text(text = "Turma: ",
                    fontWeight = FontWeight.Bold)
                Text(text = "3DEVMA ")

            }

            QrCode( "90000000001417170883"

            )

        }
    }
}



