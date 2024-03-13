package ua.edu.lntu.cw_cr3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ua.edu.lntu.cw_cr3.ui.theme.IPZ_CW_CR3_Syshchuk_VladislavTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CW_CR3_Syshchuk_VladislavTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainWindow()
                }
            }
        }
    }
}

@Composable
fun MainWindow() {
    
    item1()
    item2()
    item3()
}

@Composable
fun item1 () {
    Column {

        Text(
            text = "30 Days of Wellenss",
            fontSize = 30.sp,
        )
        Text(text = "day 1")
        Text(text = "Spend 15 minutes outdoors" )

        Image(painter = painterResource(R.drawable.flowers1),
            contentDescription = null,
            modifier = Modifier
                .size(500.dp)
        )
        Text(
            text = "pudge "
        )
    }
    
}

@Composable
fun item2 () {
    Column {

        Text(
            text = "30 Days of Wellenss",
            fontSize = 30.sp,
        )
        Text(text = "day 1")
        Text(text = "Spend 15 minutes outdoors" )

        Image(painter = painterResource(R.drawable.flowers2),
            contentDescription = null,
            modifier = Modifier
                .size(500.dp)
        )
        Text(
            text = "pudge "
        )
    }

}

@Composable
fun item3 () {
    Column {

        Text(
            text = "30 Days of Wellenss",
            fontSize = 30.sp,
        )
        Text(text = "day 1")
        Text(text = "Spend 15 minutes outdoors" )

        Image(painter = painterResource(R.drawable.flowers1),
            contentDescription = null,
            modifier = Modifier
                .size(500.dp)
        )
        Text(
            text = "pudge "
        )
    }

}