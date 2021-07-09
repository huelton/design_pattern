package br.com.project.factory.apple.factory;

import br.com.project.factory.apple.model.IPhone;
import br.com.project.factory.apple.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory{

	@Override
	protected IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
