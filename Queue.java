package eg.edu.alexu.csd.datastructure.queue;
import java.lang.management.*;
import java.util.NoSuchElementException;

import javax.management.RuntimeErrorException;
/**
 * 
 * @author Essam . 
 *
 */
class Queue implements IQueue {
	
	int first = -1 ;	int last = -1 ;    int MAX = 5  ;	Object sasa = null ;
	
	Object [] arr ;
	 Queue (int size) {
		
		this.MAX = size ;
		 arr = new Object [MAX] ;
	}
	
	public boolean isEmpty() {
		
		
		if 	( (first == -1 && last == -1 )) return true ;
		else if (first == last && arr[first] == null ) {return true ;}
		else {return false ;}
		
	}
	public boolean isFull() {
		
		if ((first == last  &&   first != -1 && last != -1 ) ) { if(arr [first] != null) {return true ;}else {return false ;}}
		else if  (first == -1 && last ==  MAX-1 ) {return true;}
		else { return false ;} 
	}
	public int size() {
		
		if( isEmpty() ) return 0 ;
		
		else if ( isFull() ) return MAX ;
		
		else if ( last > first ) return last - first ;
		
		else return (MAX - first + last) % MAX ;
		
	}
	public void enqueue(Object element) {
		
		if ( isFull() ) {
			throw new IllegalStateException() ;
		}
		else {
			last = (last+1) % MAX ;
			arr[last] = element ;
		}
	}
	public Object dequeue() {
		
		if( isEmpty() ) {
			throw	new IllegalStateException()  ;
		}
		else {
			first = ( first + 1 ) % MAX ;
			sasa = arr[first] ;
			arr[first] = null ;
		}
		return sasa ; 
	}
}
