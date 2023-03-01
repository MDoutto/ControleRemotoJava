package Edu.SmartTV;

public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;

	public void ligar() {
		ligada = true;
	}

	public void desligar() {
		ligada = false;
	}

	public void aumentarVolume() {
		volume++;
	}

	public void diminuirVolume() {
		volume--;
	}

	public void aumentarCanal() {

	}

	public void dimunuirCanal() {

	}

	public void mudarCanal(int novoCanal) throws Exception {
		if (novoCanal > 0 && novoCanal < 100) {
			canal = novoCanal;
		} else {
			throw new Exception("Esse canal não está disponivel no pacote! ");
		}
	}
}
