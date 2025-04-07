public class Exemplo {
    public static void main(String[] args) {
        byte b1, b2;
        short s1 = 256;
        b1 = (byte)s1;
        System.out.println("valor de s1 eh: " + s1);
        System.out.println("valor de b1 eh: " + b1);

        int i1 = 255;
        b2 = (byte)i1;
        System.out.println("valor de i1: " + i1);
        System.out.println("valor de b2: " + b2);
    }
}
