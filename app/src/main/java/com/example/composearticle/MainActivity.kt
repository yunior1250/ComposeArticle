package com.example.composearticle

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modfifier = Modifier.padding(innerPadding)
//                    )
//
//
//                }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    ArticleContent(
                           message1 = stringResource(R.string.message1),
                            message2 = stringResource(R.string.message2),
                            message3 = stringResource(R.string.message3),
                           // modifier = Modifier.padding(8.dp)


                    )


                }
            }
        }
    }
}
@Composable
fun ArticleContent( message1: String,message2: String, message3: String, modifier: Modifier = Modifier) {
   // val image = painterResource(R.drawable.bg_compose_background)
    Column (modifier = modifier) {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = "Compose background",


          //  contentScale = ContentScale.Crop
        )

        Text(
            text = stringResource(R.string.message1),
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = stringResource(R.string.message2),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify

        )
        Text(
            text = stringResource(R.string.message3),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )


    }



}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
       ArticleContent(
              message1 = stringResource(R.string.message1),
              message2 = stringResource(R.string.message2),
              message3 = stringResource(R.string.message3),
              modifier = Modifier.padding(8.dp)
       )
    }
}