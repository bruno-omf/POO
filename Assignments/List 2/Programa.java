public class Programa {
    public static void main(String[] args) {
        /*
        Animal animal1 = new Animal("cachorro", 5, true, 7000, "este cachorro eh bonito");
        System.out.println(animal1);
        */

        /*
        Retangulo retangulo1 = new Retangulo(5.0, 10.0);
        Retangulo retangulo2 = new Retangulo(3.0, 9.0);

        System.out.println(retangulo1);
        System.out.println(retangulo2);
        */

        /* 
        Pessoa pessoa1 = new Pessoa("Bruno Oliveira", 23, 1.63, 56.0, "masculino");
        
        System.out.println(pessoa1);
        */

        Pilha pilha1 = new Pilha();

        pilha1.adicionar("Primeiro");
        pilha1.adicionar("Segundo");
        pilha1.adicionar("Terceiro");

        //printa elementos atuais do array.
        pilha1.printElementos();
        
        System.out.println(pilha1.retirar());
        System.out.println(pilha1.retirar());
        System.out.println(pilha1.retirar());
    }
}