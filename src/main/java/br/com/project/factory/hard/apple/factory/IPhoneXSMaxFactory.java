package br.com.project.factory.hard.apple.factory;

import br.com.project.factory.hard.apple.model.IPhone;
import br.com.project.factory.hard.apple.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory{

	@Override
	protected IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
