package br.com.project.factory.hard.apple;

import br.com.project.factory.halfsimple.factory.IPhone11Factory;
import br.com.project.factory.halfsimple.factory.IPhone12Factory;
import br.com.project.factory.halfsimple.factory.IPhoneFactory;
import br.com.project.factory.halfsimple.factory.IPhoneXFactory;
import br.com.project.factory.halfsimple.model.IPhone;

public class ClientHalfSimpleFactory {
	
	public static void main(String[] args) {
		
		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();
		IPhoneFactory gen12Facotry = new IPhone12Factory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone1 = genXFactory.orderIphone("standard");
		System.out.println(iphone1);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIphone("highEnd");
		System.out.println(iphone2);
		
		System.out.println("### Ordering an iPhone 12 HighEnd");
		IPhone iphone3 = gen12Facotry.orderIphone("highEnd");
		System.out.println(iphone3);

	}
}
