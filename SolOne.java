/**
 * @(#)SolOne.java
 *
 * Solomon 1:1 ratio calculator
 *
 * @author Marc Sciffres
 * @version 1.00 2015/7/21
 */
import java.io.*;
import java.util.Scanner;
import java.lang.*;
import static java.lang.System.out;

public class SolOne {
    public static void main(String[] args) {
    	double souls, solBonus, solLevel;
    	Scanner read = new Scanner(System.in);
    	//Formula: HS = (((Level-80)/25)^1.3)*(1+SolomonBonus)
    	out.println("This calculator will determine what Solomon level is needed to obtain \"n\" \nHero Souls from a primal boss at zone \"n\".");
    	out.print("Input desired Hero Souls: ");
    	souls = read.nextInt();
    	double temp = Math.pow(((souls-80)/25), 1.3);
    	temp = (souls/temp)-1;
    	solBonus = Math.floor(temp*100);
    	out.println("Required Solomon bonus: "+solBonus+"% boost to Primal Hero Souls.");
    	if(solBonus >= 281) { solLevel = solBonus-200; }
    	else if(solBonus >= 242) { solLevel = (solBonus-120)/2; }
    	else if(solBonus >= 183) { solLevel = (solBonus-60)/3; }
    	else if(solBonus >= 104) { solLevel = (solBonus-40)/4; }
    	else { solLevel = solBonus/5; }
    	out.println("Required Solomon level: "+solLevel);
    }
}
