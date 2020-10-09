package assignment5;

public class Question11 {

	public static void main(String[] args) {
		
		for(int i=1 ; i<5 ; i++) {						//printed border:1 2 3 4
			for(int j=0 ; j<i ; j++) {					//gap:j smaller i
				System.out.print(" ");
			}
			for(int k= (5-i) ; k>0 ; k--) {
				System.out.print(k+ " ");
			}
				System.out.println();
		}

	}

}
