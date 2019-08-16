import java.util.*;

public class ProgramCode 
{
	public static List<String> getMostsales(Map<String,String> product,Map<String,Integer> productSales)
	{
		/*
		 * Consider two Hashmaps as Inputs .
		a) First Map  containing the product name and product category as key and value respectively. 
			{“lux”:”soap”,”colgate”:”paste”, ”pears”:”soap”,”sony”:”electronics”,”samsung”:”electronics”} 

		b) Second HashMap contains the product name and the units sold.
        {“lux”:1000,”colgate”:500,”pears”:2000,”sony”:100,” samsung”,600} 

		c) Write a java function which accepts the two hash maps and return the names of products in each category which 
			is having the highest number of units sold. 
		Result should be : {“pears”,”colgate”,”samsung”}
		 * 
		 * */
		System.out.println(product);
		System.out.println(productSales);
		
		Set<String> res=new TreeSet<String>();
		for(String k:product.keySet())
		{
			Set<String> products=new HashSet<String>();
			String category=product.get(k);
			for(String k1:product.keySet())
			{
				if(product.get(k1).equals(category))
				{
					products.add(k1);
				}
			}
			int maxSold=0;
			String maxSoldProduct="";
			for(String prod : products )
			{
			
				if(productSales.get(prod)>maxSold)
				{
					maxSold=productSales.get(prod);
					maxSoldProduct=prod;
				}
			}
			maxSold=0;
			res.add(maxSoldProduct);
				
		}
		List<String> out=new ArrayList<String>();
		out.addAll(res);
		return out;
	}
}
