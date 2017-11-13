package lab;

import java.util.ArrayList;
import java.util.Scanner;

public class mr_github {

	public static void main(String[] args)  {
	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		int i, count=0, level = 0, shift=0;
		ArrayList<String> st = new ArrayList<String>();
		st.add("");
		for(i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			switch(c)
			{
			case '^':
				if(level==0)
					break;
				level--;
				shift = 0;
				break;
			case '<':
				if(st.get(level).length()<=0)
					break;
				shift++;
				break;
			case '>':
				if(shift==0)
					break;
				shift--;
				break;
			case '?':
				if(level==st.size()-1)
					st.add(" ");
				level++;
				shift = 0;
				break;
			case '@':
				count++;
				break;
			case '$':
				
				st.add("\n\n");
				level++;
				shift = 0;
				break;
			case '#':
				String s3 = st.get(level);
				s3= s3.substring(0, s3.length()-shift-1) ;
				if(shift!=0)
					s3 = s3 + st.get(level).substring(s3.length()-shift);
				st.set(level,s3);
				break;
			default:
				String s1 = st.get(level);
				
				if(count%2==1)
					c = Character.toUpperCase(c);
				
					s1= s1.substring(0, s1.length()-shift) + c ;
				if(shift!=0)
					s1 = s1 + st.get(level).substring(s1.length()-1);
				
				st.set(level,s1);
			}
		}
		for(i=0;i<st.size();i++)
		{
			System.out.println(st.get(i));
		}
	}
	

}
