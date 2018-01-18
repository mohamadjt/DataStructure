package Collection;

import java.util.LinkedList;
public class Deque<T> implements Collection<T> {
	private int frontSize=1;
	private int prevSize=1;
	LinkedList<T> front=new LinkedList<>();
	LinkedList<T> back=new LinkedList<>();

	@Override
	public int size() {
		
		return front.size();
	}

	@Override
	public void clear() {
		front.clear();
		
	}

	@Override
	public boolean isEmpty() {
		return front.isEmpty();
	}

	@Override
	public boolean contains(T f) {

		return front.contains(f);
	}
	
	public void pushFront(T f){
		front.push(f);
	}
	public void pushPrev(T t){
		back.push(t);
	}
	public T front(){
		return front.getLast();
	}
	public T prev(){
		return back.getLast();
	}
	
	public T popFront(){
		return front.pop();
	}
	public T popPrev(){
		return back.pop();
	}
	
	public T getFrontElement(int j) throws IndexOutOfBoundsException{
		return front.get(j);
	}
	
	
	
		public T getPrevElement(int j) throws IndexOutOfBoundsException{
			return back.get(j);
	}
	
	
	
	
	
	
	

}
