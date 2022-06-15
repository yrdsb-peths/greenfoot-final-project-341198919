import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Space Friends", 100);
        addObject(label,300,200);
        Label begin = new Label("[Press space to begin]", 50);
        addObject(begin,300,300);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Instruction World = new Instruction();
            Greenfoot.setWorld(World);
            
        }
    }
}
