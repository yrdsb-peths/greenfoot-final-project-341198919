import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    Label streak;
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(int num)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        streak = new Label(num,30);
        
        
        prepare();
    }
    private void prepare()
    {
        Label label = new Label("GameOver", 100);
        addObject(label,300,100);
        Label begin = new Label("[Press space to restart]", 50);
        addObject(begin,300,300);
        
        Images skull = new Images("skull");
        addObject(skull,300,200);
        
        addObject(streak,300,200);
        
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
