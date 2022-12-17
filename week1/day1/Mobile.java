package week1.day1;

public class Mobile {

	public  void makecall() {
		String mobilemodel="oppo";
		float mobileweight=11.2f;
		System.out.println("Makecalls");
	}
	public void sendmsg() {
		boolean isfullcharged=true;
		int mobilecoast=30000;
		System.out.println("sendmsg");

	}
 public static void main(String[] args) {
	Mobile obj=new Mobile();
	obj.sendmsg();
	obj.makecall();
	System.out.println("this is my mobile");
	
}

}

