public class Metodos {
    public static void main(String[] args) {
        saudacao();
        int resultado = somar(7, 5);
        System.out.println(resultado);
    }

    static void saudacao() {
        System.out.println("Olá, João! Vamos programar!");
    }

    static int somar(int a, int b){
        return a + b;
    }
    
}
