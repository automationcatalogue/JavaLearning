package april23rd;

public class BreakLabelDemo {
	public static void main(String[] args) {
		Vijetha: for(int i=1;i<=3;i++){//1
				
					Sagar: for(int j=1;j<=10;j++){//1 2 3 4 5
						
							if(j==5){
								break Vijetha;
							}
							System.out.println(j);//1 2 3 4
						
						}
			
				}
	}
}
