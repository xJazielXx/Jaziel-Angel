import java.util.Scanner;

public class ep01_PrimerExamenParcial {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opc;





        // --- Constantes de Precios ---
        final double P_EST = 50.0;
        final double P_ADL = 90.0;
        final double P_SEN = 60.0;



        // --- Contadores ---
        int contEst = 0, contAdul = 0, contSen = 0;
        int contH = 0, contM = 0;
        int contRechazados = 0, contAsistentes = 0;
        int sumaEdades = 0;

        

        // --- Acumuladores de dinero ---
        double dineroEst = 0, dineroAdul = 0, dineroSen = 0;



        do {
            System.out.println("\n--- Nueva Venta ---");

            // Pedimos la edad y decidimos si entra o no
            System.out.print("Dime tu edad: ");
            int edad = sc.nextInt();

            if (edad < 13) {
                System.out.println("Lo siento, no puedes entrar. (Rechazado)");
                contRechazados++;
            } else {
                contAsistentes++;
                sumaEdades += edad;

                // Tipo de comprador
                System.out.print("Tipo comprador (A)Adulto, (E)=Estudiante, (T)=Tercera Edad): ");
                char tipo = Character.toUpperCase(sc.next().charAt(0));

                switch (tipo) {
                    case 'A':


                        contAdul++;
                        dineroAdul += P_ADL;
                        break;
                    case 'E':
                        contEst++;
                        dineroEst += P_EST;
                        break;
                    case 'T':
                        contSen++;
                        dineroSen += P_SEN;
                        break;


                    default:
                        System.out.println("Tipo no válido.");
                        break;


                }

                



                System.out.print("Sexo (H=Hombre, M=Mujer): ");
                char sexo = Character.toUpperCase(sc.next().charAt(0));
                if (sexo == 'H') contH++;
                else if (sexo == 'M') contM++;

                
                System.out.println("¡Bienvenido! Edad: " + edad + " años, Tipo: " + tipo + ", Sexo: " + sexo);

            }

            System.out.print("\n¿Desea registrar otra venta? [S/N]: ");
            opc = Character.toUpperCase(sc.next().charAt(0));

        } while (opc == 'S');

        // --- Cálculos finales ---
        double promedioEdad = (contAsistentes > 0) ? (double) sumaEdades / contAsistentes : 0;
        double totalDinero = dineroEst + dineroAdul + dineroSen;

        //juntamos lo de las variables para juntarlo con el texto que corresponda
        System.out.println("\n===== REPORTE FINAL =====");
        System.out.println("--- Estadísticas del Público ---");
        System.out.println("Total Estudiantes: " + contEst);
        System.out.println("Total Adultos: " + contAdul);
        System.out.println("Total Tercera Edad: " + contSen);
        System.out.println("Total Hombres: " + contH);
        System.out.println("Total Mujeres: " + contM);
        System.out.println("Total asistentes: " + contAsistentes);
        System.out.println("Promedio de edad: " + promedioEdad);
        System.out.println("Total rechazados por edad: " + contRechazados);

        System.out.println("\n--- Reporte de Ingresos ---");
        System.out.println("Ingresos Estudiantes: $" + dineroEst);
        System.out.println("Ingresos Adultos: $" + dineroAdul);
        System.out.println("Ingresos Tercera Edad: $" + dineroSen);
        System.out.println("Ingresos Totales: $" + totalDinero);

//usando un if vemos si el dinero es menor de 1500 genero bajas ganancias, moderadas,o buenas
        System.out.println("\n--- Rentabilidad ---");
        if (totalDinero < 1500) {

            System.out.println("La función generó BAJAS ganancias.");
        } else if (totalDinero <= 3500) {
            System.out.println("La función generó ganancias MODERADAS.");
        } else {
            System.out.println("La función generó BUENAS ganancias.");
        }


        sc.close();


    }




}


/*  Preguntas teoricas, contesta con tus propias palabras, aqui mismo

1. ¿ Qué estructura utilizaste para determinar el tipo de comprador y por que no otra estructura?
R= Use un switch por que son varias respuestas multiples

2. ¿ Qué tipo de dato elegiste para las variables que cuentan el tipo de público que asiste a la función y por qué fue la mejor opción?
R=Entero int, por que ahi se guardan los enteros

3. ¿ Qué tipo de dato elegiste para las variables que almacenan el dinero recaudado y por qué esa fue la mejor opción?
R= Double, por si puede tener decimales el dinero, por si hay centavos


4. Si tuvieras que añadir un nuevo tipo de comprador, 'Socio del Cine', ¿Qué partes exactas de tu código necesitarías modificar?"
R= El contador, acomulador, modificar el switch y los calculos 
*/