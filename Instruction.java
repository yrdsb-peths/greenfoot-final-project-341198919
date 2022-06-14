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
    public Pummy joe;
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
        addObject(keybinds,150,150);
        
        Images arrow = new Images("arrow");
        addObject(arrow,450,100);
        
        Images player = new Images("player");
        addObject(player,400,100);
        
        enemy = new Images("enemy");
        addObject(enemy,475,100);
        
        Label d = new Label("Press D",50);
        addObject(d,450,150);
        
        //Health system
        joe = new Pummy();
        addObject(joe,50,250);
        
        Images life = new Images("life");
        addObject(life,230,255);
        
        Label equals = new Label("=  -1",50);
        addObject(equals,200,250);
        
        Images lifeTwo = new Images("life");
        addObject(lifeTwo,304,255);
        
        Label zero = new Label("0  = Game Over",50);
        addObject(zero,435,250);
        
        //Begin game
        Label startGame = new Label("Press space to begin",50);
        addObject(startGame,300,350);
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
        if (spawnTimer.millisElapsed() > 1000)
        {
            spawnDummy();
            spawnTimer.mark();
        }
    }
}
