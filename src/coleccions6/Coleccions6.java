
/*Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
*/
package coleccions6;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Coleccions6 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<String, Integer> tiendita = new HashMap();
        int rta;
        tiendita.put("Campera", 25000);
        tiendita.put("Buzo", 12000);
        tiendita.put("Pantalon", 10000);
        tiendita.put("Remera", 8000);
        int i = 0;
        while(i == 0) {
    
        System.out.println("------MENU------");
        System.out.println("1.INTRODUCIR UN PRODUCTO");
        System.out.println("2.MODIFICAR PRECIO");
        System.out.println("3.ELIMINAR PRODUCTO");
        System.out.println("4.MOSTRAR PRODUCTOS");
        System.out.println("5.FINALIZAR");
        rta = leer.nextInt();
        if (rta == 1){
            System.out.println("INGRESE EL NUEVO PRODUCTO");
            String nuevo = leer.next();
            System.out.println("INGRESE EL PRECIO DEL NUEVO PRODUCTO");
            int novo = leer.nextInt();
            tiendita.put(nuevo, novo);   
        }
        if (rta == 2){
            System.out.println("QUE PRODUCTO DESEA MODIFICAR?");
            String aux = leer.next();
            System.out.println("INGRESE PRECIO NUEVO:");
            int a = leer.nextInt();
            tiendita.replace(aux, a);
        }
        
        if (rta == 3){
            System.out.println("Que producto desea eliniar?");
            String elim = leer.next();
            tiendita.remove(elim);
            System.out.println("EL PRODUCTO FUE ELIMINADO");
        }
        if (rta == 4){
            for (Map.Entry<String, Integer> aux : tiendita.entrySet()) {
                String key = aux.getKey();
                Integer value = aux.getValue();
                System.out.println(" PRODUCTO "+ key+ " PRECIO "+ value);
            }
                
            }
        if (rta == 5){
            i = 1;
            System.out.println("EL PROGRAMA SE ESTA CERRANDO...");
        }
        }
        }    
    }
    

