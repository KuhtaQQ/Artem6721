package by.academy.Homework.HW4;

public class Arrays<T extends Object> {
	public T[] Array;
	public int counter;
	public T obj;
	private static final int ARR = 16;

	@SuppressWarnings("unchecked")
	public Arrays() {
        super();
		this.Array = (T[]) new Object[ARR];
	}

	@SuppressWarnings("unchecked")
	public Arrays(int i) {
		super();
		if (i > 0) {
			this.Array = (T[]) new Object[i];
		} else {
			this.Array = (T[]) new Object[ARR];
		}
	}

	@SuppressWarnings("unchecked")
	public void expendsArray() {
		T[] array2 = (T[])new Object[Array.length*2+1];
		System.arraycopy(Array, 0, array2,0, Array.length);
		Array = array2;
			}
	public void add(T arrEl) {
		if(Array.length == counter) {
			expendsArray();
		}
		Array[counter++] = arrEl;
	}
	

	public T get(int x) {
		if(x>=0&&x<counter) {
			return Array[x];
		}else {
			throw new ArrayIndexOutOfBoundsException();
	    }
	}
	public T getLast() {
		return Array[counter - 1];
	}

	public T getFirst() {
		return Array[0];
	}

	public int length() {
		return counter;
	}

	public int getIndexLastElement() {
		return counter - 1;
	}
	public T[] getArray() {
		return Array;
	}

	public void setArray(T[] Array) {
		this.Array = Array;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public static int getArr() {
		return ARR;
	}

	public boolean remove(int i) {
		if (i < counter) {
			System.arraycopy(Array, i + 1, Array, i, counter - i - 1);
			Array[--counter] = null;
			return true;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public boolean remove(T element) {
		int index = -1;
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] != null) {
				if (Array[i].equals(element)) {
					index = i;
					break;
				}
			}
		}
		if (index != -1) {
			System.arraycopy(Array, index + 1, Array, index, counter - index - 1);
			Array[--counter] = null;
			return true;
		}
		return false;
	}
}
