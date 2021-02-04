//1- Crie a Classe Abstrata
public abstract class Animal {
	
//2-Atributos
	private String nome;
	private int idade;
	private String som;
	private String movimento;
	private String tipoAnimal;

//3-Contrutor + parâmetros + inicialização dos atributos
	public Animal (String nome, int idade, String som, String movimento, String tipoAnimal)
	{
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.movimento = movimento;
		this.tipoAnimal = tipoAnimal;
	}
	public Animal ()
	{

	}
//4-Criação dos métodos abstratos
	abstract public void EmitirSom (String emitirSom);
	
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
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getMovimento() {
		return movimento;
	}
	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
}
