package kodlamaIo.core.logging;

public class DatabaseLogging implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Veritabanina loglandi "+ data);
		
	}

}
