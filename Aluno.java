public class Aluno {

    private String nome;
    private int idade;
    

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos");
    }
    

    public static void main(String[] args) {
        Aluno joao = new Aluno("João", 18);
        joao.apresentar();
    }
}
