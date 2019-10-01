package excepcion;

import javax.swing.JOptionPane;

/**
 *
 * @author luill
 */
public class Excepcion {

  
    public static void main(String[] args) {
       operacion();
       
    }
    public static void operacion(){
       float resultado=0;
     try{
          float numero =Integer.parseInt(JOptionPane.showInputDialog( "Bienvenido, por favor ingrese el primer numero (Entero): "));
        float numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero (Divisor): "));
      if(numero<10 && numero1<10){
        resultado=numero/numero1;
        JOptionPane.showMessageDialog(null,"Resultado: "+ resultado);
     }
      else{ 
          JOptionPane.showMessageDialog(null,"El numero ingresado es mayor a 10");
        }
     }
     catch(NumberFormatException as){
     JOptionPane.showMessageDialog(null,"Ha ingresado una cadena en una variable entera: \n"+ as);
     }
     catch(ArithmeticException fo){
     JOptionPane.showMessageDialog(null, "Existe una division por 0: \n"+ fo.getMessage());
     }
       JOptionPane.showMessageDialog(null,"El resultado de la division es: " + resultado);
}}

