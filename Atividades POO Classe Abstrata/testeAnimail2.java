//1-Criar classe
public class testeAnimail2 {

//2-Criar Main
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

//3-Instanciar objetos
		//Aqui voc� tentou fazer vazio... n�o conseguiu porque em momento
		//nenhum vc deu resposta a cada um dos atributos... por isso que o do
		//prof deu certo e o seu n�o.
		Cachorro dog = new Cachorro ("Nina",7, "auau", "anda", "Cachorro", "Dalmata");
		Cavalo horse = new Cavalo ("Bret�o",5, "hihihihi", "cavalga", "Cavalo","EUA");
		Preguica sloth = new Preguica ("Sid",3,"no noise", "dorme", "Pregui�a","Eucalipto");
		
		dog.EmitirSom("auauau");
		horse.EmitirSom("hihihihin");
		sloth.EmitirSom(null);
	}

}
