import java.util.ArrayList;

public class ListaCursos {

    public static void main(String[] args) {

        // 1) Crie um ArrayList de String chamado "cursos"
        ArrayList<String> cursos = new ArrayList<>();

        // 2) Adicione 3 cursos à lista (pode inventar os nomes)
        cursos.add("Java");
        cursos.add("Python");
        cursos.add("JavaScript");

        // 3) Imprima o tamanho da lista
        System.out.println(cursos.size());

        // 4) Remova um curso pelo nome
        cursos.remove("Python");

        // 5) Use um for-each para imprimir todos os cursos restantes
        for(String curso : cursos){
            System.out.println(curso);
        }

    }
}
