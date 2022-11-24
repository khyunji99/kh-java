package sec06.exam03_newinstance;

// newInstance();  <-- 가끔, 자주 사용하는 메서드! 익혀둘것
public class NewInstanceExample {
	public static void main(String[] args) {
		
		// Action action = new SendAction();  // 정적 객체 생성
		
		
		try {
			// ReceiveAction 클래스의 클래스 객체를 생성한다.
			// ReceiveAction 클래스의 객체를 만드는 것이 아니고,
			// ReceiveAction 클래스의 정보를
			// 즉, 메타데이터를 담는 Class 객체를 만드는 것이다.
			Class clazz = Class.forName("sec06.exam03_newinstance.ReceiveAction");
			
			
			// clazz.newInstance();
			// 위의 줄은 forName() 의 () 안에 들어오는 문자열에 해당하는
			// 클래스의 타입으로 객체를 생성하고 그것을
			// Object 타입으로 자동형변환해서 리턴해준다.
			
			Object obj = clazz.newInstance();  // 동적 객체 생성
			// ReceiveAction() 객체가 생성되고
			// Object 타입으로 자동형변환한다.
			// 자동형변환이 되면 참조영역이 감소한다.
			
			Action action = (Action) obj;
			// 강제형 변환 : Interface <- Object
			// 강제형변환을 한 이유 : execute()에 접근해서 호출하기 위함
			
			action.execute();
			
			// 위의 3줄을 간단하게 만들면 다음과 같다.
			// Action action = (Action) clazz.newInstance();
			// action.execute();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}

// Class.forName( )에서 ( ) 안에 들어오는 문자열에 따라 
// 그 문자열에 해당하는 클래스를 가지고 객체가 만들어진다.
// 위에서 ReceiveAction 클래스를 문자열로 넣었으니 그 문자열에 해당하는 클래스에
// 대한 정보들을 가져오게 되고 newInstance()를 호출하면서 그 클래스로 객체가
// 만들어진다.
// clazz는 그러면 ReceiveAction 클래스를 가지고 만들어진 객체의 주소값이 들어가게 될것이다.
// forName( )의 ()안에 들어오는 문자열에 해당하는 클래스를 가지고 Class타입의
// 객체를 생성한다.
// 그리고 그 Class 객체의 메서드인 newInstance()를 호출하면 클래스객체에
// 접근할 수 있다.
// 
