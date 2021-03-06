import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shot extends Actor
{
    GreenfootImage enemy = new GreenfootImage("images/shot.png");
    GreenfootSound pew = new GreenfootSound("sounds/blaster.mp3");
    GreenfootSound ow = new GreenfootSound("sounds/ow.mp3");
    public Shot()
    {
        setImage(enemy);
        enemy.scale(25,5);
    }
    /**
     * Act - do whatever the shot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(7);
        pew.play();
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
