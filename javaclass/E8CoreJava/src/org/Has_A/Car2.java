package org.Has_A;

public class Car2 
{
	String modelName;
	double price;
    private SoundSystem soundSystem;
    
    public void addSoundSusyem(String name)
    {
    	this.soundSystem=new SoundSystem(name);
    }
    
    public SoundSystem getSoundSystem()
    {
    	return soundSystem;
    }
    
    public Car2(String modelName,double price)
    {
    	this.modelName=modelName;
    	this.price=price;
    }

}
