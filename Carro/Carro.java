
public class Carro {
	int pessoas;
	float gasolina;
	float quilometragem;
	float kms;
	float gasMax;
	int passMax;
	int gasMin;
	
	public Carro(){
		this.gasolina = 0;
		this.pessoas = 0;
		this. quilometragem = 0;
		this.gasMax = 10;
		this.passMax = 2;
		this.gasMin = 0;
		}
	
	public void embarcar(){
		if (this.pessoas < this.passMax){
			System.out.println("success");
			this.pessoas++;
		}
		else System.out.println("failure: limite de pessoas atingido");
	}
	
	public void desembarcar(){
		if (pessoas > 0){
			this.pessoas --;
			System.out.println("success");
		}
		else {
			System.out.println("failure: nao ha ninguem no carro");
		}
	}

	public void andar(float qtdKms) {		
		
		if (this.pessoas == 0) {
			System.out.println("failure: nao ha ninguem no carro");
		}
		else if (this.pessoas > 0 && (qtdKms/10) <= this.gasolina){
			this.gasolina -= (qtdKms / 10);
			this.quilometragem += qtdKms;
			System.out.println("success");
		}
		else{
			System.out.println("failure: gasolina insuficiente");
		}		
	}
	
	public void abastecer(float qtdGas) {
		this.gasolina += qtdGas;
		System.out.println("succes");
		
		if (this.gasolina > gasMax) {
			this.gasolina= 10;
		}
		if (this.gasolina > this.gasMax){
			this.gasolina = 10;
		}
		if (this.gasolina < this.gasMin) {
			this.gasolina = 0;
		}
	}
			
	public void estado() {
		System.out.println("pass: " + this.pessoas + ", " + "gas: "+ this.gasolina +", "+ "km: " + this.quilometragem);
	}
	
	public void help() {
		System.out.println("=======comandos=======");
		System.out.println("in = embarca uma pessoa");
		System.out.println("out = desembarca uma pessoa");
		System.out.println("show = mostra o status do carro");
		System.out.println("fuel = pressione 'enter' e digite a quantidade de combustivel desejada, pressione 'enter' novamente");
		System.out.println("drive = pressione 'enter' e digite a quantidade de kms desejada, pressione 'enter' novamente");
	}
}

	