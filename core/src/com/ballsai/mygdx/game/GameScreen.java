package com.ballsai.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.MathUtils;

public class GameScreen extends ScreenAdapter{
	World world;
	WorldRenderer worldRenderer;
    int n;
   
	GameScreen(RaceInSpaceGame raceinspaceGame) {
       world = new World(raceinspaceGame);
       worldRenderer = new WorldRenderer(raceinspaceGame, world);
      }
	    public void render (float delta) {
    	update(delta);
    	Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        worldRenderer.render(delta);
   
    }
  
    /**
     * @param delta
     */
    private void update(float delta) {

    	if(!world.gameOver()) {
    	if(Gdx.input.isKeyPressed(Keys.SPACE)) {
    		world.getPlayer().getPosition().y = 136;
    	}
    	else
    		world.getPlayer().getPosition().y = 68;
    		
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
    	
	    if(world.getCar().getPosition().y<=300 && world.getCar().getPosition().y>-100 &&
	    		world.getCarLeft().getPosition().y<=300 && world.getCarLeft().getPosition().y>-100 &&
	    		world.getCarRight().getPosition().y<=300 && world.getCarRight().getPosition().y>-100) {
    	
	    	world.getCar().move(Cars.DIRECTION_DOWN);
	   
	    	world.getCarLeft().move(Cars.DIRECTION_DOWN);
	   
	    	world.getCarRight().move(Cars.DIRECTION_DOWN);
	    }
	    else {
	    	world.getCar().getPosition().y =300;
	    	world.getCarLeft().getPosition().y =300;
	    	world.getCarRight().getPosition().y = 300;
	    	world.Random();
	    	world.increaseScore();
	    	}
	    	
	    if((world.getCar().getPosition().y-world.getPlayer().getPosition().y)<30 &&
	       (world.getCar().getPosition().y-world.getPlayer().getPosition().y)>25 &&
	    	Math.abs(world.getCar().getPosition().x-world.getPlayer().getPosition().x )<68 &&
	    	!Gdx.input.isKeyPressed(Keys.SPACE)) {
	       world.getCar().getPosition().y =300;
	       world.Over();
	    }
	    
	    /*if((world.getCarLeft().getPosition().y-world.getPlayer().getPosition().y)<30 &&
	 	       (world.getCarLeft().getPosition().y-world.getPlayer().getPosition().y)>25 &&
	 	    	Math.abs(0.8*world.getCarLeft().getPosition().y+60-world.getPlayer().getPosition().x )<50 &&
	 	    	!Gdx.input.isKeyPressed(Keys.SPACE)) {
	 	       world.getCarLeft().getPosition().y =300;
	 	       world.Over();
	 	    }*/
	    
	    
	    
	    
            
    }
  }
    
}
    
    	
       
    
    

    
    
