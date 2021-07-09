package br.com.project.factory.apple.factory;

import br.com.project.factory.apple.model.IPhone;
import br.com.project.factory.apple.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory{

	@Override
	protected IPhone createIPhone() {
		return new IPhoneX();
	}

}
