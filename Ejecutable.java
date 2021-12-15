package procesosEJ6;

public class Ejecutable {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(2000);
		
		new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 12; i++) {
					cuenta.retirarDinero("Agustin", 23);
				}
			}
		};
		new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 17; i++) {
					cuenta.retirarDinero("Ana", 25);
				}
			}
		};
	}

}
