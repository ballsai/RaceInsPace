package com.ballsai.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter{
	private RaceInSpaceGame raceinspaceGame;
	private Texture carImg;
	private int x;
	private int y;
	
	 
    public GameScreen(RaceInSpaceGame raceinspaceGame) {
        this.raceinspaceGame = raceinspaceGame;
        carImg = new Texture("car.png");
        x = 100;
        y = 100;
    }
    
    public void render (float delta) {
    	 update(delta);
    	Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    	 SpriteBatch batch = raceinspaceGame.batch;
         batch.begin();
         batch.draw(carImg, x, y);
         batch.end();
    }
    private void update(float delta) {
    	if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            x -= 10;
            y=100;
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            x += 10;
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN)) {
            y -= 10;
        }
        if(Gdx.input.isKeyPressed(Keys.UP)) {
            y += 10;
        }
    }
    
    
}