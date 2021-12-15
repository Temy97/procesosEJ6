package procesosEJ6;

public class Ejecutable {

	public static void main(String[] args) {
		System.out.println("*****INICIO programa, usuarios Agustin y Ana, van a retirar"
						+ "\n*****12 y 17 veces (respectivamente) las cantidades de 230"
						+ "\n*****(t:2.760) y 250 (t:4.250) respectivamente"
						+ "\n-- -- -- -- -- -- -- -- -- --");
		Cuenta cuenta = new Cuenta(2000);
		
		Thread hilo1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 12; i++) {
					cuenta.retirarDinero("Agustin", 230);
				}
			}
		});
		
		Thread hilo2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 17; i++) {
					cuenta.retirarDinero("Ana", 250);
				}
			}
		});
		
		hilo1.start();
		hilo2.start();
		
		try {
			hilo1.join();
			hilo2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("-- -- -- -- -- -- -- -- -- --"
				+ "\n*****FIN hilos y programa.");
	}

}
