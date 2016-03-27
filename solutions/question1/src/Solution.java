import java.util.LinkedList;
import java.util.NoSuchElementException;

class ImmutableQueue<T> implements MyQueue<T>{

	LinkedList<T> list;
	
	public ImmutableQueue(){
		list = new LinkedList<T>();
	}
	
	private ImmutableQueue(LinkedList<T> list){
		this.list = list;
	}

	@Override
	public MyQueue<T> enQueue(T t) {
		// TODO Auto-generated method stub
		if(t==null) throw new IllegalArgumentException();
		list.add(t);
		return new ImmutableQueue(list);
	}

	@Override
	public MyQueue<T> deQueue() {
		// TODO Auto-generated method stub
		if(list.isEmpty()) throw new NoSuchElementException();
		list.removeFirst();
		return new ImmutableQueue(list);
	}

	@Override
	public T head() {
		// TODO Auto-generated method stub
		if(list.isEmpty()) throw new NoSuchElementException();
		return list.getFirst();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

	
}
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableQueue<Integer> iq = new ImmutableQueue<>();
		iq.enQueue(1);
		iq.enQueue(2);
		iq.enQueue(3);
		System.out.println(iq.head().intValue());
		
	}

}
