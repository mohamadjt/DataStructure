package Collection;

public class main {

	public static void main(String[] args) {

		Deque<Integer> t=new Deque<Integer>();
		t.pushFront(1);
		t.pushFront(2);
		System.out.println(t.popFront());

	}

}
