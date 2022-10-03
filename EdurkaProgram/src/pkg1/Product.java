package pkg1;

public class Product {
private String pname;
private int pcost;
private int quality;

public void setPname(String pname) {
	this.pname=pname;
	
}
public void setPcost(int pcost) {
	this.pcost=pcost;
}
public void setQuality(int quality) {
	this.quality=quality;
}
public void detail() {
	System.out.println("the product name is\n "+pname+"it's cost is\n"+pcost+"available quality \n"+quality);
}
public static void main(String[] args) {
	Product p =new Product();
	//calling method without using chaining
	p.setPname("Hari");
	p.setPcost(22220);
	p.setQuality(4);
	p.detail();
}
	
	
	
}
