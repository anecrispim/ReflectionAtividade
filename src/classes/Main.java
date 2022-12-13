package classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner entrada = new Scanner(System.in);
			
			String recurso;
			System.out.print("Digite o recurso que deseja instanciar. Ex.: /produto: ");
			recurso = entrada.nextLine();
			
			LoadResource lr = new LoadResource();
			
			System.out.println(lr.loadResource(recurso));
			
			entrada.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
