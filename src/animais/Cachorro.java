package animais;

//Subclasse Cachorro herda de Animal
public class Cachorro extends Animal{
	
	private String tamPelo; // Tamanho do pelo: Curto, Médio ou Longo

	// Construtor do cachorro que usa o construtor da superclasse Animal
	public Cachorro(String nome, String raca, int idade, float peso, String tamPelo) {
		super(nome, raca, idade, peso);
		setTamPelo(tamPelo); // Validação no método setter
	}

	
	
	public String getTamPelo() {
		return tamPelo;
	}
	
	// Valida e define o tamanho do pelo
	public void setTamPelo(String tamPelo) {
		if (tamPelo != null) {
			if (tamPelo == "Curto" || tamPelo == "curto") {
				this.tamPelo = "Curto";
			}else if (tamPelo == "Medio" || tamPelo == "medio") {
				this.tamPelo = "Medio";
			}else if (tamPelo == "Longo" || tamPelo == "longo") {
				this.tamPelo = "Longo";
			}else {
				this.tamPelo = "Valor inválido - Informe se é 'Curto', 'Medio' ou 'Longo'";
			}
		}else {
			this.tamPelo = "Não especificado";
		}
	}

	
	// Exibe informações do cachorro, incluindo o tamanho do pelo
	@Override
	public void exibirInfos() {
		super.exibirInfos();
		System.out.println("Tamanho do Pelo: " +tamPelo);
	}

	
	// Banho tem 10% de desconto
	@Override
	public float banho() {
		return super.banho() * 0.9f;
	}

}
