package Ʃ�͸�1014;

public class Order {
	public String ordernumber;
	public String orderID;
	public String orderDate;
	public String orderName;
	public String productNum;
	public String address;
	
	public void orderInfo() {
		System.out.println("�ֹ���ȣ: "+ordernumber);
		System.out.println("�ֹ��� ���̵�: "+orderID);
		System.out.println("�ֹ���¥: "+orderDate);
		System.out.println("�ֹ��� �̸�: "+orderName);
		System.out.println("�ֹ���ǳ��ȣ: "+productNum);
		System.out.println("����ּ�: "+address);
	}

}
