package com.ballsai.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	public static final int CAR_X = 100; // Car size x-axis
	public static final int CAR_Y = 68; // Car size y-axis
	public static final double RATIO=1.471; // X/Y size
	public static final double F=3.5;
	private RaceInSpaceGame raceinspaceGame;
	private Texture carImg;
	private Texture roadImg;
	 
	 
	 World world;

	 public WorldRenderer(RaceInSpaceGame raceinspaceGame, World world) {
     this.raceinspaceGame = raceinspaceGame;
	 this.world = world;
	 carImg = new Texture("car.png");
	 roadImg = new Texture("road.png");
	
	}
	 
	public void render(float delta) {
		
		SpriteBatch batch = raceinspaceGame.batch;
        batch.begin();
        Vector2 player_pos = world.getPlayer().getPosition();
        Vector2 pos = world.getCar().getPosition();
        batch.draw(roadImg,0,0,600,300);
       
        
        if(pos.y<=290 && pos.y>0) {
        	
        		batch.draw(carImg,(float) (pos.x-CAR_X/2+(RATIO*(pos.y-CAR_Y)/F)/2), pos.y,
        		  (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));
        		batch.draw(carImg,(float) (0.8*pos.y+60) , pos.y,
        		  (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));
        	  batch.draw(carImg,(float) (-0.38*pos.y+410) , pos.y,
        		  (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));
        	   
        	  
        	  pos.y -= 500/pos.y;
        	
        }
        else
        	pos.y = 290;
        
        batch.draw(carImg,player_pos.x-CAR_X/2,player_pos.y,CAR_X,CAR_Y);
        batch.end();
	    }
}
	