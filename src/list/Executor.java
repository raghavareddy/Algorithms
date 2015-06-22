package list;

public class Executor
{

	private Executor()
	{
	}

	public static void main(String[] args)
	{
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.add(new Integer(10));
		list.add(new Integer(1));
		list.add(new Integer(2));
		Integer eleven = new Integer(11);
		list.add(eleven);
		list.add(new Integer(14));
		list.add(new Integer(20));
		list.add(new Integer(21));
		list.add(new Integer(45));
		list.add(new Integer(78));
		list.add(new Integer(99));
		list.add(new Integer(77));
		list.add(new Integer(451));
		list.add(new Integer(34));
		list.add(new Integer(76));
		list.add(new Integer(87));
		list.add(new Integer(34));
		list.add(new Integer(23));
		list.add(new Integer(33));
		Integer fortyfour = new Integer(44);
		list.add(fortyfour);
		list.add(new Integer(15));
		System.out.println("First Set of add " + list);
		System.out.println("size is " + list.getSize());
		list.add(2, new Integer(5));
		System.out.println("After inserting 5 at second position " + list);
		System.out.println("size is " + list.getSize());
		list.remove(eleven);
		System.out.println("After removing 11 " + list);
		System.out.println("size is " + list.getSize());
		list.remove(3);
		System.out.println("After removing 3rd position element " + list);
		System.out.println("size is " + list.getSize());

		System.out.println("List contains 44 is " + list.contains(fortyfour));
		System.out.println("List contains 11 is " + list.contains(eleven));

	}
}
