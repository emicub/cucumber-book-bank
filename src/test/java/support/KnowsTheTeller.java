package support;

import nicebank.Teller;

public class KnowsTheTeller {
	
	private Teller teller;
	
	private final AtmUserInterface atmUserInterface;
	
    public KnowsTheTeller(AtmUserInterface atmUserInterface) {
        this.atmUserInterface = atmUserInterface;
    }

    public Teller getTeller() {
        return atmUserInterface;
    }

}
