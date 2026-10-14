package com.jihad.chatviewer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.jihad.chatviewer.ui.scaffold.MainScaffold
import com.jihad.chatviewer.ui.navigation.AppNavGraph
import com.jihad.chatviewer.ui.theme.ChatViewerTheme
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ChatViewerTheme {
        Surface(modifier = Modifier) {
          val navController = rememberNavController()
          MainScaffold(navController = navController) { AppNavGraph(navController = navController) }
        }
      }
    }
  }
}
