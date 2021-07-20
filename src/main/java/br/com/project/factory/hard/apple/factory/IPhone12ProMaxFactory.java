package br.com.project.factory.hard.apple.factory;

import br.com.project.factory.hard.apple.model.IPhone;
import br.com.project.factory.hard.apple.model.IPhone12ProMax;

public class IPhone12ProMaxFactory extends IPhoneFactory{

	@Override
	protected IPhone createIPhone() {
		return new IPhone12ProMax();
	}

}
