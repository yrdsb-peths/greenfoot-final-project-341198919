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
    public Label killCount;
    public int countLife = 3;
    public int killStreak = 0;
    
    private SimpleTimer enemyTimer = new SimpleTimer();
    private SimpleTimer sanicTimer = new SimpleTimer();
    private SimpleTimer ghostTimer = new SimpleTimer();

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
        Images heart = new Images("life");
        addObject(heart,35,570);
        lifeCount = new Label(3,40);
        addObject(lifeCount,33,565);
        
        //Kill streak
        Images skull = new Images("skull");
        addObject(skull,100,565);
        killCount = new Label(0,40);
        addObject(killCount,100,565);

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
        enemyTimer.mark();
        sanicTimer.mark();
        ghostTimer.mark();
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

    public void streak()
    {
        killStreak++;
        killCount.setValue(killStreak);
    }
    
    //Enemies that I will eventually create
    
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
    
    public void spawnSanic()
    {
        Sanic zoom = new Sanic();

        int spawnArea = Greenfoot.getRandomNumber(4);

        // consider: addObject(bob, 450 * spawnArea, 900 - spawnArea);
        if(spawnArea == 1)
        {
            addObject(zoom,300,600);
        }
        if(spawnArea == 2)
        {
            addObject(zoom,600,300);
        }
        if(spawnArea == 3)
        {
            addObject(zoom,300,0);
        }
        if(spawnArea == 0)
        {
            addObject(zoom,0,300);
        }
    }
    
    public void spawnGhost()
    {
        Boo ghost = new Boo();

        int spawnArea = Greenfoot.getRandomNumber(4);

        // consider: addObject(bob, 450 * spawnArea, 900 - spawnArea);
        if(spawnArea == 1)
        {
            addObject(ghost,300,180);
        }
        if(spawnArea == 2)
        {
            addObject(ghost,180,300);
        }
        if(spawnArea == 3)
        {
            addObject(ghost,300,420);
        }
        if(spawnArea == 0)
        {
            addObject(ghost,420,300);
        }
    }
    //Act method, spawns the enemy in every few seconds
    public void act()
    {
        if (enemyTimer.millisElapsed() > 3000)
        {
            spawnEnemy();
            enemyTimer.mark();
        }
        if (sanicTimer.millisElapsed() > 7000)
        {
            spawnSanic();
            sanicTimer.mark();
        }
        if (ghostTimer.millisElapsed() > 12000)
        {
            spawnGhost();
            ghostTimer.mark();
        }
    }
}
