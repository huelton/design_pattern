package br.com.project.factory.apple.factory;

import br.com.project.factory.apple.model.IPhone;
import br.com.project.factory.apple.model.IPhone12;

public class IPhone12Factory extends IPhoneFactory{

	@Override
	protected IPhone createIPhone() {
		return new IPhone12();
	}

}
