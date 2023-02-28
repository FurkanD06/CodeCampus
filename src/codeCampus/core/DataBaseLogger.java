package codeCampus.core;

public class DataBaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Veri tabanına loglandı : " + data);
		
	}

}
