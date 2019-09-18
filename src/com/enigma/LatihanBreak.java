package com.enigma;

public class LatihanBreak {
	
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			
			LatihanBreak obj = new LatihanBreak();

			int penampung = obj.totalUlang(3);
			System.out.println(penampung);

			System.out.println(obj.totalUlang(5));
		}
		
		public int totalUlang(int x) {
			int total = 0;
			int i = 1;
			while(true) {
				total+= i;
				i++;
				if(i>x)
					break;
			}
			
			return total;
		}
}
