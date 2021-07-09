package br.com.project.factory.apple.factory;

import br.com.project.factory.apple.model.IPhone;
import br.com.project.factory.apple.model.IPhone12ProMax;

public class IPhone12ProMaxFactory extends IPhoneFactory{

	@Override
	protected IPhone createIPhone() {
		return new IPhone12ProMax();
	}

}
