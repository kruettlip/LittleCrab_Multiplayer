import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;

public class Counter extends Actor
{
    private int score = 0;
    
    public Counter() 
    {
        setImage(new GreenfootImage(120, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(18.0F));
        //updateImage();
    }   
    
    public void updateImage() 
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString("Score: " + score, 1, 18);
    }
    
    public void add(int amount)
    {
        score = score + amount;
        if(score >= 180)
        {
            CrabWorld crabworld = (CrabWorld) getWorld();
            crabworld.text_winner.updateImage();
            Greenfoot.stop();
        }
        updateImage();
    }
    
    public int getScore()
    {
        return score;
    }
}
