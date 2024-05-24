package chapter15;
class SB1{
	public int x = 500;
	public int y = 1000;
}
class SB2 extends SB1{
	public String x = "처음 시작하는 자바";
	public String xx = x + super.x;
	public String yy =""+y+super.y;
}
public class SuperTest1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
SB2 sb2 = new SB2();
System.out.println("객채 sb2 들어 있는 x,y 값 :"+sb2.x+sb2.y);
System.out.println("객채 sb2 들어 있는 xx 값 :"+sb2.xx);
System.out.println("객채 sb2 들어 있는 yy 값 :"+sb2.yy);
	}

}
