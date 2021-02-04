//1-Crie a classe
public class Preguica extends Animal {

//2-Distribua atributos
	private String arvorePreferida;

//3-Construtor+ par�metros+ inicializa��o de atributos
	public Preguica (String nome, int idade, String som, String movimento, String tipoAnimal, String arvorePreferida)
	{
		super(nome, idade, som, movimento, tipoAnimal);
		this.arvorePreferida = arvorePreferida;
	}

//4- Crie m�todos
	@Override
		public void EmitirSom (String emitirSom)
		{
			System.out.println("A "+getTipoAnimal()+" ama subir em �rvores do tipo "+arvorePreferida+" e n�o emite som, porque afinal, � uma pregui�a");
		}
}
