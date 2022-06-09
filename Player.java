import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Stick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage blue = new GreenfootImage("images/blue.png");

    public Player()
    {
        setImage(blue);
        blue.scale(50, 50);
    }

    public void act()
    {
        MyWorld world = (MyWorld) getWorld();

        if(Greenfoot.isKeyDown("w")){
            world.northAtk.attack();
        }
        if(Greenfoot.isKeyDown("a")){
            world.westAtk.attack();
        }
        if(Greenfoot.isKeyDown("s")){
            world.southAtk.attack();
        }
        if(Greenfoot.isKeyDown("d")){
            world.eastAtk.attack();
        }
    }
}
