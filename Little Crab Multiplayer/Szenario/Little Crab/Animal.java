import greenfoot.*;

import java.util.List;
import java.util.ArrayList;

/**
 * Die Animal Klasse ist die Basisklasse für alle Tiere.
 * Die Animal Klasse ermöglicht, dass die Tiere sich bewegen und drehen können.
 * 
 * @author Michael Kolling
 * @version 1.0
 */
public class Animal extends Actor
{
    private static final double WALKING_SPEED = 5.0;
    
    public Animal(){
    }
    
    public void act(){
    }
    
    public void turn(int angle){
        setRotation(getRotation() + angle);
    }
    
    public void move(){
        double angle = Math.toRadians(getRotation());
        int x = (int) Math.round(getX() + Math.cos(angle) * WALKING_SPEED);
        int y = (int) Math.round(getY() + Math.sin(angle) * WALKING_SPEED);
        
        setLocation(x,y);
    }
    
    public boolean atWorldEdge(){
        if (getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if (getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
    
    public boolean canSee(Class clss){
        Actor actor = getOneObjectAtOffset(0,0,clss);
        return actor != null;
    }
    
    public void eat(Class clss){
        Actor actor = getOneObjectAtOffset(0,0, clss);
        if (actor != null) {
            getWorld().removeObject(actor);
        }
    }
}
