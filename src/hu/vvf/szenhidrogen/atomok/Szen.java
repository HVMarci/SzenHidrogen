package hu.vvf.szenhidrogen.atomok;

import java.awt.Color;

public class Szen extends Atom {

	/**
	 * Random generált UID
	 */
	private static final long serialVersionUID = 1851036777427581727L;
	
	public Szen(int x, int y) {
		super('C', Color.BLACK, Color.WHITE, x, y);
	}

}
