package stringStudy;

public class StrStudy {

	public static void main(String[] args) {
		String str1="vishal";
		String str2="RUCHIRA";
		String str3="pallavi";
		String str4="vishal";
		String str6="ruchira";
		
		String str5=new String("pallavi");
		System.out.println("===========1.length===========");
		System.out.println(str1.length());
		int a = str2.length();
		System.out.println(a);
		
		System.out.println("=============2.toUppercase=========");
		System.out.println(str3.toUpperCase());
		String b = str4.toUpperCase();
		System.out.println(b);
		
		System.out.println("=============3.tolowercase=========");
		System.out.println(str2.toLowerCase());
		String c = b.toLowerCase();
		System.out.println(c);
		
		System.out.println("=============4.equals=========");
		System.out.println(str1.equals(str4));
		boolean d = str2.equals(str3);
		System.out.println(d);
		System.out.println(str3.equals(str5));
		
		System.out.println("=============5.equalsIgnoreCase=========");
		
		System.out.println(str2.equalsIgnoreCase(str6));
		boolean e = str1.equalsIgnoreCase(b);
		System.out.println(e);
		System.out.println(str1.equalsIgnoreCase(str5));
		
		System.out.println("=============6.contains=========");
		String str7="my name is pallavi";
		
		System.out.println(str7.contains("name"));
		boolean f = str3.contains("v");
		System.out.println(f);
		
		System.out.println("=============7.isEmpty=========");
		String str8="";
		//String str9=null;
		System.out.println(str8.isEmpty());
		boolean g = str2.isEmpty();
		System.out.println(g);
		//System.out.println(str9.isEmpty());
		
		System.out.println("============8.charAt=========");
		System.out.println(str5.charAt(4));
		char h = str7.charAt(11);
		System.out.println(h);
		System.out.println(str7.charAt(10));
		
		System.out.println("=============9.endsWith=========");
		
		System.out.println(str7.endsWith("avi"));
		boolean i = str4.endsWith("l");
		System.out.println(i);
		System.out.println(str2.endsWith("chi"));
		
		System.out.println("=============10.startsWith=========");
		boolean j = str2.startsWith("RUCHI");
		System.out.println(j);
		
		System.out.println("=============11.subString=========");
		
		System.out.println(str7.substring(11));
		String k = str4.substring(4);
		System.out.println(k);
		
		System.out.println(str7.substring(5, 18));
		
		System.out.println("=============12.concat=========");
		var str10=" dongare";
		var str11=" CHAVAN";
		System.out.println(str1.concat(str10));
		System.out.println(str2.concat(str11));
		
		System.out.println("==========13.indexOf==============");
		System.out.println(str7.indexOf('n'));
		System.out.println(str7.indexOf("pallavi"));
		System.out.println(str7.indexOf("a",13)); 
		System.out.println(str7.indexOf("name", 2));
		
		System.out.println("=============14.lastIndex=========");
		String str12="have a good day.... ";
		System.out.println(str12.lastIndexOf('a'));
		System.out.println(str12.lastIndexOf("good"));
		System.out.println(str12.lastIndexOf('o',11));
		System.out.println(str12.lastIndexOf("good", 15));
		
		System.out.println("============15.replace=========");
		
		System.out.println(str2.replace('R','T'));
		System.out.println(str2.replaceFirst("RUCHIRA","PALLAVI"));
		System.out.println(str12.replaceAll("good", "bad"));
		System.out.println(str2.replace('R', 'r'));

	}

}
