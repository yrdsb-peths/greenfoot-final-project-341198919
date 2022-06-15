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
        //Introducing slime
        Images enemy = new Images("enemy");
        addObject(enemy,50,50);
        
        Label enemyDesc = new Label("A slime, nothing special", 30);
        addObject(enemyDesc,250,50);
        
        //Introducing Sanic
        Images sanic = new Images("sanic");
        addObject(sanic,50,100);
        
        Label sanicDesc = new Label("Twice as fast as a slime", 30);
        addObject(sanicDesc,250,100);
        
        //Introducing Boo
        Images boo = new Images("boo");
        addObject(boo,50,150);
        
        Label booDesc = new Label("Will jumpscare you, react quickly",30);
        addObject(booDesc,300,150);
        
        //Introducing fairies
        Images fairy = new Images("fairy");
        addObject(fairy,50,200);
        
        Label fairyDesc = new Label("A friend",30);
        addObject(fairyDesc,170,200);
        
        //Introducing bullets
        Images shot = new Images("shot");
        addObject(shot,50,250);
        
        Label shotDesc = new Label("Faster than Sanic, smaller than a fairy", 30);
        addObject(shotDesc,320,250);
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
