package com.example.carteiradigital

import android.R.attr.fontWeight
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
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
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CarteiraDigital(
                        modifier = Modifier.padding(paddingValues = innerPadding).fillMaxSize()
                    )


                }

            }
        }
    }

    @Composable
    fun CarteiraDigital(modifier: Modifier = Modifier) {

        Box() {
            Image(
                painter = painterResource(id = R.drawable.wapp),
                contentDescription = "wallpapper",
                modifier = Modifier.fillMaxSize().alpha(.4f)
            )

            Column(
                modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    painter = painterResource(id = R.drawable.senai),
                    contentDescription = "logo senai",
                    modifier = Modifier.weight(2f).padding(horizontal = 20.dp)

                )

                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "foto de perfil",
                    modifier = Modifier.weight(2f).clip(CircleShape).aspectRatio(1f)
                )

                Row(modifier = Modifier.weight(.2f)) {
                    Text(
                        text = "Nome: ",
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Jamily Alecrim")


                }

                Row(modifier = Modifier.weight(.3f)) {
                    Text(
                        text = "Turma: ",
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "3DEVMA ")

                }

                QrCode(
                    "90000000001417170883",
                    modifier = Modifier.weight(2f)

                )

            }
        }
    }
}



