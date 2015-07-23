/**
 * @(#)AncientLevels.java
 *
 * Ideal Ancient levels (based on midgame Rules of Thumb) calculator - http://redd.it/339m3j
 * Credit for formulae to /u/glitchypenguin and /u/wrigleys26
 * Credit for rules compilation to /u/Awlcer
 *
 * @TODO: Alter program to account for players in any stage of the game (user prompt?)
 * @author Marc Schiffres
 * @version 1.00 2015/7/18
 * @version 1.01 2015/7/23 - added TODO, credits
 */
import java.io.*;
import java.util.Scanner;
import java.lang.*;
import static java.lang.System.out;

public class AncientLevels {
    public static void main(String[] args) {    
		double morg, siya, viagra, gold, click, jug, sol, iris;
		Scanner read = new Scanner(System.in);
		out.print("Enter current Morgulis level: ");
		morg = read.nextInt();
		double b = 43.67; double c = 33.58 - morg;
		siya = Math.floor((-b+Math.sqrt((b*b)-(4*c)))/2);
		viagra = siya+9;
		gold = Math.floor(siya*0.93);
		click = Math.floor(siya*0.5);
		jug = Math.floor(click*0.2);
		sol = Math.floor(siya*0.75);
		iris = sol-300;
		out.println("Current Morgulis level: "+morg);
		out.println("Ideal Siyalatas level: "+siya);
		out.println("Ideal Argaiv Level: "+viagra);
		out.println("Ideal Libertas, Mammon, and Mimzee level: "+gold);
		out.println("Ideal Fragsworth, Bhaal, and Pluto level: "+click);
		out.println("Ideal Juggernaut level: "+jug);
		out.println("Ideal Solomon level: "+sol);
		out.println("Ideal Iris level: "+iris);
	}
}
