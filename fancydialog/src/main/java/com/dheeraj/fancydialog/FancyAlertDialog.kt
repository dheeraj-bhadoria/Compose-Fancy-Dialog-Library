import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FancyAlertDialog(
    title: String,
    backgroundColor: Color,
    message: String,
    negativeBtnText: String,
    positiveBtnBackground: Color,
    positiveBtnText: String,
    negativeBtnBackground: Color,
    onPositiveClicked: () -> Unit,
    onNegativeClicked: () -> Unit
) {
    AlertDialog(
        onDismissRequest = { /* Handle dialog dismiss */ },
        backgroundColor = backgroundColor,
        title = {
            Text(
                text = title,
                color = Color.White,
                style = MaterialTheme.typography.h6
            )
        },
        text = {
            Text(
                text = message,
                color = Color.White,
                style = MaterialTheme.typography.body1
            )
        },
        buttons = {

            Row( modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = onNegativeClicked,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = negativeBtnBackground
                    )
                ) {
                    Text(
                        text = negativeBtnText,
                        color = Color.White
                    )
                }
                Button(
                    onClick = onPositiveClicked,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = positiveBtnBackground
                    )
                ) {
                    Text(
                        text = positiveBtnText,
                        color = Color.White
                    )
                }
            }

        }
    )
}