import java.util.*;


public class punto9 {
    Scanner sc= new Scanner(System.in);

    public void menu(){
        Stack<Integer>pila= new Stack<>();
        //pila aleatoria y organizada de manera ascen
        for (int i = 0; i < 10; i++) {
            int n= (int)(Math.random()* 10+ 1);
            pila.push(n);
            System.out.println("Numero: " + n + "  Factorial:  " + factorial(n));
        }
        System.out.println("Pila original "+ pila);
        List<Integer> lista = new ArrayList<>(pila);
        Collections.sort(lista);
        System.out.println("Pila organizada en orden ascendente: "+ lista);

        //pila organizada de manera descen
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println("Pila organizada en orden descendente : "+ lista);

        //eliminar un num de la pila
        int num=0;
        System.out.println("Ingrese el numero a eliminar: ");
        num= sc.nextInt();
        pila.removeElement(num);
        System.out.println("Pila despues de eliminar "+ num + ": " + pila);


    }
    //factorial de los nums de la pila
    public int factorial(int n){
            if (n == 0 || n == 1)
            return 1;
            else {
                return n * factorial(n - 1);
            }
    }
}
