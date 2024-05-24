package chapter15;
class Box10 {
	public int width;
	public int height;
	public int depth;
	public Box10(int w,int h,int d) {
		width = w;
		height = h;
		depth = d;
	}
}

public class ObjectMethodTest3 {
	public static void main(String args[]) {
		int a1=10, a2=10;   // 기본 자료형 변수에 같은 값 저장.
		
		Box10 b1 = new Box10(10,20,30);  // 같은 속성.
		Box10 b2 = new Box10(10,20,30);  // 객체에 주소 저장되어 있음.
		Box10 b3 = b2;   // 객체 b3에 b2 배정 (같은 주소 가짐.)
		
        System.out.println(a1==a2 ? "a1과 a2는 같다" :"a1과 a2는 같지 않다" );
        System.out.println(b1==b2 ? "b1과 b2는 같다" :"b1과 b2는 같지 않다" );
        System.out.println(b2==b3 ? "b2와 b3는 같다" :"b2와 b3는 같지 않다" );
	}
}
