import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

import java.util.Random;
import java.awt.Color;

public class CrabWorld extends World
{

    Counter counter = new Counter();
    Text_Winner text_winner = new Text_Winner();
    Text_Looser text_looser = new Text_Looser();

    /**
     * Erstellt die Welt (in unserem Beispiel den Strand). Unsere Welt hat eine Gr�sse von
     * 560x560 Zellen, wobei jeder Zelle 1 Pixel gross ist.
     */
    public CrabWorld() 
    {
        super(600,600,1);
        populateWorld();
    }

    public void act() 
    {
        if(Greenfoot.getRandomNumber(100) < 1)
            addObject(new Worm(), Greenfoot.getRandomNumber(540), Greenfoot.getRandomNumber(540));
    }

    public void counter(int amount)
    {
        counter.add(amount);
        switch(counter.getScore())
        {
            case 30: addObject(new Lobster(), Greenfoot.getRandomNumber(540), Greenfoot.getRandomNumber(540)); break;
            case 60: addObject(new Lobster(), Greenfoot.getRandomNumber(540), Greenfoot.getRandomNumber(540)); break;
            case 150: addObject(new Lobster(), Greenfoot.getRandomNumber(540), Greenfoot.getRandomNumber(540)); break;
            case 180: addObject(new Text_Winner(), Greenfoot.getRandomNumber(300), Greenfoot.getRandomNumber(300)); break;
            default: break;
        }
    }

        public void populateWorld() {
            addObject(new Crab("left", "right"), Greenfoot.getRandomNumber(640), Greenfoot.getRandomNumber(640));
            addObject(new Crab("a", "d"), Greenfoot.getRandomNumber(340), Greenfoot.getRandomNumber(340));
            addObject(new Lobster(), Greenfoot.getRandomNumber(540), Greenfoot.getRandomNumber(540));
            for(int i = 0; i < 11; i++)
            {
                addObject(new Worm(), Greenfoot.getRandomNumber(540), Greenfoot.getRandomNumber(540));
            }
            addObject(counter, 100, 540);
            addObject(text_winner, 330, 300);
            addObject(text_looser, 330, 300);
        }
    }
