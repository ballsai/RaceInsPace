package com.ballsai.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ballsai.mygdx.game.RaceInSpaceGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = RaceInSpaceGame.WIDTH;
        config.height = RaceInSpaceGame.HEIGHT;
		new LwjglApplication(new RaceInSpaceGame(), config);
	}
}
