package com.jihad.chatviewer.ui.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jihad.chatviewer.ui.screens.SetupScreen
import com.jihad.chatviewer.ui.screens.ChatListScreen
@Composable
fun AppNavGraph(navController: NavHostController, startDestination: String = Screen.Setup.route) {
  NavHost(navController = navController, startDestination = startDestination) {
    composable(Screen.Setup.route) { SetupScreen(onImportFinished = { }) }
    composable(Screen.ChatList.route) { ChatListScreen(onChatClick = {}, onSearchClick = {}, onSavedClick = {}, onSettingsClick = {}) }
  }
}
