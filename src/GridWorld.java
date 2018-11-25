import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	
	public static void main(String[] args) {
		
	World world = new World();
	world.show();
	
	Bug b1 = new Bug();
	Bug b2 = new Bug();
	b2.setColor(Color.blue);
	b2.turn();
	b2.turn();
	
	Flower flo = new Flower();
	Flower wer = new Flower();
	Flower fl = new Flower();
	Flower ow = new Flower();
	Flower er = new Flower();
	
	Location loc = new Location(5,5);
	Random ran = new Random();
	int bb;
	int cc;
	bb = ran.nextInt(10);
	cc = ran.nextInt(10);
	Location ati = new Location(bb,cc);
	Location rig = new Location(bb,cc-1);
	Location lef = new Location(bb,cc+1);
	Location f = new Location(bb+1,cc);
	Location o = new Location(bb-1,cc);
	Location e = new Location(bb+1,cc-1);
	
	world.add(loc, b1);
	world.add(ati, b2);
	world.add(rig, flo);
	world.add(lef, wer);
	world.add(f, fl);
	world.add(o, ow);
	world.add(e, er);
	}
}
