package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.Serializable;

public class ClassC implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5993977944878930441L;
	// 클래스마다 있는 serialVersionUID! 내가 final로 지정해놓으면 이 클래스에
	// 멤버를, 내용을 변경해도 오류없이 파일 입출력이 된다.
	// serialVersionUID 를 가지고 파일을 가져온다.
	int field1;
	int field2;
	
	//int field2;
	// 이렇게 field2를 추가해서 클래스 내용을 변경하고 저장을 하면
	// 새로운 클래스 파일이 만들어진다. 그 이전에 field1만 있던 ClassC와
	// field1과 field2가 있는 ClassC 이렇게 두개가 생기게 되는 것이다.
	// 파일을 읽어오는 애는 field1만 있는 ClassC를 불러오게 되는 것이고
	// 이 ClassC 파일은 마지막으로 변경한 field1과 field2가 있는 ClassC 파일이
	// 되니깐 서로 입출력 하는 클래스가 달라서 java.io.InvalidClassException 오류가 난다.
}
