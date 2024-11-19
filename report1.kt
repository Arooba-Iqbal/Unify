//This component contains both text.kt and button.kt and combines them  in a single component.
package com.example.myapplicationcard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReportDialog() {
    Column(
        modifier = Modifier
            .fillMaxWidth() // Ensures the dialog takes up full width
            .padding(16.dp)
            .background(Color(0xFF37474F), shape = RoundedCornerShape(8.dp))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Report:",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Custom TextField with placeholder text
        CustomTextField(placeholderText = "This profile is violating the app's rules")

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            CustomButton(
                text = "Confirm",
                color = Color(0xFF4CAF50),
                onClick = { /* Confirm action */ }
            )

            CustomButton(
                text = "Cancel",
                color = Color(0xFFF44336),
                onClick = { /* Cancel action */ }
            )
        }
    }
}
