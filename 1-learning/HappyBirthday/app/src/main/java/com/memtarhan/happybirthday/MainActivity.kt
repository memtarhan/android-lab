package com.memtarhan.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.memtarhan.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithImage(message = "Happy Birthday!", from = "- from Mehmet")
                }
            }
        }
    }
}

// NOTES:
/*
The three basic, standard layout elements in Compose are Column, Row, and Box composables

Column, Row, and Box are composable functions that take composable content as arguments,
so you can place items inside these layout elements. For example,
each child element inside a Row composable is placed horizontally next to each other in a row.

Box layout is one of the standard layout elements in Compose.
Use Box layout to stack elements on top of one another.
Box layout also lets you configure the specific alignment of the elements that it contains.
 */

@Composable
fun RowExample() {
    Row {
        Text("1")
        Text("2")
        Text("3")

    }
}

@Composable
fun ColumnExample() {
    Column {
        Text("1")
        Text("2")
        Text("3")

    }
}


@Composable
fun BirthdayGreetingWithText(
    message: String,
    from: String,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = message, fontSize = 36.sp, modifier = Modifier.padding(top = 16.dp))
        Text(text = from, fontSize = 24.sp, modifier = Modifier.padding(top = 16.dp))
    }


}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)

    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }

    BirthdayGreetingWithText(message = message, from = from)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HappyBirthdayTheme {
//        BirthdayGreetingWithText(message = "Happy Birthday!", from = "- from Mehmet")
        BirthdayGreetingWithImage(message = "Happy Birthday!", from = "- from Mehmet")
//        RowExample()
//        ColumnExample()
    }
}