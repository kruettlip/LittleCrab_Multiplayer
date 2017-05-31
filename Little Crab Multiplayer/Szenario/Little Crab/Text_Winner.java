import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
/**
 * Write a description of class Text_Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text_Winner extends Actor
{
    public Text_Winner()
    {
        GreenfootImage image = new GreenfootImage("crab.png");
        image.clear();
        setImage(image);
    }

    /**
     * Act - do whatever the Text_Winner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }
    
    public void updateImage()
    {
        GreenfootImage img = new GreenfootImage (300, 100);
        Font font = img.getFont();
        img.setFont(font.deriveFont(45.0F));
        img.setColor(java.awt.Color.green);
        img.drawString ("You Win!", 25, 60);
        setImage (img);
    }
}
