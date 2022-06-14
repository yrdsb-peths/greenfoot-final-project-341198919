import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sanic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sanic extends Actor
{
    GreenfootImage enemy = new GreenfootImage("images/zoom.png");
    public Sanic()
    {
        setImage(enemy);
        enemy.scale(70,70);
    }
    /**
     * Act - do whatever the Sanic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(6);

        // Add your action code here.
        MyWorld world = (MyWorld) getWorld();
        Player joe = world.joe;
        turnTowards(joe.getX(), joe.getY());

        if(isTouching(Player.class))
        {
            world.removeObject(this);
            
            world.LifeCounter();
        }
    }

}