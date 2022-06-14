import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction extends World
{
    public Images enemy;
    public Player joe;
    private SimpleTimer spawnTimer = new SimpleTimer();
    /**
     * Constructor for objects of class Instruction.
     * 
     */
    public Instruction()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        prepare();
    }
    
    private void prepare()
    {
        Label title = new Label("Instructions", 100);
        addObject(title,300,30);
        //How to attack
        Label keybinds = new Label("WASD to attack", 50);
        addObject(keybinds,150,100);
        Images atkArrow = new Images("arrow");
        addObject(atkArrow,450,100);
        Images player = new Images("player");
        addObject(player,400,100);
        enemy = new Images("enemy");
        addObject(enemy,475,100);
        Label d = new Label("Press D",50);
        addObject(d,450,150);
        
        joe = new Player();
        addObject(joe,50,250);
        spawnDummy();
        
        
    }
    public void spawnDummy()
    {
        Dummy bob = new Dummy();
        addObject(bob,150,250);
        
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld World = new MyWorld();
            Greenfoot.setWorld(World);
            
        }
        if(Greenfoot.isKeyDown("d"))
        {
            removeObject(enemy);
        }
        if (spawnTimer.millisElapsed() > 2000)
        {
            spawnDummy();
            spawnTimer.mark();
        }
    }
}
