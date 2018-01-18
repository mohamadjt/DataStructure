package Collection;

public class BTS<T extends Comparable<T>> implements Collection<T>,Comparable<T> {

	LinkedList<T> firstnode=null;
	LinkedList<T> daddy=null;
	
	
	public LinkedList<T> getMinElement(){
		getMinElement(firstnode);
		return daddy;
	}
	
	private void getMinElement(LinkedList<T> firstnode2) {
		if(firstnode==null)
			return;
		daddy=firstnode;
		getMinElement(firstnode.getPrevnode());
		
	}

	
	public LinkedList<T> getMaxElement(){
		getMaxElement(firstnode);
		return daddy;
	}
	
	private void getMaxElement(LinkedList<T> firstnode2) {
		if(firstnode==null)
			return;
		daddy=firstnode;
		getMinElement(firstnode.getNextnode());
		
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(T t) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void add(LinkedList<T> t){
		if(firstnode.getT()==null){
			firstnode.setT(t.getT());
			return;
		}
		if(t.getT().compareTo(firstnode.getT())==1){
			
			add(firstnode.getNextnode());
		}
		if(t.getT().compareTo(firstnode.getT())==-1){
			add(firstnode.getPrevnode());
		}
			
		}


	@Override
	public int compareTo(T o) {
		int result=this.compareTo(o);
		if(result==0)
			return 0;
		if(result==1)
			return 1;
		else
			return -1;
	}
	
	
	
	

}
