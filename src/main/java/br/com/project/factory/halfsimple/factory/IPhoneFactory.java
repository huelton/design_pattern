package br.com.project.factory.halfsimple.factory;

import br.com.project.factory.halfsimple.model.IPhone;

public abstract class IPhoneFactory {

	public IPhone orderIphone(String level) {
		
		IPhone device = null;
		
		device = createIPhone(level);
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhone createIPhone(String level);
}
