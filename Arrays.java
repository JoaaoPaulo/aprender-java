public class Arrays {

    public static void main(String[] args) {

        String nomes[] = {"João", "Maria", "Pedro", "Ana"};


        // 2) Imprima o primeiro e o último nome do array
        System.out.println(nomes[0]);
        System.out.println(nomes[3]);


        // 3) Use um for para imprimir TODOS os nomes, um por linha
        int i;
        for(i=0; i<4; i++){
            System.out.println(nomes[i]);
        }

    }
}
