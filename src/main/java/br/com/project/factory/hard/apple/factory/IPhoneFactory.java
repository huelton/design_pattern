package br.com.project.factory.hard.apple.factory;

import br.com.project.factory.hard.apple.model.IPhone;

public abstract class IPhoneFactory {

	public IPhone orderIphone() {
		
		IPhone device = null;
		
		device = createIPhone();
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhone createIPhone();
}
