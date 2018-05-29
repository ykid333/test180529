package acmicpc;

import java.util.Scanner;

public class No_1924 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		switch (y%7) {
		case (1):
			if(x==1 || x==10) {
				System.out.println("MON");
			}
			if(x==2 || x==3 || x==11) {
				System.out.println("THU");
			}
			if(x==4 || x==7) {
				System.out.println("SUN");
			}
			if(x==5) {
				System.out.println("TUE");
			}
			if(x==6) {
				System.out.println("FRI");
			}
			if(x==8) {
				System.out.println("WED");
			}
			if(x==9 || x==12) {
				System.out.println("SAT");
			}
		case (2):
			if(x==1 || x==10) {
				System.out.println("TUE");
			}
			if(x==2 || x==3 || x==11) {
				System.out.println("FRI");
			}
			if(x==4 || x==7) {
				System.out.println("MON");
			}
			if(x==5) {
				System.out.println("WED");
			}
			if(x==6) {
				System.out.println("SAT");
			}
			if(x==8) {
				System.out.println("THU");
			}
			if(x==9 || x==12) {
				System.out.println("SUN");
			}
		case (3):
			if(x==1 || x==10) {
				System.out.println("WED");
			}
			if(x==2 || x==3 || x==11) {
				System.out.println("SAT");
			}
			if(x==4 || x==7) {
				System.out.println("TUE");
			}
			if(x==5) {
				System.out.println("THU");
			}
			if(x==6) {
				System.out.println("SUN");
			}
			if(x==8) {
				System.out.println("FRI");
			}
			if(x==9 || x==12) {
				System.out.println("MON");
			}	
		case (4):
			if(x==1 || x==10) {
				System.out.println("THU");
			}
			if(x==2 || x==3 || x==11) {
				System.out.println("SUN");
			}
			if(x==4 || x==7) {
				System.out.println("WED");
			}
			if(x==5) {
				System.out.println("FRI");
			}
			if(x==6) {
				System.out.println("MON");
			}
			if(x==8) {
				System.out.println("SAT");
			}
			if(x==9 || x==12) {
				System.out.println("TUE");
			}
		case (5):
			if(x==1 || x==10) {
				System.out.println("FRI");
			}
			if(x==2 || x==3 || x==11) {
				System.out.println("MON");
			}
			if(x==4 || x==7) {
				System.out.println("THU");
			}
			if(x==5) {
				System.out.println("SAT");
			}
			if(x==6) {
				System.out.println("TUE");
			}
			if(x==8) {
				System.out.println("SUN");
			}
			if(x==9 || x==12) {
				System.out.println("WED");
			}
		case (6):
			if(x==1 || x==10) {
				System.out.println("SAT");
			}
			if(x==2 || x==3 || x==11) {
				System.out.println("TUE");
			}
			if(x==4 || x==7) {
				System.out.println("FRI");
			}
			if(x==5) {
				System.out.println("SUN");
			}
			if(x==6) {
				System.out.println("WED");
			}
			if(x==8) {
				System.out.println("MON");
			}
			if(x==9 || x==12) {
				System.out.println("THU");
			}
			break;
		case (0):
			if(x==1 || x==10) {
				System.out.println("SUN");
			}
			if(x==2 || x==3 || x==11) {
				System.out.println("WED");
			}
			if(x==4 || x==7) {
				System.out.println("SAT");
			}
			if(x==5) {
				System.out.println("MON");
			}
			if(x==6) {
				System.out.println("THU");
			}
			if(x==8) {
				System.out.println("TUE");
			}
			if(x==9 || x==12) {
				System.out.println("FRI");
			}
			break;
		}
		/*	
			
		if(x==1 || x==10) {
			if(y%7==1) {
				System.out.println("MON");
			}
			if(y%7==2) {
				System.out.println("TUE");
			}
			if(y%7==3) {
				System.out.println("WED");
			}
			if(y%7==4) {
				System.out.println("THU");
			}
			if(y%7==5) {
				System.out.println("FRI");
			}
			if(y%7==6) {
				System.out.println("SAT");
			}
			if(y%7==0) {
				System.out.println("SUN");
			}
		}
		if(x==2 || x==3 || x==11) {
			if(y%7==1) {
				System.out.println("THU");
			}
			if(y%7==2) {
				System.out.println("FRI");
			}
			if(y%7==3) {
				System.out.println("SAT");
			}
			if(y%7==4) {
				System.out.println("SUN");
			}
			if(y%7==5) {
				System.out.println("MON");
			}
			if(y%7==6) {
				System.out.println("TUE");
			}
			if(y%7==0) {
				System.out.println("WED");
			}
		}
		if(x==4 || x==7) {
			if(y%7==1) {
				System.out.println("SUN");
			}
			if(y%7==2) {
				System.out.println("MON");
			}
			if(y%7==3) {
				System.out.println("TUE");
			}
			if(y%7==4) {
				System.out.println("WED");
			}
			if(y%7==5) {
				System.out.println("THU");
			}
			if(y%7==6) {
				System.out.println("FRI");
			}
			if(y%7==0) {
				System.out.println("SAT");
			}
		}
		if(x==5 && y<=31) {
			if(y%7==1) {
				System.out.println("TUE");
			}
			if(y%7==2) {
				System.out.println("WED");
			}
			if(y%7==3) {
				System.out.println("THU");
			}
			if(y%7==4) {
				System.out.println("FRI");
			}
			if(y%7==5) {
				System.out.println("SAT");
			}
			if(y%7==6) {
				System.out.println("SUN");
			}
			if(y%7==0) {
				System.out.println("MON");
			}
		}
		if(x==6 && y<=30) {
			if(y%7==1) {
				System.out.println("FRI");
			}
			if(y%7==2) {
				System.out.println("SAT");
			}
			if(y%7==3) {
				System.out.println("SUN");
			}
			if(y%7==4) {
				System.out.println("MON");
			}
			if(y%7==5) {
				System.out.println("TUE");
			}
			if(y%7==6) {
				System.out.println("WED");
			}
			if(y%7==0) {
				System.out.println("THU");
			}
		}
		
		if(x==8 && y<=31) {
			if(y%7==1) {
				System.out.println("WED");
			}
			if(y%7==2) {
				System.out.println("THU");
			}
			if(y%7==3) {
				System.out.println("FRI");
			}
			if(y%7==4) {
				System.out.println("SAT");
			}
			if(y%7==5) {
				System.out.println("SUN");
			}
			if(y%7==6) {
				System.out.println("MON");
			}
			if(y%7==0) {
				System.out.println("TUE");
			}
		}
		if(x==9 || x==12) {
			if(y%7==1) {
				System.out.println("SAT");
			}
			if(y%7==2) {
				System.out.println("SUN");
			}
			if(y%7==3) {
				System.out.println("MON");
			}
			if(y%7==4) {
				System.out.println("TUE");
			}
			if(y%7==5) {
				System.out.println("WED");
			}
			if(y%7==6) {
				System.out.println("THU");
			}
			if(y%7==0) {
				System.out.println("FRI");
			}
		}*/
		scan.close();
	}

}
