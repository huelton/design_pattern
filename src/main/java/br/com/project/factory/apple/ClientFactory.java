package br.com.project.factory.apple;

import br.com.project.factory.apple.factory.IPhone11ProFactory;
import br.com.project.factory.apple.factory.IPhoneFactory;
import br.com.project.factory.apple.factory.IPhoneXFactory;
import br.com.project.factory.apple.model.IPhone;

public class ClientFactory {
	
	public static void main(String[] args) {
		
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone1 = iphoneXFactory.orderIphone();
		System.out.println(iphone1);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11ProFactory.orderIphone();
		System.out.println(iphone2);
	}
}
