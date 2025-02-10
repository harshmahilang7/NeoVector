/**
 * @Author: Dastan Alam harsh mahilang
 * @Date:   2025-02-11 12:25:09 AM   00:02
 * @Last Modified by:   Dastan Alam harsh mahilang
 * @Last Modified time: 2025-02-11 12:25:40 AM   00:02
 */
import java.util.Arrays;

public class NeoVector<E>
{
	private Object[] elements;
	private int elementCount;
	private static final int DEFAULT_CAPACITY=10;



	public NeoVector()
	{
		elements=new Object[DEFAULT_CAPACITY];
		elementCount=0;
	}

	// Constructor with initial capacity

	public NeoVector(int initailCapacity)
	{
		if(initailCapacity<0)
		{
			throw new IllegalArgumentException("Capacity can't be negative");
		}
		elements =new Object[initailCapacity];
		elementCount=0;
	}

	// Adding element to the end position
	public void add(E element)
		{
			if(elementCount==elements.length)
			{
				grow();
			}
			elements[elementCount++]=element;

		}

	// get method
	@SuppressWarnings("unchecked")
	public E get(int index)
	{
		varifyIndex(index);
		return (E) elements[index];

	}



		// remove an element based on the index position
		public E remove(int index)
		{
			varifyIndex(index);


			@SuppressWarnings("unchecked")
			E removeElement=(E)elements[index];

			int numMoved=elementCount-index-1;

			if(numMoved>0)
			{
				System.arraycopy(elements, index+1, elements, index, numMoved);
			}
			elements[--elementCount]=null;  //gc

			return  removeElement;

		}


		private void varifyIndex(int index) {
			if(index<0||index>=elementCount)
			{
				throw new ArrayIndexOutOfBoundsException(index);
			}
		}

		public int size()
		{
			return this.elementCount;

		}

		public  int capacity()
		{
			return elements.length;
		}

		public boolean isEmpty()
		{
			return elementCount==0;
		}

		public void clear()
		{
			Arrays.fill(elements, 0,elementCount,null);
			elementCount=0;
		}

		//to string
		public String toString()
		{
			StringBuilder sb =new StringBuilder();

			for(int i=0;i<elementCount;i++)
			{
				sb.append(elements[i]);
				if(i < elementCount-1)
				{
					sb.append(" , ");
				 }
			}

			sb.append("]");

			return sb.toString();
		}


		private void grow()
		{
			int newCapacity=elements.length*2;

			if(newCapacity==0)
			{
				newCapacity=DEFAULT_CAPACITY;

			}
			elements=Arrays.copyOf(elements, newCapacity);
		}
}