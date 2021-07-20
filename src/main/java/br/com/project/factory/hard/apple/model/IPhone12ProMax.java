package br.com.project.factory.hard.apple.model;

public class IPhone12ProMax extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.7in Screen");
		System.out.println("\t- A14 Bionic Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 512Gb Memory");
	}
}
