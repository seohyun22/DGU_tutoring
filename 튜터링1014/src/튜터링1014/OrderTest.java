package 튜터링1014;

public class OrderTest {

	public static void main(String[] args) {
		Order seohyun = new Order();
		seohyun.ordernumber = "201907210001";
		seohyun.orderID = "abc123";
		seohyun.orderDate = "2019년 7월 21일";
		seohyun.orderName = "홍길순";
		seohyun.productNum = "PD-345-12";
		seohyun.address	= "서울시 영등포구 여의도동 20번지";
		
		seohyun.orderInfo();

	}

}
