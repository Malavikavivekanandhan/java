package org.lang;
//tamilnadu
public class StateDetails {
	private void southIndia() {
		System.out.println("andhara");
		

	}
	private void northIndia() {
		System.out.println("uthrapradesh");
		

	}
	public static void main(String[] args) {
		StateDetails s=new StateDetails();
		s.southIndia();
		s.northIndia();
		
		LanguageInfo l=new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
	}

}
