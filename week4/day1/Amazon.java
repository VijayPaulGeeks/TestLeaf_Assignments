package week4.day1;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Amazon have cash on delivery option");
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("Amazon have cash on upiPayments option");
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("Amazon have card payments option");
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Amazon have internetBanking option");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Amazon paymentOption = new Amazon();
    
    paymentOption.recordPaymentDetails();
    paymentOption.cashOnDelivery();
    paymentOption.cardPayments();
    paymentOption.internetBanking();
    paymentOption.upiPayments();
}
}