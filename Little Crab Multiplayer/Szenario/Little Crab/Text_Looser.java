import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
/**
 * Write a description of class Text_Looser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text_Looser extends Actor
{
    public void act() 
    {
        // Add your action code here.
    }
    public void updateImage()
    {
        GreenfootImage img2 = new GreenfootImage (300, 100);
        Font font = img2.getFont();
        img2.setFont(font.deriveFont(45.0F));
        img2.setColor(java.awt.Color.red);
        img2.drawString ("You Lose!", 25, 60);
        setImage (img2);
    }
    public Text_Looser()
    {
        GreenfootImage image = new GreenfootImage("crab.png");
        image.clear();
        setImage(image);
    }
}
