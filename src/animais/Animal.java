package animais;

//Classe base Animal
public class Animal {
	
	// Atributos comuns a todos os animais
	private String nome;
	private String raca;
	private int idade;
	private float peso;
	
	
	// Construtor da classe Animal
	public Animal(String nome, String raca, int idade, float peso) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
	}
	
	
	// Métodos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getRaca() {
		return raca;
	}
	
	
	// Método que exibe as informações do animal
	public void exibirInfos() {
		System.out.println("\n-------------------------\n");
		System.out.println("Nome: " +nome);
		System.out.println("Raça: " +raca);
		System.out.println("Idade: " +idade);
		System.out.println("Peso: " +peso +" KG");
	}
	
	
	// Métodos que retornam o valor dos serviços básicos
	public float banho() {
		float banho = 50.00f;
		return banho;
	}
	
	public float tosa() {
		float tosa = 30.00f;
		return tosa;
	}
	
	public float consulta() {
		float consulta = 120.00f;
		return consulta;
	}
}
