package New;

import java.util.ArrayList;
import java.util.List;

public class nahi {
public static void main(String[] args) {

	ArrayList<Integer> l1 = new ArrayList<Integer>();
	l1.add(11);
	l1.add(12);
	l1.add(13);
	l1.add(14);
	l1.add(15);
	forw(l1);
	whilew(l1);
	recur(l1);
}

public static int recur(List<Integer> l)
{
	int sum = 0;
	int i = l.size()-1;
	
	if(i==1) {
		sum += (Integer)l.get(i);
	}
	else
	{
		Integer l2= l.get(i);
		sum = sum + l2;
		recur(l);
		i--;
	}
	
	return sum;
}
public static void whilew(List<Integer> l)
{
	int sum = 0;
	int i = l.size()-1;
	while(i>=0)
	{
	 sum += (Integer)l.get(i);
	 i--;
	}
	System.out.println(sum);
}
public static void forw(List<Integer> l)
{
	int sum = 0;
	for(int i=0;i<l.size();i++)
	{
	 sum += ( Integer ) l.get(i);
	 
	}
	System.out.println(sum);
}

}
