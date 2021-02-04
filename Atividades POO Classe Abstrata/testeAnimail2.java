//1-Criar classe
public class testeAnimail2 {

//2-Criar Main
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

//3-Instanciar objetos
		//Aqui você tentou fazer vazio... não conseguiu porque em momento
		//nenhum vc deu resposta a cada um dos atributos... por isso que o do
		//prof deu certo e o seu não.
		Cachorro dog = new Cachorro ("Nina",7, "auau", "anda", "Cachorro", "Dalmata");
		Cavalo horse = new Cavalo ("Bretão",5, "hihihihi", "cavalga", "Cavalo","EUA");
		Preguica sloth = new Preguica ("Sid",3,"no noise", "dorme", "Preguiça","Eucalipto");
		
		dog.EmitirSom("auauau");
		horse.EmitirSom("hihihihin");
		sloth.EmitirSom(null);
	}

}
