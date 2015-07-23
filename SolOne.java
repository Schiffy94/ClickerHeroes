/**
 * @(#)SolOne.java
 *
 * Solomon 1:1 ratio calculator --> Solomon Level Requirement Calculator
 *
 * @author Marc Sciffres
 * @version 1.00 2015/7/21
 * @version 1.10 2015/7/23 - changed scope of program
 */
import java.io.*;
import java.util.Scanner;
import java.lang.*;
import static java.lang.System.out;

public class SolOne {
    public static void main(String[] args) {
    	double souls, zone, solBonus, solLevel;
    	Scanner read = new Scanner(System.in);
    	//Formula: HS = (((Level-80)/25)^1.3)*(1+SolomonBonus)
    	out.println("This calculator will determine what Solomon level is needed to obtain a desired amount of \nHero Souls from a primal boss at a given zone.");
    	out.print("Enter desired Hero Souls: ");
    	souls = read.nextDouble();
		out.print("Enter desired zone to obtain "+souls+" Hero Souls: ");
		zone = read.nextDouble();
		while(zone%5 != 0) {
			out.print("There is no boss at zone "+zone+".");
			out.print("Enter desired zone to obtain "+souls+" Hero Souls: ");
			zone = read.nextDouble();
		}
    	double temp = Math.pow(((zone-80)/25), 1.3);
    	temp = (souls/temp)-1;
    	solBonus = Math.floor(temp*100);
		if(solBonus <= 0) {
			out.println("You do not need to purchase Solomon to obtain "+souls+" Hero Souls at zone "+zone+".");
		}
		else {
			out.println("Required Solomon bonus: "+solBonus+"% boost to Primal Hero Souls.");
			if(solBonus >= 281) { solLevel = solBonus-200; }
			else if(solBonus >= 242) { solLevel = (solBonus-120)/2; }
			else if(solBonus >= 183) { solLevel = (solBonus-60)/3; }
			else if(solBonus >= 104) { solLevel = (solBonus-40)/4; }
			else { solLevel = solBonus/5; }
			out.println("Required Solomon level: "+Math.floor(solLevel));
		}
    }
}
