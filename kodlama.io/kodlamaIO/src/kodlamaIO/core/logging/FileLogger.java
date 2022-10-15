package kodlamaIO.core.logging;

public class FileLogger implements Logger{
	
	@Override
	public void log(String msg) {
		System.out.printf("Dosyaya loglandı: ½s½n", msg);
	}
}
