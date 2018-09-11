import java.util.Scanner;

public class Main {
	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
	
		Carro mazda = new Carro();
		
		while (true) {
			String action = input.nextLine();
				
			if (action.equals("in")){
				mazda.embarcar();
				}
			else if (action.equals("out")) {
				mazda.desembarcar(); 
				}
			else if (action.equals("fuel")){
				mazda.abastecer(input.nextFloat());
				}
			else if (action.equals("show")) {
				mazda.estado();
				}
			else if(action.equals("drive")){
				mazda.andar(input.nextFloat());
			}
			else if (action.equals("help")) {
				mazda.help();
			}
		}
	}
}


