package kodlamaIo.core.logging;

public class MailLogging implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Maile loglandi "+ data);
		
	}

}
