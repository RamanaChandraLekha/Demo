
public class Main {
	public static void main(String[] args) {
		MyList list =new MyList();
		try
		{
		list.add(23);
		list.add(21);
		list.add(78);
		list.add(21);
		System.out.println(list);
	}
		catch(RepeatedElementsException re)
		{
			
			System.out.println(re);
			System.out.println("dont enter repeated elements");
		}

	}
}
