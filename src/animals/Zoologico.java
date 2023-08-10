package animals;

public class Zoologico {

	public static void main(String[] args) {
		
		Animal[] jaulas = new Animal[10];
		
		jaulas[0] = new Cachorro("Max", 5);
        jaulas[1] = new Cavalo("Luna", 7);
        jaulas[2] = new Cachorro("Simba", 2);
        jaulas[3] = new Animal("Bella", 3);
        jaulas[4] = new Cavalo("Rocky", 4);
        jaulas[5] = new Preguica("Daisy", 3);
        jaulas[6] = new Animal("Milo", 5);
        jaulas[7] = new Animal("Chloe", 6);
        jaulas[8] = new Preguica("Zeus", 6);
        jaulas[9] = new Animal("Lily", 6);
        
        for(Animal animal: jaulas) {
        	System.out.println(animal.emitirSom());
        	if(animal instanceof Cachorro) {
        		System.out.println(((Cachorro)animal).correr());
        		
        	} else if (animal instanceof Cavalo) {
        		System.out.println(((Cavalo)animal).correr());
        	}
        }


	}

}
