package Collection;

import Exceptions.OverflowException;
import Exceptions.UnderflowException;

public class Stack<T> implements Collection<T> {
	
	private T[] f;
	private int maxSize;
	private int size=0;

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return maxSize;
	}

	@Override
	public void clear() {
		f=null;
		
	}

	@Override
	public boolean isEmpty() {
		if(size==0)
			return true;
		else 
			return false;
	}

	@Override
	public boolean contains(T t) {
		for (T z : f) {
			if(z.equals(t))
				return true;
		}
		return false;
	}
	
	
	public Stack(int maxSize){
		this.maxSize=maxSize;
		 f = (T[]) new Object[maxSize];

		
	}
	public int getMaxSize(){
		return maxSize;
	}
	
	/// exception mmide
	public T get(int i)throws IndexOutOfBoundsException{
		return f[i-1];
	}
	
	public void resize(int newSize){
		T z=f[0];
		maxSize=newSize;
		f=(T[]) new Object[newSize];
		f[1]=z;
		
	}
	
	public void push(T t) throws OverflowException{
		if(size>=maxSize)
			System.out.println("");
		else{
			f[size]=t;
			size++;
		}
		
	}
	
	public T top(){
		if( size!=0)
			return f[size-1];
		else
			return null;
	}
	public T pop()throws UnderflowException{
		T t=f[size-1];
		f[size]=null;
		size--;
		return t;
		
	}
	
	

}
