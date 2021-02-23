package com.game.desktop

import com.badlogic.gdx.Application
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.game.Game

object DesktopLauncher {
    @JvmStatic
    fun main(arg: Array<String>) {
        val config = LwjglApplicationConfiguration().apply {
            title = "rpgGame"
            width = 1366
            height = 768
        }
        LwjglApplication(Game(), config).logLevel = Application.LOG_DEBUG
    }
}