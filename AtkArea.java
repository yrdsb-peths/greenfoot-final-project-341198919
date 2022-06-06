import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AtkArea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AtkArea extends Actor
{
    MyWorld world = (MyWorld) getWorld();
    SimpleTimer attackTimer = world.attackTimer;
    /**
     * Act - do whatever the AtkArea wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here
        attackTimer.mark();
        if(attackTimer.millisElapsed() > 500 && Greenfoot.isKeyDown("space"))
        {
            // Code here for firing a new shot
            if(isTouching(Enemy.class))
            {
                removeTouching(Enemy.class);
            }
            attackTimer.mark(); // Reset the timer
        }
    }
}
