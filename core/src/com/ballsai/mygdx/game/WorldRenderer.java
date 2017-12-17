package com.ballsai.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	 
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
        Vector2 pos = world.getPlayer().getPosition();
        Vector2 car_pos = world.getCar().getPosition();
        batch.draw(roadImg,0,0,600,300);
        if(pos.y<=300 && pos.y>0) {
        pos.y -= 3;
        batch.draw(carImg, (float) (0.9*pos.y+18), pos.y,(float)(3+(300-pos.y)*0.352),(float) (2.0+(300-pos.y)*0.25));
        batch.draw(carImg, (float) (0.4125*pos.y+168), pos.y,(float)(3+(300-pos.y)*0.352),(float) (2.0+(300-pos.y)*0.25));
        batch.draw(carImg, (float) (-0.1*pos.y+325), pos.y,(float)(3+(300-pos.y)*0.352),(float) (2.0+(300-pos.y)*0.25));
        batch.draw(carImg, (float) (-0.6*pos.y+480), pos.y,(float)(3+(300-pos.y)*0.352),(float) (2.0+(300-pos.y)*0.25));
        }
        else if(pos.y<=0){
        	pos.y=300;
        }
        batch.end();
	    }
}
	