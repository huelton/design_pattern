package br.com.project.factory.halfsimple.factory;

import br.com.project.factory.halfsimple.model.IPhone;
import br.com.project.factory.halfsimple.model.IPhone11;
import br.com.project.factory.halfsimple.model.IPhone11Pro;
import br.com.project.factory.halfsimple.model.IPhoneX;

public class IPhone11Factory extends IPhoneFactory {

	@Override
	protected IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11();
		}else if(level.equals("highEnd")) {
			return new IPhone11Pro();
		}else return null;
	}
}
