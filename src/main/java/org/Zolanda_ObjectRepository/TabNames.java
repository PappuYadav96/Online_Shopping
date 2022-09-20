package org.Zolanda_ObjectRepository;
public enum TabNames 
{
CREATECATEGORY("CreateCategory"), ORDERMANAGEMENT("OrderManagement"),SUBCATEGORY("SubCategory"), INSERTPRODUCT("InsertProduct"), LOGOUT("Logout"), Logout("LOGOUT");	
	private String tabName;
private TabNames(String tabName) {
	this.tabName = tabName;
}
	public String getTabName()
	{
		return tabName;
	}
}
	
	
	
	
	
	
