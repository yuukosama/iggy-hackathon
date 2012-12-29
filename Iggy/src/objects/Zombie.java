/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import Utilities.Rect;
import Utilities.Vector2;
import java.util.ArrayList;
import java.util.LinkedList;
import world.Level;

/**
 *
 * @author Sam
 */
public class Zombie extends Enemy{
    private boolean grounded;
    public Zombie(Vector2 pos){
        super(new Animation("testzombie",1,"png"),pos);
        this.health=100;
    }

    @Override
    public void create() {
        this.grounded=false;
    }

    @Override
    public void step(Level level, Player player, LinkedList<GameObject> objects) {
        
    }

    
}

