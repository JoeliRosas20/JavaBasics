
public class StringDemo {

	public static void main(String[] args) {
		String name = "May";
		System.out.println(name);
		System.out.println("Length of the name:"+name.length());
		System.out.println("Character at:"+name.charAt(2));//Good
		System.out.println("Concat:"+name.concat(" and Dawn my beloved"));//Good
		System.out.println("Compare:"+name.compareTo("MayAAA"));//Somewhat
		//HILDA = 5, hilda = -27, Hilda = 5, May = 0, Maye = -1, Ma = 1
		System.out.println("Compare Ignore Case:"+name.compareToIgnoreCase("h"));//Nel
		System.out.println("Substring:"+name.substring(0));//Good
		System.out.println("Substring from:"+name.substring(0, 1));//Good
		System.out.println("Uppercase:"+name.toUpperCase());//Good
		System.out.println("Ending:"+name.endsWith("n"));//Good
		System.out.println("Staring:"+name.startsWith("M"));//Good
	}

}
