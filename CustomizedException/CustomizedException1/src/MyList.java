import java.util.ArrayList;

public class MyList<K> {
	//K k1;
	ArrayList<K> list=new ArrayList<K>();
	void add(K k1) throws  RepeatedElementsException
	{
		if(list.contains(k1))
			throw new  RepeatedElementsException();
		else 
			list.add(k1);
	}
		
	public String toString()
	{
		String temp="";
		for(int i=0;i<list.size();i++)
		{
			temp=temp+" "+list.get(i);
		}
	return temp;
	}

	

}
