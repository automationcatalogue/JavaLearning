package stringHandling;

public class StringPrograms1 {
	public static void main(String[] args) {
		String s4="Vijetha is in India";
		
		char d[]=s4.toCharArray();
		for(int i=0;i<=d.length-1;i++){
			System.out.print(d[i]+" ");
		}
		
		System.out.println();
		
		byte e[]=s4.getBytes();
		for(int x:e){
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		String s5[]=s4.split(" ");
		for(String y:s5){
			System.out.println(y);
		}
		
		String s6[]=s4.split("is");
		
		for(String z:s6){
			System.out.println(z);
		}
	}
}
