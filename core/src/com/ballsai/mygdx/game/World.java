package com.ballsai.mygdx.game;

public class World {
	private Player player;
	private Cars car;
    World(RaceInSpaceGame raceinspaceGame) {
        player = new Player(300,68);
        car = new Cars(300,200);
    }
 
    Player getPlayer() {
        return player;
    }
    
    Cars getCar() {
        return car;
    }

	
}
