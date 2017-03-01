
public class Main {
	public static void main(String[] args) {
		Bank customer=new Bank("ram","1234s43",12345.50f);
		Bank customer1=new Bank("rana","a1234",5000.50f);
		customer.withDraw(3456);
		customer.display();
		customer1.withDraw(6000);
		customer1.display();
	}

}
