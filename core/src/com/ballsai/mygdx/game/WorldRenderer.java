package com.ballsai.mygdx.game;


import com.badlogic.gdx.graphics.Texture;
import java.util.*;
import static java.lang.Math.abs;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.particles.influencers.ColorInfluencer.Random;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.TimeUtils;

public class WorldRenderer {
	public static final int CAR_X = 100; // Car size x-axis
	public static final int CAR_Y = 68; // Car size y-axis
	public static final double RATIO=1.471; // X/Y size
	public static final double F=3.5;
	public static final int x_axis=300;
	public static int n;
	private RaceInSpaceGame raceinspaceGame;
	private Texture carImg;
	private Texture roadImg;
    World world;
    GameScreen Game;
    private BitmapFont font;
    
	public WorldRenderer(RaceInSpaceGame raceinspaceGame, World world) {
     this.raceinspaceGame = raceinspaceGame;
	 this.world = world;
	 carImg = new Texture("car.png");
	 roadImg = new Texture("road.png");
	 font = new BitmapFont();
	
  }
	 
	public void render(float delta) {
		SpriteBatch batch = raceinspaceGame.batch;
	    
		
        batch.begin();
        Vector2 player_pos = world.getPlayer().getPosition();
        Vector2 pos = world.getCar().getPosition();
        Vector2 posLeft = world.getCarLeft().getPosition();
        Vector2 posRight = world.getCarRight().getPosition();
        batch.draw(roadImg,0,0,600,300);
        
        /*if((pos.y<=300 && pos.y >-100)) {
        	
        	if(n== 1) {
	    	batch.draw(carImg,(float) (pos.x-CAR_X/2+(RATIO*(pos.y-CAR_Y)/F)/2), pos.y,
	    	      (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));
	    	batch.draw(carImg,(float) (0.8*pos.y+60) , pos.y,
	    	      (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));
	    	batch.draw(carImg,(float) (-0.38*pos.y+410) , pos.y,
	    	      (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));
	    	}
	    	else if(n == 2){
	    		batch.draw(carImg,(float) (pos.x-CAR_X/2+(RATIO*(pos.y-CAR_Y)/F)/2), pos.y,
	  	    	      (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));
	  	    	batch.draw(carImg,(float) (0.8*pos.y+60) , pos.y,
	  	    	      (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));
	    	}
	    	else if(n == 3) {
	    		batch.draw(carImg,(float) (pos.x-CAR_X/2+(RATIO*(pos.y-CAR_Y)/F)/2), pos.y,
	  	    	      (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));
	    		batch.draw(carImg,(float) (-0.38*pos.y+410) , pos.y,
	  	    	      (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));
	    	}
	    	else if(n == 4) {
	    		batch.draw(carImg,(float) (0.8*pos.y+60) , pos.y,
	  	    	      (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));
	  	    	batch.draw(carImg,(float) (-0.38*pos.y+410) , pos.y,
	  	    	      (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));
	    	}
	    	
	    	pos.y -=MathUtils.random(2,10);
	    	
        }else{
        	pos.y =300;
        	
            n = MathUtils.random(1,4);
          }*/
       
        batch.draw(carImg,(float) (pos.x-CAR_X/2+(RATIO*(pos.y-CAR_Y)/F)/2), pos.y,
	    	      (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));
        batch.draw(carImg,(float) (0.8*posLeft.y+60) , posLeft.y,
	    	      (float) (CAR_X-RATIO*((posLeft.y-CAR_Y)/F)),(float) (CAR_Y-(posLeft.y-CAR_Y)/F));
        batch.draw(carImg,(float) (-0.38*posRight.y+410) , posRight.y,
	    	      (float) (CAR_X-RATIO*((posRight.y-CAR_Y)/F)),(float) (CAR_Y-(posRight.y-CAR_Y)/F));
      
        batch.draw(carImg,player_pos.x-CAR_X/2,player_pos.y,CAR_X,CAR_Y);
        font.draw(batch, "SCORE: " + world.getScore(), 450, 390);
        
        batch.end();
       
	}
}
	