package com.example.myapplicationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme { // Or use YourAppTheme if you created a custom theme
                //Display PostCard
                val postData = PostData(
                    profileImage = R.drawable.cat1,
                    userName = "Meow",
                    userEmail = "l226824@lhr.nu.edu.pk",
                    eventTitle = "Anime Watch Party",
                    eventDescription = "Watching Haikyu in CS13\nMaray lea bhi koi Snacks pakr lana",
                    eventTime = "3:30 - 4:50",
                    additionalInfo = "Jitnay zyada utna acha"
                )
                Surface(color = MaterialTheme.colorScheme.background) {
                   // PostCard(postData = postData)
                    ReportDialog1()
                }
            }
        }
    }
}
