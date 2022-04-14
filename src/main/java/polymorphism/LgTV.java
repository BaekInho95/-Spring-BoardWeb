package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sun.org.apache.xml.internal.security.keys.content.SPKIData;



/*어노테이션의 기능 4가지

의존성 주입을 지원하는 어노테이션

1. @Autowired
      - 생성자, 메서드, 멤버 변수 위에다가 사용함
      - 어디에 사용하든 결과는 같다.
      - 거의 대부분이 멤버변수위에 사용됨
      
      스프링 컨테이너는 멤버 변수위에 @Autowired를 확인하는 순간
      해당 변수의 타입(자료형: int, String, 객체 등)을 확인함
      그 타입이 메모리에 존재하는지 확인한다.
      그리고 그 객체를 변수에 주입한다.

     Spring Container는 Autowired가 붙은 객체가 메모리에 없다면 
     Exception(예외 처리)을 발생시킨다.
     (NoSuchBeanDefinitionException)

2. @Inject
3. @Qualifier

     - 객체가 중복이 됬을 때 메모리 상황에서 한쪽을 억제시킨다.
         하나만 불러올 수 있게끔
     
4. @Resource


*
*/




//ID
@Component("tv")
public class LgTV implements TV{
//class
	
	// @Resource : 객체의 이름을 기준으로 객체를 검색해서 의존성 주입을 처리함.
	//                   name 속성을 이용하여 처리할 수 있다.
	
	
	//@Autowired // 변수의 타입을 기준으로 객체를 검색해서 의존성 주입을 처리함.
	//@Qualifier("apple")
	
	//@Resource(name = "apple")
	@Autowired
	private Speaker speaker;
	
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV --- 전원 켠다.");
	}

	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTV --- 전원 끈다.");
	}

//	public void volumeUp() {
//		// TODO Auto-generated method stub
//		System.out.println("LgTV --- 볼륨 올린다.");
//	}
//
//	public void volumeDown() {
//		// TODO Auto-generated method stub
//		System.out.println("LgTV --- 볼륨 내린다.");
//	}
	
	public void volumeUp() {

		speaker.volumeUp();

	}

	public void volumeDown() {

		speaker.volumeDown();

	}
	
	
	
//	public void turnOn(){
//		
//		System.out.println("LgTV --- 전원 켠다.");
//	}
//
//	public void turnOff(){
//		
//		System.out.println("LgTV --- 전원 끈다.");
//	}
//	
//	public void soundUp(){
//		
//		System.out.println("LgTV --- 볼륨 올린다.");
//	}
//	
//	public void soundDown(){
//		
//		System.out.println("LgTV --- 볼륨 내린다.");
//	}
	
}
