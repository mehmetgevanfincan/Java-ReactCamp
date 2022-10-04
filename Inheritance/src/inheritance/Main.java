package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";

		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "9999";

		CustomerManager customerManager = new CustomerManager();

		Customer[] customers = { engin, abc, hepsiBurada };

		customerManager.addMultiple(customers);

		// customerManager.add(hepsiBurada);
		// customerManager.add(engin);
		// customerManager.add(abc);

	}

}

//inheritance - miras
//Polymorphism - çok biçimlilikdir. Bir method içerisinde bir çok class bulunması.