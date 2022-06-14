import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Images here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Images extends Actor
{
    GreenfootImage arrow = new GreenfootImage("images/arrowEast.png");
    GreenfootImage enemy = new GreenfootImage("images/red.png");
    GreenfootImage player = new GreenfootImage("images/blue.png");
    GreenfootImage life = new GreenfootImage("images/heart.png");
    
    public Images(String name)
    {
        if(name.equals("arrow"))
        {
            setImage(arrow);
            arrow.scale(50, 50);
        }
        if(name.equals("enemy"))
        {
            setImage(enemy);
            enemy.scale(50,50);
        }
        if(name.equals("player"))
        {
            setImage(player);
            player.scale(50,50);
        }
        if(name.equals("life"))
        {
            setImage(life);
            life.scale(70,70);
        }
    }
    /**
     * Act - do whatever the Images wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
