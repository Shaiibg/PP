import javax.swing.JOptionPane;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Operacion deseada:\n1: Suma \n2: Resta \n3: Multiplicacion \n4: Division \n5: Potencia");
        int operacion=entrada.nextInt();
        double numero1=Double.parseDouble(JOptionPane.showInputDialog("Numero1"));
        double numero2=Double.parseDouble(JOptionPane.showInputDialog("Numero2"));
        switch (operacion){
            case 1:
                System.out.println("La suma de los numero es=" + (numero1+numero2));
                break;
            case 2:
                System.out.println("La resta de los numeros es=" + (numero1-numero2));
                break;
            case 3:
                System.out.println("la multiplicacionde los numeros es=" + (numero1*numero2));
                break;
            case 4:
                System.out.println("La division de los numeros es=" + (numero1/numero2));
                break;
            case 5:
                System.out.println(numero1 + " elevado a " + numero2 + " es=" + (Math.pow(numero1,numero2)));
                break;
            default:
                System.out.println("Opcino disponible");
        }
    }
}
