package hu.vvf.szenhidrogen;

import javax.swing.JFrame;
import javax.swing.JPanel;

import hu.vvf.szenhidrogen.atomok.Atom;
import hu.vvf.szenhidrogen.atomok.Hidrogen;

import javax.swing.JButton;
import java.awt.BorderLayout;

public class Ablak extends JFrame {
	
	public Ablak() {
		super("Szerves vegyületek modellezése");
		setSize(1200, 800);
		setResizable(false);
		
		Container container = new Container(this);
		container.setBounds(0, 0, 906, 797);
		getContentPane().add(container);
		
		JPanel gombok = new JPanel();
		getContentPane().add(gombok, BorderLayout.NORTH);
		
		JButton hidrogenButton = new JButton("Hidrogén");
		gombok.add(hidrogenButton);
		
		JButton szenButton = new JButton("Szén");
		gombok.add(szenButton);
		
		JButton nitrogenButton = new JButton("Nitrogén");
		gombok.add(nitrogenButton);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Random generált ID
	 */
	private static final long serialVersionUID = 7380162316048226142L;

	public boolean isSelected() {
		return false;
	}

	public Atom getSelectedAtom() {
		return null;
	}
}
