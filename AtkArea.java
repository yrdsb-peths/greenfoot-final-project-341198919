import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AtkArea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AtkArea extends Actor
{
    
    /**
     * Act - do whatever the AtkArea wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here
        if(Greenfoot.isKeyDown("space"))
        {
            // Code here for firing a new shot
            if(isTouching(Enemy.class))
            {
                removeTouching(Enemy.class);
            }
        }
    }
    
}
