package kodlamaIo.core.logging;

public class FileLogging implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandi "+ data);
		
	}

}
