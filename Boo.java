import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boo extends Actor
{
    GreenfootImage enemy = new GreenfootImage("images/ghost.png");
    GreenfootSound booS = new GreenfootSound("sounds/boo.mp3");
    GreenfootSound ow = new GreenfootSound("sounds/ow.mp3");
    public Boo()
    {
        setImage(enemy);
        enemy.scale(70,70);
    }
    /**
     * Act - do whatever the Boo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        booS.play();

        // Add your action code here.
        MyWorld world = (MyWorld) getWorld();
        Player joe = world.joe;
        turnTowards(joe.getX(), joe.getY());

        if(isTouching(Player.class))
        {
            world.removeObject(this);
            ow.play();
            
            world.LifeCounter();
        }
    }

}
