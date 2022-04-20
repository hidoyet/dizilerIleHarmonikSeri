package dizilerIleHarmonikSeri;

public class Main {

	public static void main(String[] args) {
		int[] seri= {1,2,3,4,5};
		double toplam=0;
		for(int i=0;i<seri.length;i++) {
			
			for(int j=1;j<=seri[i];j++) {
				toplam+=(1.0/j);
					
			}
			System.out.print(toplam+",");	
		}
		System.out.println("Harmonik seri ortalamasý= "+(seri.length/toplam));

	}

}
