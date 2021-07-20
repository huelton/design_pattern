package br.com.project.factory.hard.apple;

import br.com.project.factory.hard.apple.factory.IPhone11ProFactory;
import br.com.project.factory.hard.apple.factory.IPhone12Factory;
import br.com.project.factory.hard.apple.factory.IPhone12ProMaxFactory;
import br.com.project.factory.hard.apple.factory.IPhoneFactory;
import br.com.project.factory.hard.apple.factory.IPhoneXFactory;
import br.com.project.factory.hard.apple.model.IPhone;

public class ClientFactory {
	
	public static void main(String[] args) {
		
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		IPhoneFactory iphone12Facotry = new IPhone12Factory();
		IPhoneFactory iphone12ProMaxFactory = new IPhone12ProMaxFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone1 = iphoneXFactory.orderIphone();
		System.out.println(iphone1);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11ProFactory.orderIphone();
		System.out.println(iphone2);
		
		System.out.println("### Ordering an iPhone 12");
		IPhone iphone3 = iphone12Facotry.orderIphone();
		System.out.println(iphone3);
		
		System.out.println("\n\n### Ordering an iPhone 12 HighEnd");
		IPhone iphone4 = iphone12ProMaxFactory.orderIphone();
		System.out.println(iphone4);
	}
}
