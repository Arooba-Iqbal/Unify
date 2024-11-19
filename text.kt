//This text.kt contains code for text field of report post
package com.example.myapplicationcard
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
    placeholderText: String
) {
    // Remember the TextFieldValue state
    val textState = remember { mutableStateOf(TextFieldValue()) }

    TextField(
        value = textState.value,
        onValueChange = { textState.value = it },
        placeholder = {
            Text(
                text = placeholderText,
                style = TextStyle(
                    color = Color.Black, // Placeholder color
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp // Placeholder text size
                )
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.White, // White background for the text field
            focusedIndicatorColor = Color.Transparent, // Remove indicator color when focused
            unfocusedIndicatorColor = Color.Transparent, // Remove indicator color when unfocused
            focusedTextColor = Color.Black, // Text color when focused
            unfocusedTextColor = Color.Black, // Text color when unfocused
        ),
        textStyle = TextStyle(
            fontSize = 18.sp, // Increase text size inside the text field
            color = Color.Black // Text color inside the TextField
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.White, shape = RoundedCornerShape(8.dp)) // Apply rounded corners
    )
}
