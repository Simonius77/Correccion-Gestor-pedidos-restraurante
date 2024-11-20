//correccion  examen programacion Gestor Pedidos restaurante.
import java.util.Scanner;
public class GestorComandesRt{
    public static void main(String[] args){
        //importamos Scanner.
        Scanner entrada = new Scanner(System.in);
        //declaracion de variables.
        int opcion;
        double cuenta=0;
        String historial="";
        String preguntaPlat ="";
        //bucle para mostrar el menu principal de manera recurrente, hasta opcion salir por usuario.
        do{
            System.out.println("Benvinguts al restaurant");
            System.out.println("1 Muestrar la carta ");
            System.out.println("2 realizar el pedido");
            System.out.println("3 Ver el pedido actual");
            System.out.println("4 pagar y salir");
            //recoge la opcion de usuario por teclado.
            opcion=entrada.nextInt();
            //limpia el buffer.
            entrada.nextLine();
            //inicia el menu de opciones
            switch(opcion){
                case 1://muestra el menu de la carta.
                    System.out.println("Benvinguts al restaurant");
                    System.out.println("1 Pizza Margarita");
                    System.out.println("2 Hamburguesa Completa");
                    System.out.println("3 Amanida Cesar");
                    System.out.println("4 Pasta Carbonara");
                    System.out.println("5 Gelat");                  
                break;
                case 2://inicia el pedido por seleccion de la carta de platos
                    do{
                        System.out.println("1 Pizza Margarita");
                        System.out.println("2 Hamburguesa Completa");
                        System.out.println("3 Amanida Cesar");
                        System.out.println("4 Pasta Carbonara");
                        System.out.println("5 Gelat");
                        opcion=entrada.nextInt();
                        entrada.nextLine();
                        switch(opcion){
                            case 1://plato 1 muestra el plato seleccionado y guarda historial y precio
                                cuenta +=8;
                                historial+= "Pizza Margariata 8e\n";
                                System.out.println("Has afegit Pizza Margarita por 8e.");
                            break;
                            case 2:
                                cuenta +=10;
                                historial+= "Hamburguesa Clasica 10e\n";
                                System.out.println("Has afegit Pizza Margarita por 10e.");

                            break;
                            case 3:
                                cuenta +=7;
                                historial+= "Ensalada 7e\n";
                                System.out.println("Has afegit Pizza Margarita por 7e.");
                            
                            break;
                            case 4:
                                cuenta +=9;
                                historial+= "Pasta Carbonara 9e\n";
                                System.out.println("Has afegit Pizza Margarita por 9e.");
                            
                            break;
                            case 5:
                                cuenta +=4;
                                historial+= "Gelat 4e\n";
                                System.out.println("Has afegit Gelat por 4e.");
                            
                            break;
                            default://muestra error por opcion no posible.
                                System.out.println("La opcion elegida no esta en la carta");
                            break;
                        }
                        System.out.print("quiere pedir otro plato (si/no)");//pregunta antes de volver al bucle de la carta
                        preguntaPlat=entrada.nextLine();
                        entrada.nextLine();
                        //gestor de error para comprobar si la respuesta es valida.
                        if(!preguntaPlat.toLowerCase().equals("si") && !preguntaPlat.toLowerCase().equals("no")){
                            System.out.println("la respuesta no es valida ");
                        }
                    }while(preguntaPlat.toLowerCase().equals("si"));
                break;
                case 3://muestra pedido completo realizado.
                    if(historial.length()==0){//comprueva que el pedido no este vacio.
                        System.out.println("No has elegido ningun plato");
                    }else{
                        System.out.print("tu pedido actual es:\n"+historial);
                        System.out.println("Total:"+ cuenta);
                    }
                break;
                case 4://muestra total a pagar y si corresponde aplica descuento
                    System.out.println("Total a pagar: "+ cuenta);
                    if(cuenta > 30){
                        System.out.println("Total a pagar: "+ cuenta * 0.01);
                    }
                    System.out.println("Gracias por su pedido");
                break;
                default:
                    System.out.println("la opcion elegida no esta en el menu de opciones");
                break;
            }
        }while(opcion !=4);//sale del programa por seleccion del usuario por teclado.
        //cierra la entrada de datos por teclado.
        entrada.close();
    }
}