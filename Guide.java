import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guide extends World
{
    public Images enemy;
    public Pummy joe;
    private SimpleTimer spawnTimer = new SimpleTimer();
    /**
     * Constructor for objects of class Guide.
     * 
     */
    public Guide()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        prepare();
    }
    
    private void prepare()
    {
        
    }
        
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld World = new MyWorld();
            Greenfoot.setWorld(World);
            
        }
    }
}
