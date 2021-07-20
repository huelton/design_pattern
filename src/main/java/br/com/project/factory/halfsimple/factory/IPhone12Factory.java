package br.com.project.factory.halfsimple.factory;


import br.com.project.factory.halfsimple.model.IPhone;
import br.com.project.factory.halfsimple.model.IPhone12;
import br.com.project.factory.halfsimple.model.IPhone12Pro;
import br.com.project.factory.halfsimple.model.IPhone12ProMax;

public class IPhone12Factory extends IPhoneFactory {

	@Override
	protected IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone12();
		}else if(level.equals("high")) {
			return new IPhone12Pro();
		}else if(level.equals("highEnd")) {
			return new IPhone12ProMax();
		}else return null;
	}
}
