package kodlamaIO.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String msg) {
		System.out.printf("DB'ye loglandı: ½s½n", msg);
	}

}
