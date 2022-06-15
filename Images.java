import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Images here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Images extends Actor
{
    GreenfootImage arrow = new GreenfootImage("images/arrowEast.png");
    GreenfootImage enemy = new GreenfootImage("images/red.png");
    GreenfootImage player = new GreenfootImage("images/blue.png");
    GreenfootImage life = new GreenfootImage("images/heart.png");
    GreenfootImage skull = new GreenfootImage("images/skull.png");
    GreenfootImage sanic = new GreenfootImage("images/zoom.png");
    GreenfootImage boo = new GreenfootImage("images/ghost.png");
    GreenfootImage shot = new GreenfootImage("images/shot.png");
    GreenfootImage fairy = new GreenfootImage("images/fairy.png");
    
    public Images(String name)
    {
        if(name.equals("arrow"))
        {
            setImage(arrow);
            arrow.scale(50, 50);
        }
        if(name.equals("enemy"))
        {
            setImage(enemy);
            enemy.scale(50,50);
        }
        if(name.equals("player"))
        {
            setImage(player);
            player.scale(50,50);
        }
        if(name.equals("life"))
        {
            setImage(life);
            life.scale(70,70);
        }
        if(name.equals("skull"))
        {
            setImage(skull);
            skull.scale(70,70);
        }
        if(name.equals("sanic"))
        {
            setImage(sanic);
            sanic.scale(50,50);
        }
        if(name.equals("boo"))
        {
            setImage(boo);
            boo.scale(50,50);
        }
        if(name.equals("shot"))
        {
            setImage(shot);
            shot.scale(50,10);
        }
        if(name.equals("fairy"))
        {
            setImage(fairy);
            fairy.scale(50,50);
        }
    }
    /**
     * Act - do whatever the Images wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
