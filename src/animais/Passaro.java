package animais;

//Subclasse Passaro herda de Animal
public class Passaro extends Animal{
	
	private String tipoCanto; // Tipo de canto: Agudo, Médio ou Grave

	// Construtor do pássaro que usa o construtor da superclasse Animal
	public Passaro(String nome, String raca, int idade, float peso, String tipoCanto) {
		super(nome, raca, idade, peso);
		this.tipoCanto = tipoCanto;
	}


	public String getTipoCanto() {
		return tipoCanto;
	}

	
	// Validação do tipo de canto
	public void setTipoCanto(String tipoCanto) {
		if (tipoCanto != null) {
			if (tipoCanto == "Agudo" || tipoCanto == "agudo") {
				this.tipoCanto = "Agudo";
			}else if (tipoCanto == "Medio" || tipoCanto == "medio") {
				this.tipoCanto = "Medio";
			}else if (tipoCanto == "Grave" || tipoCanto == "grave") {
				this.tipoCanto = "Grave";
			}else {
				this.tipoCanto = "Valor inválido - Informe se é 'Agudo', 'Medio' ou 'Grave'";
			}
		}else {
			this.tipoCanto = "Não especificado";
		}
	}


	// Exibe as informações do pássaro, incluindo tipo de canto
	@Override
	public void exibirInfos() {
		super.exibirInfos();
		System.out.println("Tipo de canto: " +tipoCanto);
	}


	// Banho com acréscimo de 25%
	@Override
	public float banho() {
		// TODO Auto-generated method stub
		return super.banho() * 1.25f;
	}


	// Tosa não permitida
	@Override
	public float tosa() {
		// TODO Auto-generated method stub
		System.out.println("Erro: Não é possivel tosar um passaro");
		return 0;
	}


	// Consulta com acréscimo de 15%
	@Override
	public float consulta() {
		// TODO Auto-generated method stub
		return super.consulta() * 1.15f;
	}
	
	
	
}
