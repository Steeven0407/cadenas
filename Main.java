package ej2;


import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String a;
        System.out.println("Digite su cadena");
        a = sc.next();
        
        System.out.println("Digite la opcion a realizar");
        System.out.println("1:concatenar");
        System.out.println("2:potencia");
        System.out.println("3:longitud");
        System.out.println("4:reflexion");
        System.out.println("5:Subcadena");
        System.out.println("6:Subfijo");
        System.out.println("7:Prefijo");

        while(sc.hasNext()){
        int b=sc.nextInt();

        if(b==1){
            System.out.println(concatenar(a));
        }else{
            if(b==2){
                System.out.println( potencia(a));
            }else{
                if(b==3){
                    System.out.println("la longitud es:"+ longitud(a));
                }else{
                    if(b==4){
                      System.out.println(reflexion(a));
                    }else{
                        if(b==5){
                            System.out.println(subCadena(a));
                        }else{
                            if(b==6){
                                System.out.println(Prefijo(a));
                            }else{
                                if(b==7){
                                    System.out.println(subfijo(a));
                                }
                            }
                        }
                    }
                }
            }
        }
            System.out.println("Digite la siguiente opcion");
        }
    }
    //1
    static public String concatenar(String a){
        String salida;
        String b;
        System.out.println("Digite la segunda cadena");
        b= sc.next();

        salida = a+b;
        return salida;
    }
    
    //2
    static public String potencia(String a){
        String salida="";
        int b;
        System.out.println("Digite la potencia");
        b= sc.nextInt();

        for (int j = 0; j < b; j++) {
            salida+=a;
        }

        return salida;
    }

    //3
    static public int longitud(String a){
        return a.length();
    }

    //4
    static public String reflexion(String a){
         return new StringBuilder(a).reverse().toString();
    }
    
    //5
    static public String subCadena(String a){
        return a.substring(0, a.length()/2);
    }
    
    //6
    static public boolean Prefijo(String a){
        System.out.println("Digite el prefijo a buscar");
        String b = sc.next();
        System.out.println("Prefijo:");
       return a.startsWith(b);
    }
    
    //7
    static public boolean subfijo(String a){
        System.out.println("Digite el Subfijo a buscar");
        String b = sc.next();
        System.out.println("Subfijo:");
        return a.endsWith(b);
    }
    
}
