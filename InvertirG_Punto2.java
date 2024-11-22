import java.util.Stack;
public class InvertirG_Punto2 {
    public static void invertir(String cadena){
        Stack<Character> pila = new Stack<>();
        for (char c : cadena.toCharArray()) {
            pila.push(c);
        }

        StringBuilder cadenaInvertida = new StringBuilder();
        while (!pila.isEmpty()) {
            cadenaInvertida.append(pila.pop());
        }
        System.out.println("Cadena invertida: " + cadenaInvertida);
        System.out.println("Cadena original: " + cadena);
        System.out.println("Numero de caracteres: " + cadena.length());
    }
}
