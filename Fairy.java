import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fairy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fairy extends Actor
{
    GreenfootImage enemy = new GreenfootImage("images/fairy.png");
    GreenfootSound fairyS = new GreenfootSound("sounds/fairy.mp3");
    GreenfootSound heal = new GreenfootSound("sounds/heal.mp3");
    public Fairy()
    {
        setImage(enemy);
        enemy.scale(10,10);
    }
    /**
     * Act - do whatever the Fairy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        fairyS.play();
        // Add your action code here.
        MyWorld world = (MyWorld) getWorld();
        Player joe = world.joe;
        turnTowards(joe.getX(), joe.getY());

        if(isTouching(Player.class))
        {
            world.removeObject(this);
            heal.play();
            world.LifePlus();
        }
    }

}
