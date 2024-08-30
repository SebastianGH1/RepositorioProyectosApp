package com.utc.repositorios.design

import android.widget.Toolbar
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.statusBarsIgnoringVisibility
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.utc.repositorios.R

@Preview
@Composable
fun ToolbarPreview(){
    Toolbar(){

    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun Toolbar(onClick:()->Unit){
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(Color(0xFFFF9900))
        .height(64.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween) {
        IconButton(onClick = {
            onClick.invoke()
        }) {
            Icon(imageVector = Icons.Filled.Menu, contentDescription =null )
        }
        Text(text = "Sebastian")
        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription =null )

    }

}