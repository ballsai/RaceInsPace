package com.ballsai.mygdx.game;

public class World {
	private Player player;
	private Cars car;
    World(RaceInSpaceGame raceinspaceGame) {
        player = new Player(70,300);
        car = new Cars(20,200);
    }
 
    Player getPlayer() {
        return player;
    }
    
    Cars getCar() {
        return car;
    }

	
}
