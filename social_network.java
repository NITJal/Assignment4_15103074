package lab;
import java.util.*;

class obj {

	String s1 = new String();
    String s2 = new String();	
}

public class social_network {
	
	static Set<String> people = new HashSet<String>();
	static Set<String> tag = new HashSet<String>();
	static ArrayList<String> photos = new ArrayList<String>();
	static ArrayList<obj> ppl_pic = new ArrayList<obj>();
	static ArrayList<obj> tag_pic = new ArrayList<obj>();
	public static void upload()
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter person name uploading photo: ");
		String s = sc1.next();
		people.add(s);
		System.out.println("Enter photo title: ");
		String s1 = sc1.next();
		photos.add(s1);
		obj o1 = new obj();
		o1.s1 = s;
		o1.s2 = s1;
		ppl_pic.add(o1);
		System.out.println("Enter the tag name: ");
		String s2 = sc1.next();
		tag.add(s2);
		obj ob = new obj();
		ob.s1 = s2;
		ob.s2 = s1;
		tag_pic.add(ob);
	
	}
	
	public static void search_ppl()
	{
		System.out.println("Enter the person name to view pics uploaded by him: ");
		Scanner sc2 = new Scanner(System.in);
		String s = sc2.nextLine();
		Iterator<obj> it = ppl_pic.iterator();
		System.out.println("Photos:\n");
		int flag = 0;
		while(it.hasNext())
		{
			obj o = it.next();
			if(o.s1.compareToIgnoreCase(s)==0)
			{
				flag = 1;
				System.out.println(o.s2);
			}
		}
		if(flag==0)
			System.out.println("Person name not Found!!");
		System.out.println("");
	}
	
	public static void search_tag()
	{
		System.out.println("Enter the tag name to view pics related to it: ");
		Scanner sc3 = new Scanner(System.in);
		String s = sc3.nextLine();
		Iterator<obj> it = tag_pic.iterator();
		System.out.println("Photos:\n");
		int flag = 0;
		while(it.hasNext())
		{
			obj o = it.next();
			if(o.s1.compareToIgnoreCase(s)==0)
			{
				flag = 1;
				System.out.println(o.s2);
			}
		}
		if(flag==0)
			System.out.println("Tag name not Found!!");
		System.out.println("");
	}
	
    public static void main(String avg[]) 
    {
    	Scanner sc = new Scanner(System.in);
        int opt = 1;
    	while(true){
        System.out.println("Choose an option: \n");
        System.out.println("1.Upload\n2.Search by people\n3.Search by tag\n4.Logout");
        	opt = sc.nextInt();
        switch(opt)
        {
        case 1:
        	upload();
        	break;
        case 2:
        	Iterator<String> it = people.iterator();
        	System.out.println("Profiles Available: \n");
        	while(it.hasNext())
        	{
        		System.out.println(it.next());
        	}
        	System.out.println("");
        	search_ppl();
        	break;
        case 3:
        	Iterator<String> ite = tag.iterator();
        	System.out.println("Tags Available: \n");
        	while(ite.hasNext())
        	{
        		System.out.println(ite.next());
        	}
        	System.out.println("");
        	search_tag();
        	break;
        case 4:
        	break;
        }
        if(opt>=4)
        	break;
        }
    }
}

   
