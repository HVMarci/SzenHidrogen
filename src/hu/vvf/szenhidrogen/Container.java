package hu.vvf.szenhidrogen;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import hu.vvf.szenhidrogen.atomok.Atom;
import hu.vvf.szenhidrogen.kotesek.Kotes;

public class Container extends JPanel {

	private ArrayList<Kotes> kotesek = new ArrayList<>();
	private ArrayList<Atom> atomok = new ArrayList<>();
	private final JFrame parent;
	
	/**
	 * Random generált UID
	 */
	private static final long serialVersionUID = 4873227903485836276L;

	public Container(JFrame parent) {
		this.parent = parent;
		addMouseListener(new Kattintas(this));
	}
	
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		this.atomok.forEach(i -> i.paint(g));
	}
	
	public void addAtom(Atom a) {
		this.atomok.add(a);
		paintComponents(this.getGraphics());
	}
	
	public JFrame getParent() {
		return this.parent;
	}
	
}
