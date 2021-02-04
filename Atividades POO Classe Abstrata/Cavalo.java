//1- Crie a classe
public class Cavalo extends Animal {

//2 - Atributos
	private String paisOrigem;

//3- Construtor + parâmetros + inicialização dos atributos
	public Cavalo (String nome, int idade, String som, String movimento, String tipoAnimal, String paisOrigem)
	{
		super(nome, idade, som, movimento,tipoAnimal);
		this.paisOrigem = paisOrigem;
	}

//4- Crie métodos
@Override
	public void EmitirSom (String emitirSom)
	{
		System.out.println("Esse "+getTipoAnimal()+" é natural de "+paisOrigem+" e emite o som: "+emitirSom);
	}

}
