package _AC176._02;

import java.util.ArrayList;

public class _02
{
	public static void main(String[] args)
	{
		ProductOfNumbers p = new ProductOfNumbers();
		p.add(3);
		p.add(0);
		p.add(2);
		p.add(5);
		p.add(4);
		System.out.println(p.getProduct(2));
		System.out.println(p.getProduct(3));
		System.out.println(p.getProduct(4));
		p.add(8);
		System.out.println(p.getProduct(2));
	}

}

class ProductOfNumbers
{
	ArrayList<Integer> list = new ArrayList<>();

	public ProductOfNumbers()
	{

	}

	public void add(int num)
	{
		if (num == 0)
			for (int i = 0; i < list.size(); i++)
				list.set(i, 0);
		else if (num != 1)
			for (int i = 0; i < list.size(); i++)
				list.set(i, list.get(i) * num);
		list.add(num);
	}

	public int getProduct(int k)
	{
		return list.get(list.size() - k);
	}
}