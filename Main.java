public class Main {
    public static void main(String[] args) {

        // Prueba: lista de Integer
        Lista<Integer> listaInt = new Lista<Integer>();
        //Añade a la lista los numeros del 1 al 9
        for(int i =1;i<10;i++){
            listaInt.add(i);
        }
        System.out.println("Mostrando lista de Integer");
        System.out.println(listaInt.toString());
        System.out.println("\n --------------- \n");


        //Prueba: lista de String
        //Se añade la
        Lista<String> listaString = new Lista<>();
        listaString.add("Primer elemento");
        System.out.println("Mostrando elemento en el índice 0: ");
        System.out.println(listaString.get(0));
        System.out.println("--------");
        System.out.println("Cambiando por el String \"Hola Mundo\"");
        System.out.println("Mostrar elemento en el índice 0");
        listaString.set(0, "Hola Mundo");
        System.out.println(listaString.get(0));
    }    
}