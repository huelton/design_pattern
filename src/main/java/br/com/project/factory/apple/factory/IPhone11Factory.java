package br.com.project.factory.apple.factory;

import br.com.project.factory.apple.model.IPhone;
import br.com.project.factory.apple.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory{

	@Override
	protected IPhone createIPhone() {
		return new IPhone11();
	}

}
