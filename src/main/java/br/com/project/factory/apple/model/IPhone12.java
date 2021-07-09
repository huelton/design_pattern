package br.com.project.factory.apple.model;

public class IPhone12 extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.1in Screen");
		System.out.println("\t- A14 Bionic Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 64Gb Memory");
	}
}
