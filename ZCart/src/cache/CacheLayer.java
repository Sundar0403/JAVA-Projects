package cache;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import customer.CustomerDetails;
import kart.KartDetails;
import purchase.PurchaseDetails;

public class CacheLayer 
{
	static Map<String,CustomerDetails> customerMap=new HashMap<>();
	 static Map<String,List<KartDetails>> kartMap=new HashMap<>();
	 static Map<Integer,List<PurchaseDetails>> purchaseMap=new HashMap<>();
	int invoiceNo;
	
	public Map<String, List<KartDetails>> setKartDetails(String category, List<KartDetails> kartList, String fileName) throws Exception
	{
		kartMap.put(category, kartList);
		System.out.println(kartMap);
		return kartMap;
	}

	public Map<String, CustomerDetails> setCustomerDetails(String userName, CustomerDetails customerObj, String fileName) throws Exception
	{
		System.out.println(customerMap);
		customerMap.put(userName, customerObj);
		System.out.println(customerMap);
		return customerMap;
	}

	public CustomerDetails getCustomerDetails(String userName) 
	{
		CustomerDetails customerObj=customerMap.get(userName);
		return customerObj;
	}

	public List<KartDetails> getKartDetails(String category) 
	{
		return kartMap.get(category);
	}

	public Map<Integer, List<PurchaseDetails>> setPurchaseDetails(int invoiceNo, List<PurchaseDetails> purchase) 
	{
		purchaseMap.put(invoiceNo, purchase);
		this.invoiceNo=invoiceNo;
		System.out.println(this.invoiceNo);
		System.out.println(purchaseMap);
		return purchaseMap;
	}
	
	public Map<Integer, List<PurchaseDetails>> getInvoiceNo()
	{
		return purchaseMap;
	}
	
}
