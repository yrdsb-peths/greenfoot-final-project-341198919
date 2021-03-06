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
    GreenfootSound swing = new GreenfootSound("sounds/swing.mp3");
    
    public Player()
    {
        setImage(blue);
        blue.scale(50, 50);
    }

    public void act()
    {
        MyWorld world = (MyWorld) getWorld();
        if(Greenfoot.isKeyDown("s")){
            world.northAtk.attack();
            swing.play();
        }
        if(Greenfoot.isKeyDown("a")){
            world.westAtk.attack();
            swing.play();
        }
        if(Greenfoot.isKeyDown("w")){
            world.southAtk.attack();
            swing.play();
        }
        if(Greenfoot.isKeyDown("d")){
            world.eastAtk.attack();
            swing.play();
        }
    }
}
