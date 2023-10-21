package leetCode;

import java.util.HashSet;

public class Java_C {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Glib jocks quiz nymph to vex dwaf ";
//String s="The quick brown fox jumps over a lazy dog";
//----------------*1st way*------------------------------

//to remove spaces and to avoid uppercase and Lowercase condition
//String s1=s.replace(" ","").toLowerCase();
//HashSet<Character> h1=new HashSet<Character>();
//for(char c:s1.toCharArray())
//{
//	//to avoid duplicates
//	h1.add(c);
//}
//if(h1.size()==26)
//	System.out.println("Panagram");
//else
//	System.out.println("Not Panagram");


//----------*2nd way*---------------------------
StringBuilder sb=new StringBuilder();
HashSet<Character> h1=new HashSet<Character>();
//remove spaces and convert into LowerCase;
for(char c:s.toCharArray())
{
	if(Character.isAlphabetic(c))
	{
		int num=(int)c;
		if((int)c<97) {
			sb.append((char)(num+32));
		}else
		{
			sb.append(c);
		}
	}else
		sb.append("");
}
for(char c:sb.toString().toCharArray())
{
	h1.add(c);
}
if(h1.size()==26)
	System.out.println("Panagram");
else
	System.out.println("Not Panagram");
	}

}
