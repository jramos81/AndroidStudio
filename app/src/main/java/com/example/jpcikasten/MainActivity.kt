package com.example.jpcikasten

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jpcikasten.ui.theme.JPCIkastenTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

                    Botoia(
                        name = "Joseba"
                    )
                }
            }
        }


@Composable
fun Agurra(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        style= TextStyle(
            fontSize = 24.sp,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
            color = Color.Blue,
        )
        

    )
}
@Composable
fun Irudia(){
    val irudia = painterResource(R.drawable.ic_launcher_foreground)
    Image(
        painter = irudia,
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}
@Composable
fun Botoia(name: String, modifier: Modifier = Modifier){
    val Klikatuta = remember{ mutableStateOf(true) }
    Button(onClick = { Klikatuta.value = !Klikatuta.value }) {
        Agurra(if(Klikatuta.value) "Joseba" else "Ander")
        Irudia()

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  
        Botoia("Joseba")

}