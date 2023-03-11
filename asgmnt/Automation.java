package home.asgmnt;

public class Automation extends MultipleLangauge implements TestTool, Language
{

	public static void main(String[] args) 
	{
		Automation auto = new Automation();
		auto.python();
		auto.Selenium();
		auto.ruby();
		
		
	}

	@Override
	public void ruby() {
		System.out.println("This is the ruby method");
		
	}

	public void Java() {
		System.out.println("This is the java method");
	}

	public void Selenium() {
		System.out.println("This is the selenium method");
	}

}
