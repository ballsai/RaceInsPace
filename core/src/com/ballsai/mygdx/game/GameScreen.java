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
    private Texture newcarImg;
    private Texture bgImg;
    private Texture wayImg;
    private int x;
	private int y;
	
	 
    public GameScreen(RaceInSpaceGame raceinspaceGame) {
        this.raceinspaceGame = raceinspaceGame;
        carImg = new Texture("car.png");
        newcarImg = new Texture("new_car.png");
        bgImg = new Texture("bg.jpg");
        wayImg = new Texture("way.png");
        x = 100;
        y = 100;
    }
    
  
    
    public void render (float delta) {
    	 update(delta);
    	Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        SpriteBatch batch = raceinspaceGame.batch;
         batch.begin();
         batch.draw(bgImg, 0 , 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
         batch.draw(wayImg, 300, 0);
         batch.draw(carImg, x, y);
         batch.draw(newcarImg,200,200);
         
         batch.end();
    }
    private void update(float delta) {
    	if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            x -= 10;
            
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