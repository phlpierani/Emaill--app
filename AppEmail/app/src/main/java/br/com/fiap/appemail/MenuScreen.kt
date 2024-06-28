package br.com.fiap.appemail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MenuScreen() {
    Box(
        modifier = Modifier.fillMaxSize() //ocupa todo o tamanho dela a box

    ) {
        Column( //dentro do box tem essa coluna (coluna principal), que contem mais duas colunas
            modifier = Modifier
                .fillMaxWidth()
        ) {
            // ---- header ---------
            Column(
                horizontalAlignment = Alignment.CenterHorizontally, //a imagem esta no meio por conta dessa linha
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .background(colorResource(id = R.color.vermelho_fiap))
            ) {
            Row {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "MODO OFFLINE")
                    Icon(imageVector = Icons.Default.CheckCircle, contentDescription = "Marcado")
                }
                Spacer(modifier = Modifier.width(5.dp,))
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "MODO ONLINE")
                }
            }
                Spacer(modifier = Modifier.height(5.dp,))
                Image(
                    painter = painterResource(id = R.drawable.correspondencia),
                    contentDescription = "Imagem de uma carta",
                    modifier = Modifier
                        .size(60.dp,)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "COLDMAIN",
                    color = colorResource(id = R.color.cor_do_texto),
                    fontSize = 20.sp
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Spacer(modifier = Modifier.width(1.dp))
                Button(onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(5.dp,),
                    colors = ButtonDefaults.buttonColors(Color.Gray)
                ) {
                    Text(text = "CALENDARIO",
                        fontSize = 12.sp)
                    Icon(imageVector = Icons.Default.DateRange, contentDescription = "DATA")
                }
                Spacer(modifier = Modifier.width(1.dp))
                Button(onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(5.dp,),
                    colors = ButtonDefaults.buttonColors(Color.Gray)) {
                    Text(text = "ENVIADOS",
                        fontSize = 12.sp)
                    Icon(imageVector = Icons.Default.Send, contentDescription = "ENVIADO")
                }
                Spacer(modifier = Modifier.width(1.dp))
                Button(onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(5.dp,),
                    colors = ButtonDefaults.buttonColors(Color.Gray)) {
                    Text(text = "LIXEIRA",
                        fontSize = 13.sp)
                    Icon(imageVector = Icons.Default.Delete, contentDescription = "LIXEIRA")
                }
            }


            Column(
                Modifier.padding(horizontal = 5.dp,
                    vertical = 5.dp,)
            ) { Icon(imageVector = Icons.Default.Star, contentDescription = "Marcado",)
                Text(
                    text = "UBER",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "pedro, descubra sua próxima aventura",
                    fontSize = 17.sp,)

                Spacer(modifier = Modifier.height(25.dp,))
                Icon(imageVector = Icons.Default.Star, contentDescription = "Marcado")
                Text(
                    text = "NUBANK",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "PIX realizado, no valor de...",
                    fontSize = 17.sp,
                )
                Spacer(modifier = Modifier.height(25.dp,))
                Icon(imageVector = Icons.Default.Star, contentDescription = "Marcado")
                Text(
                    text = "CATHO",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "esta vaga tem muito a ver com você",
                    fontSize = 17.sp,
                )
                Spacer(modifier = Modifier.height(25.dp,))
                Icon(imageVector = Icons.Default.Star, contentDescription = "Marcado")
                Text(
                    text = "EMPOWER",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "Bolsa de R\$ 2,8 mil no Estágio Omni 2024",
                    fontSize = 17.sp,
                )
                Spacer(modifier = Modifier.height(25.dp,))
                Icon(imageVector = Icons.Default.Star, contentDescription = "Marcado")
                Text(
                    text = "OLX",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "Pedro, bora desapegar de novo? ",
                    fontSize = 17.sp,

                )
            }


        }
    }

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MenuScreenPreview() {
    MenuScreen()
}

