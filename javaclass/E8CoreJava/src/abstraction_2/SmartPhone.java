package abstraction_2;

public class SmartPhone extends GPS implements Camera,MusicPlayer
{
	String modelName;
	int camerPixels;
	
	public SmartPhone(String modelName, int camerPixels) {
		super();
		this.modelName = modelName;
		this.camerPixels = camerPixels;
	}
	
	public void capturePhoto()
	{
		System.out.println(" capture photo");
	}
	
	public void playMusic()
	{
		System.out.println("play music");
	}
	
	public void navigate()
	{
		System.out.println("navigate");
	}
	

}
