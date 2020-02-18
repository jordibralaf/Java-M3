//Author: Jordi Brasó
package p21;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P21 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        keyboard.useDelimiter("\n");

        int option = -1;

        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//inicio switch
                case 1:
                    Array1();
                    break;

                case 2:
                    Array2();
                    break;

                case 3:
                    Array3();
                    break;

                case 4:
                    pedirValoresArray();
                    break;

                case 5:
                    altura1();
                    break;

                case 6:
                    altura2();
                    break;

                case 7:
                    dias();
                    break;

                case 8:
                    dni();
                    break;

                case 9:
                    invento();
                    break;

                default:
                    System.out.println("Good Bye!");
            }//switch final
        }
    }

    private static void userMenu() {
        System.out.println("");
        System.out.println("Choose one exercise:");
        System.out.println("1- Array 1");
        System.out.println("2- Array 2");
        System.out.println("3- Array 3");
        System.out.println("4- Pedir Valores Array");
        System.out.println("5- Pedir altura V1");
        System.out.println("6- Pedir altura V2");
        System.out.println("7- Dias de la semana");
        System.out.println("8- Calcular letra del DNI");
        System.out.println("9- Caso inventado");
        System.out.println("Insert 0 to exit");
        System.out.print("\nYour asnwer: ");
    }

    private static void Array1() {
        System.out.println("*****  Exercise 1 *****");

        int[] array = new int[]{7, 12, 13, 16, 18};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("");
        System.out.println("*****  Exercise finished *****");
    }

    private static void Array2() {
        System.out.println("*****  Exercise 2 *****");

        int arrayIVA[] = new int[]{0, 4, 10, 21};

        for (int i = 0; i < arrayIVA.length; i++) {
            System.out.println(arrayIVA[i]);
        }

        System.out.println("");
        System.out.println("*****  Exercise finished *****");
    }

    private static void Array3() {
        System.out.println("*****  Exercise 3 *****");

        int arrayIVA[] = new int[4];

        arrayIVA[0] = 0;
        arrayIVA[1] = 4;
        arrayIVA[2] = 10;
        arrayIVA[3] = 21;

        for (int i = 0; i < arrayIVA.length; i++) {
            System.out.println(arrayIVA[i]);
        }

        System.out.println("");
        System.out.println("*****  Exercise finished *****");
    }

    private static void pedirValoresArray() {
        System.out.println("*****  Exercise 4 *****");

        int array[] = new int[4];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Inserte el valor " + i + ": ");
            array[i] = keyboard.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("");
        System.out.println("*****  Exercise finished *****");
    }

    private static void altura1() {
        System.out.println("*****  Exercise 5 *****");

        System.out.print("How many students are in the class? ");
        int num = keyboard.nextInt();

        double array_altura[] = new double[num];
        String array_nombres[] = new String[num];

        System.out.println("");
        for (int i = 0; i < num; i++) {
            System.out.print("Insert the name of student " + i + ": ");
            array_nombres[i] = keyboard.next();
            System.out.print("Insert the height of student " + i + ": ");
            array_altura[i] = keyboard.nextDouble();
        }

        System.out.println("");
        for (int i = 0; i < num; i++) {
            System.out.println("The student " + array_nombres[i] + " and the height is: " + array_altura[i]);
        }

        System.out.println("");
        System.out.println("*****  Exercise finished *****");
    }

    private static void altura2() {
        System.out.println("*****  Exercise 6 *****");

        double suma = 0;
        //Preguntamos num estudiantes
        System.out.print("How many students are in the class? ");
        int num = keyboard.nextInt();

        double array_altura[] = new double[num];
        String array_nombres[] = new String[num];

        //Nombre y altura de estudiantes
        System.out.println("");
        for (int i = 0; i < num; i++) {
            System.out.print("Insert the name of student " + i + ": ");
            array_nombres[i] = keyboard.next();
            System.out.print("Insert the height of student " + i + ": ");
            array_altura[i] = keyboard.nextDouble();
        }

        //Visualizamos nombre y altura
        System.out.println("");
        for (int i = 0; i < num; i++) {
            System.out.println("The student " + array_nombres[i] + " and the height is: " + array_altura[i]);
        }

        double biggest, smallest;
        int posBiggest = 0, posSmallest = 0;
        biggest = array_altura[0];
        smallest = array_altura[0];

        //Calculamos más alto y más bajo
        for (int i = 0; i < array_altura.length; i++) {
            if (array_altura[i] > biggest) {
                biggest = array_altura[i];
                posBiggest = i;
            }
            if (array_altura[i] < smallest) {
                smallest = array_altura[i];
                posSmallest = i;
            }
        }
        System.out.println("");

        //Enseñamos el más alto y el más bajo
        System.out.println("");
        System.out.println("The student with the highest height is " + array_nombres[posBiggest] + " with " + biggest);
        System.out.println("The student with the smallest height is " + array_nombres[posSmallest] + " with " + smallest);

        //Calculamos y enseñamos media de notas
        DecimalFormat df = new DecimalFormat("#.00");
        for (int i = 0; i < array_altura.length; i++) {
            suma += array_altura[i];
        }
        double media = (suma / array_altura.length);
        System.out.println("");
        System.out.println("The average of height is: " + df.format(media));

        System.out.println("");
        System.out.println("*****  Exercise finished *****");
    }

    private static void dias() {
        System.out.println("*****  Exercise 7 *****");

        String dias[] = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < dias.length; i++) {
            System.out.print("Insert one day: ");
            int day = keyboard.nextInt();
            System.out.println(dias[day]);
            break;
        }

        System.out.println("");
        System.out.println("*****  Exercise finished *****");
    }

    private static void dni() {
        System.out.println("*****  Exercise 8 *****");

        System.out.print("Insert you ID Card: ");
        int dni = keyboard.nextInt();

        char caracteres[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = dni % 23;

        System.out.println("The letter of your ID Card is: " + caracteres[resto]);

        System.out.println("");
        System.out.println("*****  Exercise finished *****");
    }

    private static void invento() {
        System.out.println("*****  Exercise 9 *****");

        double suma = 0;

        //pedimos usuario y numero asignaturas
        String login = "jordi", password = "2019";
        int cont;
        System.out.print("Insert your username: ");
        login = keyboard.next();
        cont = 1;
        do {
            System.out.print("Insert your password: ");
            password = keyboard.next();
            System.out.println("");

            if (login.equals("jordi") && password.equals("2019")) {
                System.out.println("You're in");
                System.out.println("");
                System.out.print("Number of subjects: ");
                int subjects = keyboard.nextInt();

                int[] array_notas = new int[subjects];
                String[] array_asignaturas = new String[subjects];
                int notaA = 0;
                String asignaturaA;

                //bucle num asignaturas y notas
                for (int i = 0; i < subjects; i++) {
                    int numero_asignatura = i + 1;
                    int num_subject = i + 1;
                    do {
                        System.out.println("");
                        System.out.print("What is the name of subject number " + numero_asignatura + "? ");
                        String subject1 = keyboard.next();
                        asignaturaA = subject1;
                        array_asignaturas[i] = subject1;

                        System.out.print("What is the mark of Subject " + numero_asignatura + "? ");
                        int nota1 = keyboard.nextInt();
                        notaA = nota1;
                    } while (!comprobarNotas(notaA));
                    array_notas[i] = notaA;

                }

                //Visualizamos array
                for (int i = 0; i < subjects; i++) {
                    System.out.println("");
                    System.out.println("The mark of subject " + array_asignaturas[i] + " is: " + array_notas[i]);
                }

                int biggest, smallest;
                int posBiggest = 0, posSmallest = 0;
                biggest = array_notas[0];
                smallest = array_notas[0];

                //Calculamos mayor y menor nota
                for (int i = 0; i < array_notas.length; i++) {
                    if (array_notas[i] > biggest) {
                        biggest = array_notas[i];
                        posBiggest = i;
                    }
                    if (array_notas[i] < smallest) {
                        smallest = array_notas[i];
                        posSmallest = i;
                    }
                }
                System.out.println("");

                //Enseñamos mayor y menor nota
                System.out.println("");
                System.out.println("The best mark is: " + biggest + " of subject: " + array_asignaturas[posBiggest]);
                System.out.println("The worst mark is: " + smallest + " of subject: " + array_asignaturas[posSmallest]);

                //Calculamos y enseñamos media de notas
                DecimalFormat df = new DecimalFormat("#.00");
                for (int i = 0; i < array_notas.length; i++) {
                    suma += array_notas[i];
                }
                double media = (suma / array_notas.length);
                System.out.println("");
                System.out.println("The average of marks is: " + df.format(media));

                //Asignaturas aprobadas y suspendidas
                int numSuspendidas = 0;
                int numAprobadas = 0;
                ArrayList<String> suspendidas = new ArrayList<String>();
                ArrayList<String> aprobadas = new ArrayList<String>();
                for (int i = 0; i < subjects; i++) {

                    if (array_notas[i] < 5) {
                        numSuspendidas++;
                        suspendidas.add(array_asignaturas[i]);
                    } else {
                        numAprobadas++;
                        aprobadas.add(array_asignaturas[i]);
                    }
                }
                if (numSuspendidas == 0) {
                    System.out.println("");
                    System.out.println("You pass all the subjects!!");
                } else {
                    System.out.println("");
                    System.out.println("You didn't pass " + numSuspendidas + " subjects");
                    for (int i = 0; i < suspendidas.size(); i++) {
                        System.out.println("The subjects you didn't pass are: " + suspendidas.get(i));
                    }
                    System.out.println("");
                    System.out.println("You have passed " + numAprobadas + " subjects");
                    for (int i = 0; i < aprobadas.size(); i++) {
                        System.out.println("The subjects you pass are: " + aprobadas.get(i));
                    }
                }
            } else {
                System.out.println("Error, repeat please");
            }
            cont++;
        } while ((!login.equals("jordi") || !password.equals("2019")) && cont <= 3);

        System.out.println("");
        System.out.println("*****  Exercise finished *****");
    }

    public static boolean comprobarNotas(int nota) {

        if (nota < 0 || nota > 10) {
            return false;
        } else {
            return true;
        }
    }
}
