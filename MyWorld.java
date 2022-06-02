import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public Player joe;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        joe = new Player();
        addObject(joe,300,300);
        
        spawnEnemy();
    }
    
    public void spawnEnemy()
    {
        Enemy bob = new Enemy();
        int spawnArea = Greenfoot.getRandomNumber(4);
        
        // consider: addObject(bob, 450 * spawnArea, 900 - spawnArea);
        if(spawnArea == 1)
        {
            addObject(bob,300,600);
        }
        if(spawnArea == 2)
        {
            addObject(bob,600,300);
        }
        if(spawnArea == 3)
        {
            addObject(bob,300,0);
        }
        if(spawnArea == 0)
        {
            addObject(bob,0,300);
        }
    }
}
