package window;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PiMusic {
	
	
	void playSound(String soundFile) {
		try {
		Clip clip = AudioSystem.getClip();
		clip.open(AudioSystem.getAudioInputStream(PiMusic.class.getResource(soundFile)));
		clip.start();
		}
		catch(Exception e) {
		}
		
	}
	
	
}
