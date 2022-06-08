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
        // The player
        super(600, 600, 1); 
        joe = new Player();
        addObject(joe,300,300);
        
        //Life
        Life heart = new Life();
        addObject(heart,35,570);
        
        // All the attack areas
        AtkArea northAtk = new AtkArea("south");
        AtkArea eastAtk = new AtkArea("east");
        AtkArea southAtk = new AtkArea("north");
        AtkArea westAtk = new AtkArea("west");

        addObject(northAtk,300,350);
        addObject(eastAtk,350,300);
        addObject(southAtk,300,250);
        addObject(westAtk,250,300);
        
        
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
