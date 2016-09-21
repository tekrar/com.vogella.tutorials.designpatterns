public class GermanToUKPlugConnectorAdapter implements UKPlugConnector {

	private GermanPlugConnector plug;

	public GermanToUKAdapter(GermanPlugConnector plug) {
		this.plug = plug;
	}

	@Override
	public void provideElectricity() {
		plug.giveElectricity();
	}

}
