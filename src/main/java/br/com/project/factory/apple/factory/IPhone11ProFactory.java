package br.com.project.factory.apple.factory;

import br.com.project.factory.apple.model.IPhone;
import br.com.project.factory.apple.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory{

	@Override
	protected IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
