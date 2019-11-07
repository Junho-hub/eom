
public class VerticalBar {

	public static void main(String[] args) {
		System.out.println("  -------");
		System.out.println("      출력 예");
		System.out.println("  -------");
		
		int a[] = {3, 5, 2, 7, 9, 4, 1, 9, 1, 0, 3, 4, 5};
		for(int i=0; i<a.length;i++) {
		System.out.print(a[i]);
		}
		System.out.println();
		
		for(int i=1; i<a.length;i++) {
			for(int j=0; j<a.length; j++) {
			if( a[j]<i) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
			
			}System.out.println();
		}
		
		
	}

}
