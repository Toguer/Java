package EmpresaTransport;

import java.util.Scanner;

public class autobus extends conductor implements Urbans, interurbans {
	private int ID;
	private double preuBase;
	private int km;
	private boolean urba;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getPreuBase() {
		return preuBase;
	}

	public void setPreuBase(double preuBase) {
		this.preuBase = preuBase;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public boolean isUrba() {
		return urba;
	}

	public void setUrba(boolean urba) {
		this.urba = urba;
	}

	public autobus() {
		super();
	}

	public autobus(int iD, double preuBase, int km, boolean urba) {
		super();
		ID = iD;
		this.preuBase = preuBase;
		this.km = km;
		this.urba = urba;
	}

	@Override
	public double preuBrut(boolean urba, int preuBase) {
		Scanner lector = new Scanner(System.in);
		if (urba) {
			System.out.println("Introdueix un 1 si es ruta A. \n Introdueix un 2 si es una altra");
			while (true) {
				if (lector.hasNextInt()) {
					if (lector.nextInt() == 1) {
						return this.preuBase + this.preuBase * rutaA;
					} else {
						return this.preuBase + this.preuBase * rutaAlternativa;
					}
				}

			}
		} else {
			return this.preuBase * this.km;
		}
	}
}
