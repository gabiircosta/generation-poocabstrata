//1- Crie a classe
public class Cavalo extends Animal {

//2 - Atributos
	private String paisOrigem;

//3- Construtor + par�metros + inicializa��o dos atributos
	public Cavalo (String nome, int idade, String som, String movimento, String tipoAnimal, String paisOrigem)
	{
		super(nome, idade, som, movimento,tipoAnimal);
		this.paisOrigem = paisOrigem;
	}

//4- Crie m�todos
@Override
	public void EmitirSom (String emitirSom)
	{
		System.out.println("Esse "+getTipoAnimal()+" � natural de "+paisOrigem+" e emite o som: "+emitirSom);
	}

}
