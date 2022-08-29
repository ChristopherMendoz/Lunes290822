package clasepractica;

import java.util.Scanner;

public class CalculoDeSalarioNeto {
	
	final static double TASA_INSS=7,TASA_SINDICATO=1,TASA_ANTIGUEDAD=15,TASA_INSSPATRONAL=22.5,TASA_IR=15.6;
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		double inss ,ir,sindicato,inssPatronal, antiguedad;
		double montoINSS,montoIR,montoSindicato,montoAntiguedad ,montoINSSPatronal;
		double ingresoBruto , ingresoTotal,totalDeducciones,ingresoNeto;
		
		System.out.println("Ingreso Bruto (Basico) = C$");
	    ingresoBruto=lector.nextInt();
		System.out.println("Ingrese los años de antiguedad");
		antiguedad=lector.nextInt();
		
		montoAntiguedad=ingresoBruto*TASA_ANTIGUEDAD/100;
		montoSindicato=ingresoBruto/TASA_SINDICATO/100;
		ingresoTotal=ingresoBruto+montoAntiguedad;
		montoINSS=ingresoTotal*TASA_INSS/100;
		montoIR=ingresoTotal*TASA_IR/100;
		totalDeducciones=montoINSS+montoIR+montoSindicato;
		
		montoINSSPatronal=ingresoTotal+TASA_INSSPATRONAL/100;
		ingresoNeto=ingresoTotal-totalDeducciones;
		
		System.out.println("---------Tasas---------");
		System.out.println("Tasa del inss="+TASA_INSS+"&");
		System.out.println("Tasa del ir="+TASA_IR+"&");
		System.out.println("Tasa de afiliacion del sindicato="+TASA_SINDICATO+"&");
		System.out.println("Tasa de antiguedad="+TASA_ANTIGUEDAD+"&");
		System.out.println("inssPatronal="+TASA_INSSPATRONAL+"&");
		System.out.println("---------Ingresos Del Empleado---------");
		System.out.println("Ingreso Bruto (Basico) = C$"+ingresoBruto);
		System.out.println("Antiguedad = C$"+montoAntiguedad);
		System.out.println("Ingreso Total = C$"+ingresoTotal);
		System.out.println("---------Deducciones Del Empleado---------");
		System.out.println("------deducciones Sobre el ingreso bruto------");
		System.out.println("Monto del Sindicato = C$"+montoSindicato);
		System.out.println("------deducciones Sobre el ingreso total------");
		System.out.println("Monto del Inss = C$"+montoINSS);
		System.out.println("Monto del IR = C$"+montoIR);
		System.out.println("Total de Deducciones = C$"+totalDeducciones);
		System.out.println("------deducciones del empleador------");
		System.out.println("Monto del INSS Patronal = C$"+montoINSSPatronal);
		System.out.println("------Total a Pagar------");
		System.out.println("Ingreso Neto = C$"+ingresoNeto);
		
	
       lector.close();
	}

}
