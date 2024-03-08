//ASCII : American Standard Code for Information Interchange
class ASCIIVal{
	public static void main(String [] args){
		for(int i=1; i<100000000; i++){
			System.out.print(i+" : "+(char)+i+"\t");
			if(i%10==0){
				System.out.println();
			}
		}
	}
}