package animals;

public class Main {

	public static void main(String[] args) {
		
		
        Cachorro cachorro = new Cachorro("Crypto", 3);
        System.out.println(cachorro.emitirSom());
        
    	Cavalo cavalo = new Cavalo("Plotka", 5);
        System.out.println(cavalo.emitirSom());

        Preguica preguica = new Preguica("Flash", 12);
        System.out.println(preguica.emitirSom());
		

	}

}
