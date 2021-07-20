package br.com.project.factory.hard.apple.factory;

import br.com.project.factory.hard.apple.model.IPhone;
import br.com.project.factory.hard.apple.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory{

	@Override
	protected IPhone createIPhone() {
		return new IPhone11();
	}

}
