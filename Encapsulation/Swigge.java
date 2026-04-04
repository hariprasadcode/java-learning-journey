package com.dcl.swigge;

public class Swigge {
	private int orderId;
    private String itemName;
    private String resturant;
    private String address;
    private double price;
    
    public void setOrderId(int orderId) {
    	this.orderId=orderId;
    }
    
    public void setitemName(String itemName) {
    	this.itemName=itemName;
    }
    
    public void setresturant(String resturant) {
    	this.resturant=resturant;
    }
    public void setaddress(String address) {
    	this.address=address;
    }
    
    public void setPrice(double price) {
    	this.price=price;
    }
    
    public int getOrderId() {
    	return orderId;
    	
    }

    public String getItemName() {
    	return itemName;
    }
    
    public String getresturant() {
    	return resturant;
    }
    
    public String getaddress() {
    	return address;
    }
    
    public double getPrice() {
    	return price;
    }
    

}
