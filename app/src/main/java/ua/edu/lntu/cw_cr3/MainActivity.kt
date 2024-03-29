package ua.edu.lntu.cw_cr3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,) {
        Text(
            text = "30 Days of Wellenss",
            fontSize = 30.sp,
        )
        LazyColumn(
            contentPadding = PaddingValues(10.dp),
            content = {
                item {
                    item1()
                    Spacer(modifier = Modifier.height(20.dp))
                    item2()
                    Spacer(modifier = Modifier.height(20.dp))
                    item3()
                }
            }
        )
    }
}

@Composable
fun item1 () {
    Column (modifier = Modifier
            .background(Color.Gray)
            .clip(shape = RoundedCornerShape(6.dp))
            .padding(15.dp)
    )

    {

        Text(
            text = "day 1",
            fontSize = 20.sp
            )
        Text(
            text = "Spend 15 minutes outdoors",
            fontSize = 20.sp
        )

        Image(painter = painterResource(R.drawable.flowers1),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
        )
        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. "
        )
    }
    
}

@Composable
fun item2 () {
    Column (modifier = Modifier
        .background(Color.Gray)
        .clip(shape = RoundedCornerShape(6.dp))
        .padding(15.dp)
    ) {

        Text(
            text = "day 2",
            fontSize = 20.sp
        )
        Text(
            text = "Listen to a new podcast or audibook",
            fontSize = 20.sp
        )

        Image(painter = painterResource(R.drawable.flowers2),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
        )
    }

}

@Composable
fun item3 () {
    Column (modifier = Modifier
        .background(Color.Gray)
        .clip(shape = RoundedCornerShape(6.dp))
        .padding(15.dp)
    ) {

        Text(
            text = "day 3",
            fontSize = 20.sp
        )
        Text(
            text = "Mediatate fo at least 3 minutes",
            fontSize = 20.sp
        )

        Image(painter = painterResource(R.drawable.flowers1),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
        )
    }

}