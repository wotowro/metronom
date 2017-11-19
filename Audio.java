package metronom;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Audio {
	
	public void play() {
	
	try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\woto\\eclipse-workspace\\metronom\\src\\metronom\\click.wav").getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
        do {
            Thread.sleep(15);
        } while (clip.isRunning());
        
        
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }
}
}
