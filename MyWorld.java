import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public Player joe;
    public Label lifeCount;
    public int countLife = 3;
    
    private SimpleTimer spawnTimer = new SimpleTimer();

    public AtkArea northAtk;
    public AtkArea eastAtk;
    public AtkArea southAtk;
    public AtkArea westAtk;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // The player
        super(600, 600, 1); 
        joe = new Player();
        addObject(joe,300,300);

        //Life
        Life heart = new Life();
        addObject(heart,35,570);
        lifeCount = new Label(3,40);
        addObject(lifeCount,33,565);

        // All the attack areas
        northAtk = new AtkArea("north");
        eastAtk = new AtkArea("east");
        southAtk = new AtkArea("south");
        westAtk = new AtkArea("west");

        addObject(northAtk,300,370);
        addObject(eastAtk,370,300);
        addObject(southAtk,300,230);
        addObject(westAtk,230,300);

        //Spawing Enemies
        spawnTimer.mark();
        spawnEnemy();
        spawnEnemy();
        spawnEnemy();
    }

    public void LifeCounter()
    {
        countLife--;
        lifeCount.setValue(countLife);
        if(countLife == 0)
        {
            GameOver World = new GameOver();
            Greenfoot.setWorld(World);
        }
    }

    public void spawnEnemy()
    {
        Enemy bob = new Enemy();

        int spawnArea = Greenfoot.getRandomNumber(4);

        // consider: addObject(bob, 450 * spawnArea, 900 - spawnArea);
        if(spawnArea == 1)
        {
            addObject(bob,300,600);
        }
        if(spawnArea == 2)
        {
            addObject(bob,600,300);
        }
        if(spawnArea == 3)
        {
            addObject(bob,300,0);
        }
        if(spawnArea == 0)
        {
            addObject(bob,0,300);
        }
    }

    //Act method, spawns the enemy in every few seconds
    public void act()
    {
        if (spawnTimer.millisElapsed() > 3000)
        {
            spawnEnemy();
            spawnTimer.mark();
        }
    }
}
