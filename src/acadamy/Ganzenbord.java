package acadamy;

import java.util.*;

public class Ganzenbord {
	static int plaats = 0;
	static boolean bool = true;
	
	public static void main(String[] args) {
	    printMenu();
	    while(bool) {
	    	dobbelsteenGooi();
	        Random random = new Random();
	    	int ogen = random.nextInt(6) + 1;
	    	System.out.println("Je hebt " + ogen + " gegooid");
		    plaats += ogen;
	        if(plaats == 23){
	        	System.out.println("je staat op plaats "+plaats);
				System.out.println("je bent in de gevangenis beland, het spel is over");
				bool = false;
		    }else if(plaats == 25 || plaats == 45) {
		    	System.out.println("je staat op plaats "+plaats);
		        System.out.println("terug naar start");
		        plaats = 0;
		    }else if((plaats == 10) || (plaats == 20)||(plaats == 30)||(plaats == 40)||(plaats==50)||(plaats==60)) {
		    	System.out.println("je staat op plaats "+plaats);
		    	System.out.println("bonus stapjes! je staat nu op plaats "+(plaats+ ogen));
		        plaats += ogen;
		    }else if(plaats >= 63) {
		        System.out.println("het spel is gewonnen");
		        bool = false;
		    }else {
		    	System.out.println("je staat op plaats "+plaats);
		    }
	    }
	}
	static void printMenu(){
		System.out.println("Je staat op start. Gooi je dobbelsteen(g)");
	}
	static char dobbelsteenGooi() {
	    Scanner gooi = new Scanner(System.in);
	    char g = gooi.next("g").charAt(0);
	    return g;
	}
}
