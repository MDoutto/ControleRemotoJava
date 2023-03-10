package Edu.SmartTV;

import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();

		System.out.println("Escolha a opção desejada:");
		System.out.println("1 - Ligar Tv");
		System.out.println("2 - Desligar Tv");
		System.out.println("3 - Aumentar o volume");
		System.out.println("4 - Dimuir o volume");
		System.out.println("5 - Escolher o canal");
		Scanner input = new Scanner(System.in);
		while (true) {

			System.out.println("Escolha entre as opções 1/2/3/4/5: ");
			String option = input.nextLine();
			if (option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4")
					|| option.equals("5")) {

				if (option.equals("1")) {
					smartTv.ligar();
					System.out.println("Sua TV foi ligada. ");
				}

				else if (option.equals("2")) {
					smartTv.desligar();
					System.out.println("Sua TV foi desligada. ");
				}

				else if (option.equals("3")) {
					smartTv.aumentarVolume();
					System.out.println("O volume da sua TV foi aumentado para : " + smartTv.volume);
				}

				else if (option.equals("4")) {
					smartTv.diminuirVolume();
					System.out.println("O volume da sua TV foi diminuido para : " + smartTv.volume);
				}

				else if (option.equals("5")) {
					boolean inputError = true;
					while (inputError == true) {
						try {
							System.out.println("Qual canal você deseja: ");
							int canalDesejado = input.nextInt();
							smartTv.mudarCanal(canalDesejado);
							inputError = false;
							System.out.println("Canal alterado para o : " + smartTv.canal);
						} catch (Exception e) {
							System.out.println("Erro: " + e.getMessage());
							input = new Scanner (System.in);
						}
					}

				}

				System.out.println("Deseja realizar uma nova ação? (y/n): ");
				String novaOpcao = input.next();
				if (novaOpcao.equals("n")) {
					break;
				}

			} else {
				System.out.println("Opção invalida");
			}
		}
		if (input != null) {
			input.close();
		}
	}
}
