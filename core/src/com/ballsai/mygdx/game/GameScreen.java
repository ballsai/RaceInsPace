package com.ballsai.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
public class GameScreen extends ScreenAdapter{
	World world;
	WorldRenderer worldRenderer;
    private boolean GameOver;
  
	GameScreen(RaceInSpaceGame raceinspaceGame) {
       world = new World(raceinspaceGame);
       worldRenderer = new WorldRenderer(raceinspaceGame, world);
       GameOver = false;
     
      }
	    public void render (float delta) {
    	update(delta);
    	Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        worldRenderer.render(delta);
   
    }
  
    private void update(float delta) {

    	if(!GameOver) {
    	/*if(Gdx.input.isKeyPressed(Keys.UP)) {
            world.getCar().move(Cars.DIRECTION_DOWN);
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
    	
    	if(world.getPlayer().getPosition().x<=150) {
    		world.getPlayer().getPosition().x=150;
    	}
    	if(world.getPlayer().getPosition().x>=450) {
    		world.getPlayer().getPosition().x=450;
    	}
    	
	    if(world.getCar().getPosition().y<=300 && world.getCar().getPosition().y>-100 )
	    	world.getCar().move(Cars.DIRECTION_DOWN);
	    else{
	    	world.getCar().getPosition().y =300;
	    	}
	    if(world.getCarLeft().getPosition().y<=300 && world.getCarLeft().getPosition().y>-100 )
	    	world.getCarLeft().move(Cars.DIRECTION_DOWN);
	    else{
	    	world.getCarLeft().getPosition().y =300;
	    	}
	    	
	    /*if(Math.abs(world.getCar().getPosition().y-world.getPlayer().getPosition().y)<=30 &&  // Collsion
	    		Math.abs(world.getCar().getPosition().x-world.getPlayer().getPosition().x)<100) {
	    	    world.getCar().move(Cars.DIRECTION_UP);
	    	}*/
	    if(Math.abs(world.getCarLeft().getPosition().y-world.getPlayer().getPosition().y)<=60 &&  // Collsion
	    		Math.abs(world.getCarLeft().getPosition().x-world.getPlayer().getPosition().x)<100) {
	    	    world.getCarLeft().move(Cars.DIRECTION_UP);
	    	}
    	}
           
    }
    
    	
       
    }
    
    
