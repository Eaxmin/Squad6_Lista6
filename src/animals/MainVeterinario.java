package animals;

public class MainVeterinario {

	public static void main(String[] args) {
		
		Veterinario vet = new Veterinario();
		
		Cachorro cachorro = new Cachorro("Crypto", 3);
    	Cavalo cavalo = new Cavalo("Plotka", 5);
        Preguica preguica = new Preguica("Flash", 12);
        
        System.out.println(vet.examinar(cachorro));
        System.out.println(vet.examinar(cavalo));
        System.out.println(vet.examinar(preguica));

	}

}
