//1- Crie a Classe
public class Cachorro extends Animal {

//2 - Atributos
	private String raca;

//3-Contrutor + par�metros + inicializa��o dos atributos
	public Cachorro (String nome, int idade, String som, String movimento, String tipoAnimal, String raca)
	//se voc� vai deixar esses () vazios, precisa necessariamente dar respostas
   //pra eles nos () abaixo, referente a super. EX: super("Gabi",28,"uhu","anda")
	{
		super(nome, idade, som, movimento,tipoAnimal);
		this.raca=raca;
	}
	
@Override
public void EmitirSom (String emitirSom)
{
	//Aqui vc estava tentando usar tipoAnimal sem usar get... n�o rolou - Ele � private
   //e se voc� pretende pegar alguma informa��o, precisa usar o get
	System.out.println("O "+getTipoAnimal()+" da ra�a "+raca+" e emite o som: "+emitirSom);
}

}
