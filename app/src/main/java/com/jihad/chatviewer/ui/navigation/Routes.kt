package com.jihad.chatviewer.ui.navigation
sealed class Screen(val route: String) { object Setup : Screen("setup"); object ChatList : Screen("chat_list"); object Search : Screen("search"); object Saved : Screen("saved"); object Settings : Screen("settings"); object Chat : Screen("chat/{chatId}") { fun createRoute(chatId: String) = "chat/$chatId" } }
