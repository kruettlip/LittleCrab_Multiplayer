import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.awt.Font;
/**
 * Hummer
 * 
 * Version: 2
 */

public class Lobster extends Animal
{
    /**
     * Act Methode
     */
    
    /**
     * Hier werden die Methoden aufgerufen.
     */
    public void act()
    {
        move();
        turnAtEdge();
        randomTurn();
        lookForCrab();
    }
    /**
     * Hier wird das zuf�llige Drehen bestimmt.
     */
    public void randomTurn()
    {
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
    /**
     * Hier wird definiert, dass sich der Lobster an der Wand dreht.
     */
    public void turnAtEdge()
    {
        if (atWorldEdge())
            turn(17);
    }
    /**
     * Hier wird definiert, dass der Lobster den Crab isst und danach das Spiel fertig ist.
     */
    public void lookForCrab()
    { 
        if (canSee(Crab.class))
        {
            eat(Crab.class);
            CrabWorld crabworld = (CrabWorld) getWorld();
            crabworld.text_looser.updateImage();
            Greenfoot.stop();
        }
    }
}
