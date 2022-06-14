import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dummy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dummy extends Actor
{
    GreenfootImage enemy = new GreenfootImage("images/red.png");
    public Dummy()
    {
        setImage(enemy);
        enemy.scale(70,70);
    }
    /**
     * Act - do whatever the Dummy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);

        // Add your action code here.
        Instruction guide = (Instruction) getWorld();
        Pummy joe = guide.joe;
        turnTowards(joe.getX(), joe.getY());

        if(isTouching(Pummy.class))
        {
            guide.removeObject(this);
        }
    }

}
