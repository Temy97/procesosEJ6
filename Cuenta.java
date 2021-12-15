package procesosEJ6;

public class Cuenta {
	private int saldo;

	public Cuenta(int saldo) {
		this.saldo = saldo;
	}

	public synchronized void retirarDinero(String nombre, int cantidad) {
		try {
			System.out.println(nombre + " va a retirar dinero: " + cantidad + "€ (saldo actual: " + saldo + ")");
			Thread.sleep(500);
			if(saldo >= cantidad) {
				saldo -= cantidad;
				System.out.println(nombre + " retira -> " + cantidad + " ACTUAL (" + saldo +")");

			}else {
				System.out.println(nombre + " no puede retirar dinero porque el saldo (" + saldo + ") es menor que la cantidad a retirar (" +  cantidad +")");
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
