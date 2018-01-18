package Collection;

public class LinkedList<T>{
	
	private LinkedList<T> nextnode=null;
	private LinkedList<T> prevnode=null;
	private T t;
	public LinkedList( T t) {
		super();
		this.t = t;
	}
	public LinkedList<T> getNextnode() {
		return nextnode;
	}
	public void setNextnode(LinkedList<T> nextnode) {
		this.nextnode = nextnode;
	}
	public LinkedList<T> getPrevnode() {
		return prevnode;
	}
	public void setPrevnode(LinkedList<T> prevnode) {
		this.prevnode = prevnode;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	
	
	
	
}
