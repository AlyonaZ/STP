package Project2;

public class Main {

    public static void main(String[] args) {
		matrix_1();
		System.out.println();
		matrix_2();
		System.out.println();
		matrix_3();
		System.out.println();
		matrix_4();
		System.out.println();
	    matrix_5();
    }
	public static void matrix_1() {
		int [][] m1 = {{1, 2, 5}, {3, 6, -2}, {-3, 0, -1}};
		int [][] m2 = {{6, 0, -4}, {7, -5, 3}, {1, 1, -2}};
		int [][] sum_m = new int [3][3];
		int [][] sub_m = new int [3][3];
		for(int i = 0; i < m1.length; i++){
			for(int j = 0; j < m1[i].length; j++){
				sum_m[i][j] = m1[i][j] + m2[i][j];
				sub_m[i][j] = m1[i][j] - m2[i][j];
				System.out.print(sum_m[i][j] + " ");
			}
			System.out.println();
		}
		for(int i = 0; i < sub_m.length; i++){
			for(int j = 0; j < sub_m[i].length; j++){
				System.out.print(sub_m[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void matrix_2(){
    	int [][] m = {{4, 5, -1}, {0, -3, 2}, {-2, 1, 0}};
    	int [][] new_m = new int [3][3];
    	int x = 3;
    	for(int i = 0; i < m.length; i++){
    		for(int j = 0; j < m[i].length; j++){
    			new_m[i][j] = x * m[i][j];
    			System.out.print(new_m[i][j] + " ");
			}
    		System.out.println();
		}
	}
	public static void matrix_3(){
		int [][] m1 = {{1, 2, 5}, {3, 6, -2}, {-3, 0, -1}};
		int [][] m2 = {{6, 0, -4}, {7, -5, 3}, {1, 1, -2}};
		int [][] new_m = new int [3][3];
		for(int i = 0; i < m1.length; i++){
			for(int j = 0; j < m2[i].length; j++){
				int x = 0;
				for(int k = 0; k < m2[i].length; k++) {
					x += m1[i][k] * m2[k][j];
				}
				new_m[i][j] = x;
			}
		}
		for(int i = 0; i < new_m.length; i++){
			for(int j = 0; j < new_m[i].length; j++){
				System.out.print(new_m[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void matrix_4(){
		int [][] m = {{4, 5, -1}, {0, -3, 2}, {-2, 1, 0}};
		int [][] new_m = new int [3][3];
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				new_m[i][j] = m[j][i];
				System.out.print(new_m[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void matrix_5() {
		int [][] m = {{1, 2, 5}, {3, 6, -2}, {-3, 0, -1}};
		int [][] n = new int [m.length][m[0].length];
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m.length; j++){
				n[i][j] = m[i][j];
			}
		}
		int [][] new_m = new int [3][3];
		int st = 3;
		for(int s = 0; s < st-1; s++) {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < n[i].length; j++) {
					int x = 0;
					for (int k = 0; k < n[i].length; k++) {
						x += m[i][k] * n[k][j];
					}
					new_m[i][j] = x;
				}
			}
			for(int i = 0; i < m.length; i++) {
				for (int j = 0; j < m.length; j++) {
					m[i][j] = new_m[i][j];
				}
			}
		}
		for(int i = 0; i < new_m.length; i++) {
			for (int j = 0; j < new_m[i].length; j++) {
				System.out.print(new_m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
