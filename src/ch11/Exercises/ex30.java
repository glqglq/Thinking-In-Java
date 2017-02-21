package ch11.Exercises;

import java.util.*;

/**
 * Exercise-11.30
 * @author LuckyGong
 *
 */
public class ex30 implements Collection{
	List<String> ss = new ArrayList<String>();
	@Override
	public boolean add(Object e) {
		return ss.add((String)e);
	}

	@Override
	public boolean addAll(Collection c) {
		for(Object item:c)
			ss.add((String)item);
		return true;
	}

	@Override
	public void clear() {
		for(String item:ss)
			ss.remove(ss);
	}

	@Override
	public boolean contains(Object o) {
		return ss.contains((String)o);
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

