package sec06.exam01_class;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car( );
		Class clazz1 = car.getClass();  // 1. 객체.getClass() 호출 : car 객체에 대한 클래스 객체를 얻고싶다.(필드, 메서드 등의 정보들을 얻고싶다는 것)
		System.out.println(clazz1.getName()); // 클래스 풀네임을 가져오는 것
		System.out.println(clazz1.getSimpleName());  // 클래스 풀네임에서 패키지빼고 클래스명만 가져오는 것
		System.out.println();
		
		
		// forName(); <-- 가끔 자주 사용하는 메서드! 익혀둘 것
		try {
			// 2. Class.forName("문자열") 호출하여 Class 객체를 얻는다.
			Class clazz2 = Class.forName("sec06.exam01_class.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName()); // 패키지이름
			System.out.println(clazz2.getPackageName()); // 패키지이름
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}
}
