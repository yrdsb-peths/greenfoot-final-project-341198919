import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AtkArea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AtkArea extends Actor
{
    GreenfootImage arrowNorth = new GreenfootImage("images/arrow.png");
    GreenfootImage arrowEast = new GreenfootImage("images/arrowEast.png");
    GreenfootImage arrowSouth = new GreenfootImage("images/arrowSouth.png");
    GreenfootImage arrowWest = new GreenfootImage("images/arrowWest.png");
    private int sizeX = 50;
    private int sizeY = 50;

    public AtkArea(String arrow)
    {
        if (arrow.equals("north"))
        {
            setImage(arrowNorth);
            arrowNorth.scale(sizeX, sizeY);
        }

        if (arrow.equals("east"))
        {
            setImage(arrowEast);
            arrowEast.scale(sizeX, sizeY);
        }

        if (arrow.equals("south"))
        {
            setImage(arrowSouth);
            arrowSouth.scale(sizeX, sizeY);
        }

        if (arrow.equals("west"))
        {
            setImage(arrowWest);
            arrowWest.scale(sizeX, sizeY);
        }
    }

    /**
     * Act - do whatever the AtkArea wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }

    public void attack()
    {
        if(isTouching(Enemy.class))
        {
            //Kill enemy
            removeTouching(Enemy.class);
            
            //Score
            MyWorld world = (MyWorld) getWorld();
            world.streak();
        }
        if(isTouching(Sanic.class))
        {
            //Kill enemy
            removeTouching(Sanic.class);
            
            //Score
            MyWorld world = (MyWorld) getWorld();
            world.streak();
        }
        if(isTouching(Boo.class))
        {
            //Kill enemy
            removeTouching(Boo.class);
            
            //Score
            MyWorld world = (MyWorld) getWorld();
            world.streak();
        }
    }

}
