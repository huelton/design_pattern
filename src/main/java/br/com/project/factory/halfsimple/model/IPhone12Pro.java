package br.com.project.factory.halfsimple.model;

public class IPhone12Pro extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.1in Screen");
		System.out.println("\t- A14 Bionic Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 128Gb Memory");
	}
}
