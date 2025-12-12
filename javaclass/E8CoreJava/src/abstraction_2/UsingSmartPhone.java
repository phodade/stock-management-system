package abstraction_2;

public class UsingSmartPhone 
{
	public static void main(String[] args)
	{
		SmartPhone phone = new SmartPhone("samsung s24vultra",200);
		
		Camera camera=phone;
		
		camera.capturePhoto();
		
		MusicPlayer mp=(MusicPlayer) camera;
		mp.playMusic();
		
		
		GPS gps=phone;
		gps.navigate();
		
	}

}
