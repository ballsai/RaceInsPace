package com.ballsai.mygdx.game;

import com.badlogic.gdx.graphics.Texture;


import com.badlogic.gdx.graphics.g2d.BitmapFont;
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
    GameScreen game;
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
       
	    
        if(world.getRandom()==1) {
	        	batch.draw(carImg,(float) (pos.x-CAR_X/2+(RATIO*(pos.y-CAR_Y)/F)/2), pos.y,
	  	    	      (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));
	        }
	        else if(world.getRandom()==2){
	        	batch.draw(carImg,(float) (0.8*posLeft.y+60) , posLeft.y,
	  	    	      (float) (CAR_X-RATIO*((posLeft.y-CAR_Y)/F)),(float) (CAR_Y-(posLeft.y-CAR_Y)/F));
	        }
	        else if(world.getRandom()==3) {
	        	 batch.draw(carImg,(float) (-0.38*posRight.y+410) , posRight.y,
	   	    	      (float) (CAR_X-RATIO*((posRight.y-CAR_Y)/F)),(float) (CAR_Y-(posRight.y-CAR_Y)/F));
	        }
	        else if(world.getRandom()==4) {
	        	/*batch.draw(carImg,(float) (pos.x-CAR_X/2+(RATIO*(pos.y-CAR_Y)/F)/2), pos.y,
	  	    	      (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));*/
	            batch.draw(carImg,(float) (0.8*posLeft.y+60) , posLeft.y,
	  	    	      (float) (CAR_X-RATIO*((posLeft.y-CAR_Y)/F)),(float) (CAR_Y-(posLeft.y-CAR_Y)/F));
	        }
	        else if(world.getRandom()==5){
	        	/* batch.draw(carImg,(float) (pos.x-CAR_X/2+(RATIO*(pos.y-CAR_Y)/F)/2), pos.y,
	  	    	      (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));*/
	        	 batch.draw(carImg,(float) (-0.38*posRight.y+410) , posRight.y,
	   	    	      (float) (CAR_X-RATIO*((posRight.y-CAR_Y)/F)),(float) (CAR_Y-(posRight.y-CAR_Y)/F));
	        }
	        else if(world.getRandom()==6) {
	        	batch.draw(carImg,(float) (0.8*posLeft.y+60) , posLeft.y,
	  	    	      (float) (CAR_X-RATIO*((posLeft.y-CAR_Y)/F)),(float) (CAR_Y-(posLeft.y-CAR_Y)/F));
	        	 batch.draw(carImg,(float) (-0.38*posRight.y+410) , posRight.y,
	   	    	      (float) (CAR_X-RATIO*((posRight.y-CAR_Y)/F)),(float) (CAR_Y-(posRight.y-CAR_Y)/F));
	        }
	        else if(world.getRandom()==7) {
	       /* batch.draw(carImg,(float) (pos.x-CAR_X/2+(RATIO*(pos.y-CAR_Y)/F)/2), pos.y,
		    	      (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));*/
	        batch.draw(carImg,(float) (0.8*posLeft.y+60) , posLeft.y,
		    	      (float) (CAR_X-RATIO*((posLeft.y-CAR_Y)/F)),(float) (CAR_Y-(posLeft.y-CAR_Y)/F));
	        batch.draw(carImg,(float) (-0.38*posRight.y+410) , posRight.y,
		    	      (float) (CAR_X-RATIO*((posRight.y-CAR_Y)/F)),(float) (CAR_Y-(posRight.y-CAR_Y)/F));
	        }
        
        batch.draw(carImg,(float) (pos.x-CAR_X/2+(RATIO*(pos.y-CAR_Y)/F)/2), pos.y,
	    	      (float) (CAR_X-RATIO*((pos.y-CAR_Y)/F)),(float) (CAR_Y-(pos.y-CAR_Y)/F));
        
       /* batch.draw(carImg,(float) (0.8*posLeft.y+60) , posLeft.y,
	    	      (float) (CAR_X-RATIO*((posLeft.y-CAR_Y)/F)),(float) (CAR_Y-(posLeft.y-CAR_Y)/F));*/
        
        
        batch.draw(carImg,player_pos.x-CAR_X/2,player_pos.y,CAR_X,CAR_Y);
        font.draw(batch, "ENERGY:" + world.getEnergy(),350,390); // Energy
        font.draw(batch, "SCORE: " + world.getScore(), 450, 390); // Score
        
        batch.end();
       
	}
}
	