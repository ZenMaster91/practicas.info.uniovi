package lab08.ArrayList;

import lab08.Collections.List;

public class ArrayList implements List {
	
	private static int SIZE = 10;
	
	private Object[] list = new Object[SIZE];
	private int numOfElements = 0;

	@Override
	public int size() {
		return this.numOfElements;
	}

	@Override
	public boolean isEmpty() {
		return (size() == 0);
	}

	@Override
	public void add(Object element) {
		if(isFull())
			dynamicResize();
		list[size()] = element;
		this.numOfElements++;
	}
	
	@Override
	public void add(int index, Object element) {
		if(isFull())
			dynamicResize();
		for(int i = size(); i < index; i--) {
			list[i] = list[i-1];
		}
		list[index] = element;
		this.numOfElements++;
	}

	@Override
	public Object remove(int index) {
		if(index<0 | index >=size())
			return null;
		Object toRemove = get(index);
		for(int i = index; i < size()-1; i++)
			list[i]=list[i+1];	
		this.numOfElements--;
		return toRemove;
	}

	@Override
	public Object remove(Object element) {
		return (remove(indexOf(element)));
	}

	@Override
	public int indexOf(Object element) {
		for(int i = 0; i<size()-1; i++) {
			if (list[i] == element)
				return i;
		} return -1;
	}

	@Override
	public Object get(int index) {
		if(index<0 | index >=size())
			return null;
		return list[index];
	}

	@Override
	public Object set(int index, Object element) {
		if(index<0 | index >=size())
			return null;
		return (list[index] = element);
	}
	
	private void dynamicResize() {
		SIZE = SIZE*2;
		Object[] aux = new Object[SIZE];
		System.arraycopy(this.list, 0, aux, 0, this.list.length);
		list = aux;
	}

	private boolean isFull() {
		return (size()-1==SIZE);
	}
	
	public String toString() {
		StringBuilder aux = new StringBuilder();
		aux.append("[");
		for(int i = 0; i<size(); i++) {
			aux.append(list[i].toString());
			if(!(i==size()-1))
				aux.append(", ");
		}
		aux.append("]");
		return aux.toString();
	}


}
