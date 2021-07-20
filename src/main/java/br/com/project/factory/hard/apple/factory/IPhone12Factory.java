package br.com.project.factory.hard.apple.factory;

import br.com.project.factory.hard.apple.model.IPhone;
import br.com.project.factory.hard.apple.model.IPhone12;

public class IPhone12Factory extends IPhoneFactory{

	@Override
	protected IPhone createIPhone() {
		return new IPhone12();
	}

}
