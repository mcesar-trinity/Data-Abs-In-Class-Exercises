import java.util.ArrayList;

class ifTrue{

	ArrayList<Integer> original;

	public ifTrue(ArrayList<Integer> start) {
		original = start;
	}

	public boolean test(){
		ArrayList<Integer> compare = new ArrayList<Integer>();
		for(int i = 0; i<original.size(); i++) {
			if(compare.contains(original.get(i))) {return true;}
			else{compare.add(original.get(i));}
		}				
		return false;
	
	}

	public static void main(String[] args) {
	ArrayList<Integer> first = new ArrayList<Integer>();
	first.add(1);
	first.add(2);
	first.add(3);
	first.add(4);
	first.add(5);
	first.add(6);
	ifTrue A = new ifTrue(first);
	System.out.println(A.test());

	}

}
