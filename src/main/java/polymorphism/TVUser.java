package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
		//1. Spring 컨테이너를 구동함
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		//GenericApplicationContext : 파일시스템이나 클래스 경로에 있는 xml 설정 파일을
		//                                      로딩하여 구동하는 컨테이너임
		//xmlWebApplicationContext : 웹기반의 스프링 어플리케이션을 개발할 때 사용하는
		//                                      컨테이너
		
		//BeanFactory factory = new BeanFactory();
		
		//2. Spring 컨테이너로부터 구동함
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
//		TV tv1 = (TV)factory.getBean("tv");
//		TV tv2 = (TV)factory.getBean("tv");
//		TV tv3 = (TV)factory.getBean("tv");
		
		//3. Spring 컨테이너를 종료함
		factory.close();

		//TV tv1 = new SamsungTV();
		//TV tv2 = new SamsungTV();
//		TV tv3 = new SamsungTV();
//		
		//TV tv2 = tv1;// 메모리의 주소값을 복사해서 사용함
		//TV tv3 = tv1;
		
		//TV tv = new LgTV();
		//SamsungTV tv = new SamsungTV();
//		TV tv = new SamsungTV();
//		
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
//		
//		tv.turnOn();
//		tv.soundUp();
//		tv.soundDown();
//		tv.turnOff();
		
		
	}

}
