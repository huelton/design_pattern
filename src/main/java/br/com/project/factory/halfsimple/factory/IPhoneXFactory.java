package br.com.project.factory.halfsimple.factory;

import br.com.project.factory.halfsimple.model.IPhone;
import br.com.project.factory.halfsimple.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	@Override
	protected IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX();
		}else if(level.equals("highEnd")) {
			return new IPhoneX();
		}else return null;
	}
}
