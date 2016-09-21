GermanPlugConnector plugConnector = //.. create a GermanPlugConnector
UKElectricalSocket electricalSocket = new UKElectricalSocket();
UKPlugConnector ukAdapter = new GermanToUKAdapter(plugConnector);
electricalSocket.plugIn(ukAdapter); 