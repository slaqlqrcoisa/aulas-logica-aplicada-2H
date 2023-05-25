public class Main {
    public static void main(String[] args) {
      // Aula introdutória de Orientação a Objetos
        // Declaração do objeto
          Pessoa adao;
        // Instanciação do objeto
          adao = new Pessoa();
        // Ao mesmo tempo
          Pessoa qualquer = new Pessoa();
        // Definir formato do objeto
        qualquer.nome = "Rita";
        qualquer.nome = "Lee";
        qualquer.falar();
        System.out.println(qualquer.falar("oi"));

// Declarar objeto
        Pessoa rainha;
        //instanciar objetos
        rainha = new Pessoa();

        //Definir forma do objeto
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";

        // Definição do comportamento


        rainha.falar();
    }
}