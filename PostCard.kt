package com.example.myapplicationcard


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun PostCard(postData: PostData) {
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                ProfileSection(postData)
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    painter = painterResource(id = R.drawable.flag),
                    contentDescription = "Flag Icon",
                    tint = Color.Red,
                    modifier = Modifier.size(20.dp)
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            EventDetails(postData)
            Spacer(modifier = Modifier.height(8.dp))
            AdditionalInfo(postData)
        }
    }
}



@Composable
fun ProfileSection(postData: PostData) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = postData.profileImage),
            contentDescription = "Profile Image",
            modifier = Modifier
                .size(40.dp)
                .padding(end = 8.dp)
        )
        Column {
            Text(
                text = postData.userName,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.Black
            )
            Text(
                text = postData.userEmail,
                color = Color.DarkGray,
                fontSize = 12.sp
            )
        }
    }
}

@Composable
fun EventDetails(postData: PostData) {
    Text(
        text = postData.eventTitle,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        color = Color.Black
    )
    Spacer(modifier = Modifier.height(4.dp))
    Text(
        text = postData.eventDescription,
        fontSize = 13.sp,
        color = Color.Black
    )
}

@Composable
fun AdditionalInfo(postData: PostData) {
    Row(
        modifier = Modifier.fillMaxWidth(),

        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = postData.eventTime,
            fontSize = 13.sp,
            color = Color.Black,
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = postData.additionalInfo,
            fontSize = 13.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.width(20.dp))
        Icon(
            painter = painterResource(id = R.drawable.attached),
            contentDescription = "Refresh Icon",
            tint = Color.Black,
            modifier = Modifier.size(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PostCardPreview() {
    val postData = PostData(
        profileImage = R.drawable.cat1,
        userName = "Meow",
        userEmail = "l226824@lhr.nu.edu.pk",
        eventTitle = "Anime Watch Party",
        eventDescription = "Watching Haikyu in CS13\nMaray lea bhi koi Snacks pakr lana",
        eventTime = "3:30 - 4:50",
        additionalInfo = "Jitnay zyada utna acha"
    )
   MaterialTheme {
        PostCard(postData = postData)
   }
}
