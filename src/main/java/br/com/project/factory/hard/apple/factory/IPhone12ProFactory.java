package br.com.project.factory.hard.apple.factory;

import br.com.project.factory.hard.apple.model.IPhone;
import br.com.project.factory.hard.apple.model.IPhone12Pro;

public class IPhone12ProFactory extends IPhoneFactory{

	@Override
	protected IPhone createIPhone() {
		return new IPhone12Pro();
	}

}
