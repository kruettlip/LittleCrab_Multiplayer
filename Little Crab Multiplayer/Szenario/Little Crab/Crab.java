import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * Krabbe
 */

// Erbt von der Klasse Animal
public class Crab extends Animal
{
    //Bilder werden definiert
    private GreenfootImage image1;
    private GreenfootImage image2;

    private String leftKey;
    private String rightKey;
    
    private int wormsEaten;

    /**
     * Hier werden die Methoden aufgerufen.
     */
    public void act()
    {
        checkKeypress();
        move();
        lookForWorm();
        switchImage();
    }

    /**
     * Hier wird der Konstruktor mit den Bildern verbunden, um die Animation zu erstellen.
     */

    public Crab(String leftKey, String rightKey)
    {
        this.leftKey = leftKey;
        this.rightKey = rightKey;
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");

        wormsEaten = 0;

        setImage(image1);
    }

    /**
     * Hier wird die Steuerung via Linke und Rechte Pfeiltaste definiert.
     */
    public void checkKeypress()
    {
        if (Greenfoot.isKeyDown(leftKey))
            turn(-4);
        else if (Greenfoot.isKeyDown(rightKey))
            turn(4);
    }

    /**
     * Hier wird definiert, dass die Krabe die W�rmer frisst, wenn sie dr�ber l�uft.
     */
    public void lookForWorm()
    {
        if (canSee(Worm.class))
        {
            eat(Worm.class);
            wormsEaten = wormsEaten + 1;
            CrabWorld crabworld = (CrabWorld) getWorld();

            if (wormsEaten >= 10)
                crabworld.counter(5);
            if (wormsEaten == 15)
                Greenfoot.stop();
            crabworld.counter(10);
        }
    }

    /**
     * Hier wird definiert, dass sich die Krabbe zuf�llig dreht.
     */
    public void randomTurn() 
    {
        if (Greenfoot.getRandomNumber(100) < 10)
            turn(Greenfoot.getRandomNumber(90)-45);
    }

    /**
     * Hier sehen sie, dass die Krabbe sich an der Wand dreht.
     */
    public void turnAtEdge()
    {
        if (atWorldEdge())
            turn(17);
    }

    /**
     * Hier wird definiert, dass sich die Bilder der Krabbe abwechseln.
     */
    public void switchImage()
    {
        if (getImage() == image1)
            setImage(image2);
        else
            setImage(image1);
    }
}