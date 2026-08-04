// Classe pai
class Animal {
    // 1) Atributo "nome" (String)
    String nome;

    // 2) Construtor que recebe nome
    Animal(String nome){
        this.nome = nome;
    }

    // 3) Método emitirSom() que imprime "..."
    void emitirSom(){
        System.out.println("...");
    }
}

// Classe filha 1
class Cachorro extends Animal {
    // 4) Construtor que chama super(nome)
    Cachorro(String nome){
        super(nome);
    }

    // 5) Sobrescreva emitirSom() com "Au au!"
    @Override
    void emitirSom(){
        System.out.println("Au au!");
    }
}

// Classe filha 2
class Gato extends Animal {
    // 6) Construtor que chama super(nome)
    Gato(String nome){
        super(nome);
    }

    // 7) Sobrescreva emitirSom() com "Miau!"
    @Override
    void emitirSom(){
        System.out.println("Miau!");
    }
}

// Classe principal com o main
public class Heranca {
    public static void main(String[] args) {
        // 8) Crie um Cachorro e um Gato e chame emitirSom() nos dois

        Cachorro c = new Cachorro("Rex");
        c.emitirSom();

        Gato g = new Gato("Garfield");
        g.emitirSom();

    }
}
