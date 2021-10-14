package 튜터링1014;

public class Order {
	public String ordernumber;
	public String orderID;
	public String orderDate;
	public String orderName;
	public String productNum;
	public String address;
	
	public void orderInfo() {
		System.out.println("주문번호: "+ordernumber);
		System.out.println("주문자 아이디: "+orderID);
		System.out.println("주문날짜: "+orderDate);
		System.out.println("주문자 이름: "+orderName);
		System.out.println("주문삼풍번호: "+productNum);
		System.out.println("배송주소: "+address);
	}

}
