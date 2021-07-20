package br.com.project.factory.hard.apple.factory;

import br.com.project.factory.hard.apple.model.IPhone;
import br.com.project.factory.hard.apple.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory{

	@Override
	protected IPhone createIPhone() {
		return new IPhoneX();
	}

}
