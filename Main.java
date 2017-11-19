package metronom;

public class Main {

	
	static int mod = 0;
	
	public static void main(String[] args) {
		
	    Audio audio = new Audio();
	    SetBPM(60);
	    
	    while(true) {
	    
	    if(MetronomeWillPlay() == true ) {
	    	audio.play();
	    }	    	
	    }
	    
	    
	}
	
	
    public static boolean MetronomeWillPlay()
    {
		if ((System.currentTimeMillis() % mod) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    public static void SetBPM(int bpm)
    {
        if (bpm == 0) 
        {
            mod = 1000;
        }
        else 
        {
            mod = 60000 / bpm;
        }
    }
    
}

