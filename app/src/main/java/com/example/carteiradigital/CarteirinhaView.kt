package com.example.carteiradigital

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rafaelcosta.myapplication.QrCode

@Composable
fun CarteirinhaView(modifier: Modifier = Modifier) {

    Box() {
        Image(
            painter = painterResource(id = R.drawable.miata),
            contentDescription = "wallpapper",
            modifier = Modifier
                .fillMaxSize()
                .alpha(.4f),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.senai),
                contentDescription = "logo senai",
                modifier = Modifier
                    .weight(2f)
                    .padding(horizontal = 20.dp)

            )

            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "foto de perfil",
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                LabelText(
                    label ="Nome: ",
                    modifier = Modifier.weight(1f)
                )

                ValueText(
                    value = "Jamily Alecrim",
                    modifier = Modifier.weight(4f)
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically

            ) {

                LabelText(
                    label ="Curso: ",
                    modifier = Modifier.weight(1f)
                )

                ValueText(
                    value = "Desenvolvimento de Sistemas",
                    modifier = Modifier.weight(4f),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Normal
                ) }

            Spacer(
                modifier = Modifier
                    .weight(.2f)
            )


            QrCode(
                "90000000001417170883",
                modifier = Modifier
                    .weight(2f)
                    .fillMaxSize(.4f)
                    .clip(RoundedCornerShape(6.dp))

            )

            Spacer(
                modifier = Modifier
                    .weight(.4f)
            )
        }
    }



}


