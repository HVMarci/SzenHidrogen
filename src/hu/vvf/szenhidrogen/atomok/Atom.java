package hu.vvf.szenhidrogen.atomok;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;

public abstract class Atom extends Component {

	/**
	 * Random generált UID
	 */
	private static final long serialVersionUID = -840220759953712127L;

	/**
	 * Ez a betű lesz megjelenítve
	 */
	protected final char vegyjel;

	/**
	 * Ez a szín lesz a kör háttérszíne. Lehetőleg az egységes színt alkalmazzuk.
	 */
	protected final Color szin;

	/**
	 * Ezzel a színnel fog megjelenni a vegyjel a körben.
	 */
	protected final Color betuszin;

	private int x, y, radius;

	/**
	 * Létrehoz egy atomot fekete betűszínnel, a (0; 0) koordinátán, 20 pixeles
	 * sugárral.
	 * 
	 * @param vegyjel az atom egységes vegyjele
	 * @param szin    az atom egységes színe
	 */
	protected Atom(char vegyjel, Color szin) {
		this(vegyjel, szin, Color.BLACK, 0, 0, 20);
	}

	/**
	 * Létrehoz egy atomot a (0; 0) koordinátán, 20 pixeles sugárral.
	 * 
	 * @param vegyjel  az atom egységes vegyjele
	 * @param szin     az atom egységes színe
	 * @param betuszin az körben a betűszín (a láthatóság érdekében, pl.: szén)
	 */
	protected Atom(char vegyjel, Color szin, Color betuszin) {
		this(vegyjel, szin, betuszin, 0, 0, 20);
	}

	/**
	 * Létrehoz egy atomot 20 pixeles sugárral.
	 * 
	 * @param vegyjel  az atom egységes vegyjele
	 * @param szin     az atom egységes színe
	 * @param betuszin az körben a betűszín (a láthatóság érdekében, pl.: szén)
	 * @param x        a kör középpontjának az x koordinátája
	 * @param y        a kör középpontjának az y koordinátája
	 */
	protected Atom(char vegyjel, Color szin, Color betuszin, int x, int y) {
		this(vegyjel, szin, betuszin, x, y, 20);
	}
	
	/**
	 * Létrehoz egy atomot 20 pixeles sugárral, fekete betűszínnel.
	 * 
	 * @param vegyjel  az atom egységes vegyjele
	 * @param szin     az atom egységes színe
	 * @param x        a kör középpontjának az x koordinátája
	 * @param y        a kör középpontjának az y koordinátája
	 */
	protected Atom(char vegyjel, Color szin, int x, int y) {
		this(vegyjel, szin, Color.BLACK, x, y, 20);
	}

	/**
	 * Létrehoz egy atomot.
	 * 
	 * @param vegyjel  az atom egységes vegyjele
	 * @param szin     az atom egységes színe
	 * @param betuszin az körben a betűszín (a láthatóság érdekében, pl.: szén)
	 * @param x        a kör középpontjának az x koordinátája
	 * @param y        a kör középpontjának az y koordinátája
	 */
	protected Atom(char vegyjel, Color szin, Color betuszin, int x, int y, int radius) {
		this.vegyjel = vegyjel;
		this.szin = szin;
		this.betuszin = betuszin;
		this.x = x - radius;
		this.y = y - radius;
		this.radius = radius;
	}

	/**
	 * Megváltoztatja az atom koordinátáit.
	 */
	public void setCoords(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(this.szin);
		g.fillOval(this.x - this.radius, this.y - this.radius, this.radius * 2, this.radius * 2);
		g.setColor(this.betuszin);
		g.setFont(new Font("Arial", Font.PLAIN, this.radius));
		g.drawString(String.valueOf(this.vegyjel), (int) (this.x + this.radius / 1.5), (int) (this.y + this.radius * 1.5));
	}

}
