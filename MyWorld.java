import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1); 
        Stick joe = new Stick();
        addObject(joe,450,450);
    }
    
    public void Enemy()
    {
        Enemy bob = new Enemy();
        int sA = Greenfoot.getRandomNumber(4);
        if(sA == 1)
        {
            addObject(bob,450,900);
        }
        if(sA == 2)
        {
            addObject(bob,900,450);
        }
        if(sA == 3)
        {
            addObject(bob,450,0);
        }
        if(sA == 4)
        {
            addObject(bob,0,450);
        }
        
    }
}
