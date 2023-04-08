package app.manoir.shoppingtools

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.manoir.shoppingtools.ui.theme.ShoppingToolsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            ShoppingToolsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.primaryVariant
                ) {
                    DoMainLayout("Android")
                }
            }
        }
    }
}

@Composable
fun DoMainLayout(name: String) {
    MaterialTheme {
        Column {
            Text(text = "Hello $name!")
            Button(onClick = {

            }) {Text("Like") }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ShoppingToolsTheme {
        DoMainLayout("Android")
    }
}