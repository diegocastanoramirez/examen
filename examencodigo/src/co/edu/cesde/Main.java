package co.edu.cesde;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputData=new Scanner(System.in);

        int numper, platoi,contham,contper,contsal,contcho;
        double desc,prop,despr,cuenta,desc2pro;

        System.out.println("ingrese el numero de personas:");
        numper=inputData.nextInt();
        cuenta =0;
        contham=0;
        contper=0;
        contsal=0;
        contcho=0;


        for (int i=1; i<=numper;i=i+1){

            System.out.println("que plato desea 1:hamburgueza 2:perros 3:salchipapa 4:chorizo:");
            platoi=inputData.nextInt();

            if (platoi==1){
                cuenta=cuenta+10000;
                contham=contham+1;

            }
            else if(platoi==2){
                cuenta=cuenta +8000;
                contper=contper+1;

            }
            else if(platoi==3){
                cuenta=cuenta +6000;
                contsal=contsal+1;

            }
            else if(platoi==4){
                cuenta=cuenta +7000;
                contcho=contcho+1;

            }



        }
        if (contham > 1 ||contcho>1 || contsal >1 || contper > 1){
            desc2pro=0.05;
            cuenta =cuenta-cuenta*desc2pro;
            System.out.println("**tiene un descuento adicional por comprar dos productos iguales del 5 %");

        }
        if (cuenta>20000){

            desc=0.10;
            cuenta=cuenta-cuenta*desc;
            System.out.println("**resivio un descuento por compras superiores a 20000 del 10%");
        }
        System.out.println("desea incluir la propina 1: si 2: no");
        prop=inputData.nextInt();

        if (prop==1){
            despr=0.10;
            cuenta=cuenta+cuenta*despr;
            System.out.println("el total de su compra es "+cuenta);
        }
        else if(prop==2){
            System.out.println("el total de su compra es "+cuenta);
        }






        }





    }

