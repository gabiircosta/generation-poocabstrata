//1-Crie a classe
public class Preguica extends Animal {

//2-Distribua atributos
	private String arvorePreferida;

//3-Construtor+ parâmetros+ inicialização de atributos
	public Preguica (String nome, int idade, String som, String movimento, String tipoAnimal, String arvorePreferida)
	{
		super(nome, idade, som, movimento, tipoAnimal);
		this.arvorePreferida = arvorePreferida;
	}

//4- Crie métodos
	@Override
		public void EmitirSom (String emitirSom)
		{
			System.out.println("A "+getTipoAnimal()+" ama subir em árvores do tipo "+arvorePreferida+" e não emite som, porque afinal, é uma preguiça");
		}
}
