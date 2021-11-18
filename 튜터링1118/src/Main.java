class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		// (1) isPowerOn�� ���� true�� false��, false�� true�� �ٲ۴�.
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		// (2) volume�� ���� MAX_VOLUME���� ���� ���� ���� 1 ������Ų��.
		if(volume < MAX_VOLUME) 
			volume++;		
	}
	
	void volumeDown() {
		// (3) volume�� ���� MIN_VOLUME���� Ŭ ���� ���� 1 ���ҽ�Ų��.
		if(volume > MIN_VOLUME) 
			volume--;		
	}
	
	void channelUp() {
		// (4) channel�� ���� 1 ������Ų��.
		// ���� channel�� MAX_CHANNEL�̸� , channel�� MIN_CHANNEL ���� �� �ٲ۴�.
		if(channel == MAX_CHANNEL) 
			channel = MIN_CHANNEL;
		else
			channel++;
	}
	
	void channelDown() {
		// (5) channel�� ���� 1 ���ҽ�Ų�� .
		// ���� channel�� MIN_CHANNEL�̸�, channel�� ���� MAX_CHANNEL �� �ٲ۴�.
		if(channel == MAX_CHANNEL) 
			channel = MIN_CHANNEL;
		else 
			channel--;
	}
}


public class Main {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		}
	}




// 1���� 20���� 2�� 3�� �ƴ� ���� �հ豸�ϱ� 
public class Main {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=20; i++) {
			if(i%2 != 0 || i%3 != 0)
			sum += i;
		}
		System.out.println(sum);	
	}		
		
}


// 1+(-2)+3+(-4)+... �� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�.
public class Main {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; ; i++) {
			if(i%2 == 0) {
				sum -= i;
			}else {
				sum += i;
			}
			if(sum >= 100) {
				System.out.println(i);
				break;
			}

		}
	
	}		
		
}





