package patternProgramsAssignment;

public class IeuronPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h = 7, w = 7;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < h; j++) {
				if ((i == h - 1) || (i == 0)) {
					System.out.printf("*");
				} else if (j == h / 2) {
					System.out.printf("*");
				} else {
					System.out.printf(" ");
				}
			}
			System.out.println("");
		}
		System.out.printf("\n");
		int count = 0;
		for (int i = 0; i < h; i++) {
			System.out.printf("*");
			for (int j = 0; j <= h; j++) {
				if (j == h) {
					System.out.printf("*");
				} else if (j == count) {
					System.out.printf("*");
				} else {
					System.out.printf(" ");
				}
			}
			count = count + 1;
			System.out.println("");
		}
		System.out.printf("\n");
		for (int i = 0; i < h; i++) {
			System.out.printf("*");
			for (int j = 0; j < h; j++) {
				if ((i == h / 2 && j <= h / 2) || (i == 0 || i == h - 1)) {
					System.out.printf("*");
				} else {
					continue;
				}
			}
			System.out.println("");
		}
		System.out.printf("\n");
		for (int i = 0; i < h; i++) {
			if (i != 0 && i != h - 1) {
				System.out.printf("*");
			} else {
				System.out.printf(" ");
			}
			for (int j = 0; j < h; j++) {
				if (((i == h - 1) && j >= 0 && j < h - 1)) {
					System.out.printf("*");
				} else if (j == h - 1 && i != 0 && i != h - 1) {
					System.out.printf("*");
				} else {
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");

		int mid = h / 2;

		for (int i = 0; i < h; i++) {
			System.out.printf("*");
			for (int j = 0; j < w; j++) {
				if ((i == 0 || i == mid) && j < (w - 2)) {
					System.out.printf("*");
				} else if (j == (w - 2) && !(i == 0 || i == mid)) {
					System.out.printf("*");
				} else {
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < h; j++) {
				if ((i==h-1&&j>0&&j<h-1)||(j==0&&i!=0&&i!=h-1)||
						(j==h-1&&i!=0&&i!=h-1)||(i==0&&j>0&&j<h-1)
						){
					System.out.printf("*");
				} else {
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
		 count = 0;
		for (int i = 0; i < h; i++) {
			System.out.printf("*");
			for (int j = 0; j <= h; j++) {
				if (j == h) {
					System.out.printf("*");
				} else if (j == count) {
					System.out.printf("*");
				} else {
					System.out.printf(" ");
				}
			}
			count = count + 1;
			System.out.println("");
		}
	}

}
