package bubbly;

public class Bubble {
	public static void main(String[] args) {
		
		Sortable babel = new Sortable() {
			
			@Override
			public int[] sort(int[] tab) {
				int temp = 0;
				
					for(int i = 0; i < tab.length; i++) {
						System.out.println("*");
						for(int j = 1; j < tab.length; j++) {
							System.out.println(tab[j-1] + ">" + tab[j] + "    " + (tab[j-1] > tab[j]) );
						if (tab[j-1] > tab[j]) {
							temp = tab[j];
							tab[j] = tab[j-1];
							tab[j-1] = temp;
							
						}
							
						
					}
				}
			
				return tab;
			}
			
		};
		
		int[] tablica = {23,16,3,54};
		
		babel.sort(tablica);
		for(int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i]+ " ");
		}
	}
}
