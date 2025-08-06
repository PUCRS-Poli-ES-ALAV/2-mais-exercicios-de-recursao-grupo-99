import java.util.ArrayList;
import java.util.Arrays;

public static void main(String[] args) {

    System.out.println("Exercicio 2: somatório = " + somatorio(3));
    System.out.println("Exercicio 3: fibonacci = " + fibonacci(7));
    System.out.println("Exercicio 4: soma entre = " + somaEntre(4, 5));
    System.out.println("Exercicio 5: is pal = " + isPal("osso"));
    System.out.println("Exercicio 6: binario = " + convBase2(13));
    System.out.println("Exercicio 7: soma array = " + somatorioArray(new ArrayList<>(Arrays.asList(1, 2, 3))));
    System.out.println("Exercicio 8: maior int = " + findBiggest(new ArrayList<>(Arrays.asList(8, 1, 10, 2, 3))));
    System.out.println("Exercicio 9: is substring = " + findSubStr("hahahabatatahahaha", "batata"));

}


/* E2:
    1) Assinatura:
        int somatorio(int n)

    2) O que ele faz?
        Faz a soma dos numeros de 0 até "n"

    3) Casos de erro:


    4) Casos base:
        n = 0 -> retorna 0
    5) Casos recursivos:
        n > 0 -> n + somatorio(n-1)
*/
public static int somatorio(int n) {
    if (n == 0)
        return 0;

    return n + somatorio(n - 1);
}

/* E3:
    1) Assinatura:
        int fibonacci(int pos, int val)

    2) O que ele faz?
        Calcula o n-esimo numero da sequencia fibonacci

    3) Casos de erro:
        n < 0 e n = 0

    4) Casos base:
        n = 0 -> retorna 0
    5) Casos recursivos:
        n > 0 -> n + somatorio(n-1)
*/
public static int fibonacci(int n) {
    if (n <= 1)
        return n;

    return fibonacci(n - 1) + fibonacci(n - 2);
}

/* E4:
        1) Assinatura:
            int SomaEntre(int a, int b)

        2) O que ele faz?
            Calcula a dos numeros entre a e b (inclusive)

        3) Casos de erro:
            n/a

        4) Casos base:
            a == b
        5) Casos recursivos:
            b += a + 1
    */
public static int somaEntre(int a, int b) {
    if (a == b)
        return b;

    return a + somaEntre(a + 1, b);
}

/* E5:
        1) Assinatura:
            boolean isPal(String s)

        2) O que ele faz?
            retorna true se uma string é um pallíndromo, false caso contrário

        3) Casos de erro:
            n/a

        4) Casos base:
            s == "";

        5) Casos recursivos:

    */
public static boolean isPal(String s) {


    if (s.length() <= 1) {
        return true;
    }

    if (s.charAt(0) != s.charAt(s.length() - 1)) {
        return false;
    }

    return isPal(s.substring(1, s.length() - 1));

}

/* Exercicio 6) converter um inteiro em sua forma binária e retornar uma string */
public static String convBase2(int n) {

    if (n == 0)
        return "0";

    if (n == 1)
        return "1";

    return convBase2(n / 2) + n % 2;

}

/* Exercicio 7) somatorio dos valores de um arraylist */
public static int somatorioArray(ArrayList<Integer> ar) {
    if (ar.isEmpty())
        return 0;

    return ar.removeFirst() + somatorioArray(ar);
}

/* Exercicio 8) achar o maior inteiro em um array */
public static int findBiggest(ArrayList<Integer> ar) {
    if (ar.size() == 1)
        return ar.getFirst();

    if (ar.getFirst() > ar.getLast()) {
        ar.removeLast();
    } else {
        ar.removeFirst();
    }

    return findBiggest(ar);
}

/* Exercicio 9) verificar se um string esta contido em outro */
public static boolean findSubStr(String str, String match) {
    if (str.length() < match.length())
        return false;

    if (str.substring(0, match.length()).equals(match)){
        return true;
    }

    return findSubStr(str.substring(1), match);
}

/* Exercicio 10) Determinar o numero de digitos de um inteiro */
public static int nroDigit(int n) {

    return 0;
}