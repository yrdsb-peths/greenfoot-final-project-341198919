import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pummy extends Actor
{
    /**
     * Act - do whatever the Stick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage blue = new GreenfootImage("images/blue.png");
    MyWorld world = (MyWorld) getWorld();
    Instruction instruct = (Instruction) getWorld();
    public Pummy()
    {
        setImage(blue);
        blue.scale(50, 50);
    }

    public void act()
    {

    }
}
