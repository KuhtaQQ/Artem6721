package by.academy.Homework.HW4;

public class ArrayIterator<T> implements Iterator<T> {
	private T[][] array;
	private int cursor1 = 0;
	private int cursor2 = 0;

	public ArrayIterator(T[][] array) {
		super();
		this.array = array;

	}

	@Override
	public boolean hasNext() {
		return cursor1 < array.length && cursor2 < array[cursor1].length;
	}

	@Override
	public T next() {
		T t = array[cursor1][cursor2++];
		if (cursor2 >= array[cursor1].length) {
			cursor1++;
			cursor2 = 0;
		}
		return (T) t;
	}

}
