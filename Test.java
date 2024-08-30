import java.util.ArrayList;
class Sum{

	int num;
	int count = 0;

	public Sum(int start) {
		num = start;
	}

	public int add(){
		for(int i = 0; i<num; i++) {
			if(i%5 == 0 || i%7 == 0) {
				count += i;
			}
		
		}

		return count;

	}

public static void main(String[] args) {
	Sum A = new Sum(20);
	System.out.println(A.add());

}



}
