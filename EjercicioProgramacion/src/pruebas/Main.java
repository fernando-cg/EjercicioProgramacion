package pruebas;

import javax.sound.sampled.LineUnavailableException;

public class Main {

	public static void main(String[] args) throws LineUnavailableException{
		 KeyMap k = new KeyMap((char) 1, "/home/hacker/Desktop/hbd") ;
		 
		 k.play() ;
	}
	

}
