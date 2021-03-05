package hu.vvf.szenhidrogen;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import hu.vvf.szenhidrogen.atomok.Hidrogen;
import hu.vvf.szenhidrogen.atomok.Nitrogen;

public class Kattintas implements MouseListener {

	private final Container jp;

	public Kattintas(Container jp) {
		this.jp = jp;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		if (frame.isSelected() || true) {
//		if (e.getButton() == MouseEvent.BUTTON1) {
		if (Math.random() >= 0.5) {
			jp.addAtom(new Hidrogen(e.getX(), e.getY()));
			System.out.println(e.getX());
		} else {
			jp.addAtom(new Nitrogen(e.getX(), e.getY()));
		}
		System.out.println("Kattintas.mouseClicked()");
//		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
