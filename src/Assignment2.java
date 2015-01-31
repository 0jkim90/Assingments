//random turns every five minutes at each intersection
// 	60/5=12 turns total. 
// 	60mph = 60 miles per 60 minutes, so 5 miles per five minute
// 	(x, y) x++ indicates east and x--, west and y++ indicates north and y--, south
//	distance equals square root of x^2 + y^2

import java.util.Random;
import java.util.Scanner;


public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  start, fiveMinutes = 0;
		double x=0, y=0, distance;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome. Enter 1 to start and 0 to exit.");
		start = sc.nextInt();
		sc.close();
		Random r = new Random();
	if(start==1){
		do {
			int turn = r.nextInt(5-1)+1; 
			//1=east, 2=west, 3=north, 4=south
			if (turn==1){
				x+=5; 
				fiveMinutes++;
				System.out.println("Moving East");}
			else if (turn==2){
				x-=5;
				fiveMinutes++;
				System.out.println("Moving West");}
			else if (turn==3){
				y+=5;
				fiveMinutes++;
				System.out.println("Moving North");}
			else if (turn==4){
				y-=5;
				fiveMinutes++;
				System.out.println("Moving South");}}
		while (fiveMinutes <=12 );
		distance = Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
	
		System.out.println("Your Coordinates are ("+x+", "+y+") and you have traveled "+String.format("%.03f",distance)+" miles.");
		System.out.println("Thank you. Good bye");}
	else System.out.println("Thank you. Good bye");
	
		
	}

}
