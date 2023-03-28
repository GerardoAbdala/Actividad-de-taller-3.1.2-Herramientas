import java.util.Scanner;

public class Actividad {

    public static void main(String[] args) {
        int x=0;
        int y=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de x: ");
        x = sc.nextInt();
        System.out.println("Ingrese el valor de y: ");
        y = sc.nextInt();
        if(x>0 && y>0){
            System.out.println("El punto se encuentra en el primer cuadrante");
        }else if(x<0 && y>0){
            System.out.println("El punto se encuentra en el segundo cuadrante");
        }else if(x<0 && y<0){
            System.out.println("El punto se encuentra en el tercer cuadrante");
        }else if(x>0 && y<0){
            System.out.println("El punto se encuentra en el cuarto cuadrante");
        }else if(x==0 && y==0){
            System.out.println("El punto se encuentra en el origen");
        }else if(x==0 && y!=0){
            System.out.println("El punto se encuentra sobre el eje Y");
        }else if(x!=0 && y==0){
            System.out.println("El punto se encuentra sobre el eje X");
        }
    }
    
}
