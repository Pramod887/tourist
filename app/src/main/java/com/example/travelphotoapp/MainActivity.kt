package com.example.travelphotoapp

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.travelphotoapp.ui.theme.TravelPhotoAppTheme

class MainActivity : ComponentActivity() {
    var currentimg=0
  lateinit  var image:ImageView
  var places= arrayOf("frontgate","MCA block","Hampi",  " mca ","SSM hall","temple")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val next=findViewById<ImageButton>(R.id.btnnext)
        val privous=findViewById<ImageButton>(R.id.btnprevious)
        val placename =findViewById<TextView>(R.id.textView3)


        next.setOnClickListener{
            var idcurrentimgString="pic$currentimg"

            var idcurrentImageInt=this.resources.getIdentifier(idcurrentimgString,"id",packageName)
            image =findViewById(idcurrentImageInt)
            image.alpha=0f

            currentimg=(6+currentimg+1)%6
            var idImagetoshowString="pic"+currentimg
            var idiImagetoshowInt=this.resources.getIdentifier(idImagetoshowString,"id",packageName)
            image =findViewById(idiImagetoshowInt)
            image.alpha=1f

            placename.text=places[currentimg]
        }
privous.setOnClickListener{
    var idcurrentimgString="pic$currentimg"

    var idcurrentImageInt=this.resources.getIdentifier(idcurrentimgString,"id",packageName)
    image =findViewById(idcurrentImageInt)
    image.alpha=0f

    currentimg=(6+currentimg-1)%6
    var idImagetoshowString="pic"+currentimg
    var idiImagetoshowInt=this.resources.getIdentifier(idImagetoshowString,"id",packageName)
    image =findViewById(idiImagetoshowInt)
    image.alpha=1f

}
    }
}

