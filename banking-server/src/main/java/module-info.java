module banking.server {
	exports com.jokerconf.banking.server.services;
	uses com.jokerconf.banking.server.applications.BankingApplication;
	uses com.jokerconf.banking.server.protocol.BankingProtocol;
}
