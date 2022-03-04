
/**
 * JukeBoxControls.java -- example from Listing 6.13 of Lewis et al, 4th Ed.
 * A. Thall
 * CSC 121 W18
 * 
 * Example using AudioClips with local files and JComboBox objects
 */

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

/**
 * @author thall
 *
 */

public class JukeBoxControls extends JPanel {

	private JComboBox<String> musicCombo;
	private JButton stopButton, playButton;
	private File[] musicFile;
	private File current;
	private AudioInputStream audioStream;
	private Clip audioClip;


	public JukeBoxControls() {

		File f1, f2, f3, f4, f5;
		f1 = f2 = f3 = f4 = f5 = null;
		// get the audio clips if we can!
		try {
			f1 = new File("classical.wav");
			f2 = new File("eightiesJam.wav");
			f3 = new File("hitchcock.wav");
			f4 = new File("newAgeRythm.wav");
			f5 = new File("westernBeat.wav");
		} catch (Exception e) {
			System.err.println("Houston, we have a problem.");
		}
		musicFile = new File[6];
		musicFile[0] = null;
		musicFile[1] = f1;
		musicFile[2] = f2;
		musicFile[3] = f3;
		musicFile[4] = f4;
		musicFile[5] = f5;

		String[] musicNames = { "Pick some jams!", "Classical Melody", "80s Jam", "Alfred Hitchcock Theme",
				"New Age Rhythm", "Western Beat" };

		musicCombo = new JComboBox<String>(musicNames);
		musicCombo.setBackground(Color.CYAN);

		playButton = new JButton("Play", new ImageIcon("play25x25.png"));
		playButton.setBackground(Color.CYAN);
		stopButton = new JButton("Stop", new ImageIcon("stop25x25.png"));
		stopButton.setBackground(Color.CYAN);

		setPreferredSize(new Dimension(250, 100));
		setBackground(Color.CYAN);
		add(musicCombo);
		add(playButton);
		add(stopButton);

		musicCombo.addActionListener(new ComboListener());
		stopButton.addActionListener(new ButtonListener());
		playButton.addActionListener(new ButtonListener());

		current = null;
	}

	private class ComboListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			try {
				if (current != null) {
					audioClip.close();
					audioStream.close();
				}
				current = musicFile[musicCombo.getSelectedIndex()];
				if (current != null) {
					audioStream = AudioSystem.getAudioInputStream(current);
					AudioFormat format = audioStream.getFormat();
					DataLine.Info info = new DataLine.Info(Clip.class, format);
					audioClip = (Clip) AudioSystem.getLine(info);
					audioClip.open(audioStream);
				}
			} catch (IOException exception) {
				System.err.println(exception);
			} catch (UnsupportedAudioFileException exception) {
				System.err.println(exception);
			} catch (LineUnavailableException exception) {
				System.err.println(exception);
			}
		}

	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (current != null)
				audioClip.stop();

			if (e.getSource() == playButton) {
				if (current != null)
					audioClip.start();
			}
		}
	}
}
