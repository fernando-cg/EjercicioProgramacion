package pruebas;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class KeyMap {

    private char keyCode;
    private String song;
    private Clip clip;

    // Don't allow default constructor
    private KeyMap() {
    }

    public KeyMap(char keyCode, String song) throws LineUnavailableException {
        this.keyCode = keyCode;
        this.song = song;

        // Create an audiostream from the inputstream
        clip = AudioSystem.getClip();
    }

    public boolean match(char key) {
        return key == keyCode;
    }

    // Play a sound using javax.sound and Clip interface
    public String play() {
        try {

            clip.open(AudioSystem.getAudioInputStream(new File(song + ".wav")));


            clip.start();


            Thread.sleep(2000);

        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException | InterruptedException e) {
            System.out.println("Things did not go well");
            System.exit(-1);
        }
        return song;
    }

 
    public void stop() {

        clip.stop();
    }
}