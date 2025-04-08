package animais;

//Subclasse Cobra herda de Animal
public class Cobra extends Animal{
	
	private boolean peconha; // Define se a cobra é peçonhenta

	// Construtor da cobra que usa o construtor da superclasse Animal
	public Cobra(String nome, String raca, int idade, float peso, boolean peconha) {
		super(nome, raca, idade, peso);
		this.peconha = peconha;
	}

	
	// Getter para saber se é peçonhenta
	public boolean isPeconha() {
		return peconha;
	}


	// Exibe as informações da cobra, incluindo se é peçonhenta
	@Override
	public void exibirInfos() {
		super.exibirInfos();
		System.out.println(peconha ? "Cobra peçonhenta" : "Cobra não peçonhenta");
	}

	
	// Banho com acréscimo de 10%
	@Override
	public float banho() {
		// TODO Auto-generated method stub
		return super.banho() * 1.1f;
	}


	// Tosa não é permitida
	@Override
	public float tosa() {
		System.out.println("Erro: Não é possivel tosar uma cobra");
		return 0.0f;
	}


	// Consulta com acréscimo de 30%
	@Override
	public float consulta() {
		// TODO Auto-generated method stub
		return super.consulta() * 1.3f;
	}
	
	
	
}
