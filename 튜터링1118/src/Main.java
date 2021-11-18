class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		// (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		// (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
		if(volume < MAX_VOLUME) 
			volume++;		
	}
	
	void volumeDown() {
		// (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
		if(volume > MIN_VOLUME) 
			volume--;		
	}
	
	void channelUp() {
		// (4) channel의 값을 1 증가시킨다.
		// 만일 channel이 MAX_CHANNEL이면 , channel의 MIN_CHANNEL 값을 로 바꾼다.
		if(channel == MAX_CHANNEL) 
			channel = MIN_CHANNEL;
		else
			channel++;
	}
	
	void channelDown() {
		// (5) channel의 값을 1 감소시킨다 .
		// 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL 로 바꾼다.
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




// 1부터 20까지 2와 3이 아닌 수를 합계구하기 
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


// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
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





