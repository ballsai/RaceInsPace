package com.ballsai.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;


public class GameScreen extends ScreenAdapter{
	World world;
	WorldRenderer worldRenderer;
	
	
	 
    public GameScreen(RaceInSpaceGame raceinspaceGame) {
        world = new World(raceinspaceGame);
        worldRenderer = new WorldRenderer(raceinspaceGame, world);
       
    }
    
    public void render (float delta) {
    	update(delta);
    	Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        worldRenderer.render(delta);
        
    }
    private void update(float delta) {
    	/*if(Gdx.input.isKeyPressed(Keys.UP)) {
            world.getPlayer().move(Player.DIRECTION_UP);
    	 }*/
    	if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
    		world.getPlayer().move(Player.DIRECTION_RIGHT);
        }
    	/*if(Gdx.input.isKeyPressed(Keys.DOWN)) {
    		world.getPlayer().move(Player.DIRECTION_DOWN);
        }*/
    	if(Gdx.input.isKeyPressed(Keys.LEFT)) {
    		world.getPlayer().move(Player.DIRECTION_LEFT);
        }
       
    }
    
    
}