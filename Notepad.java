import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class Notepad extends Frame
{
	Notepad()
	{
		setVisible(true);
		setSize(500,500);
	}
	public static void main(String ae[])
	{
		Notepad n=new Notepad();
			n.create();
	}
	
	public void create()
	{
	
		
	MenuBar mbar;
	Menu File,Edit,Formate,View,Help;

		mbar=new MenuBar();

	setMenuBar(mbar);

		File=new Menu("File");

		MenuItem item1,item2,item3,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14;
		File.add(item1=new MenuItem("New   ctr+n"));
		File.add(item2=new MenuItem("Open    ctr+o"));
	File.add(item3=new MenuItem("Save    	ctr+s"));
	File.add(item4=new MenuItem("Save As...   ctr+s"));
File.add(item5=new MenuItem("-"));
File.add(item6=new MenuItem("Page Set Up"));
File.add(item7=new MenuItem("print   cnt+p"));
File.add(item8=new MenuItem("-"));
File.add(item9=new MenuItem("Exit"));
mbar.add(File);
Edit=new Menu("Edit");

//		MenuItem item1,item2,item3,item4,item5,item6,item7;
		Edit.add(item1=new MenuItem("Undo   ctrl+z"));
		Edit.add(item2=new MenuItem("-"));
	Edit.add(item3=new MenuItem("Cut    	ctr+x"));
	Edit.add(item4=new MenuItem("Copy   ctr+c"));
Edit.add(item5=new MenuItem("Paste     ctrl+v"));
Edit.add(item6=new MenuItem("Delete    Del"));
Edit.add(item7=new MenuItem("-"));
Edit.add(item8=new MenuItem("Find     cnrl+f"));
Edit.add(item9=new MenuItem("Find Next..."));
Edit.add(item10=new MenuItem("Replace   cntrl+h"));
Edit.add(item11=new MenuItem("Go To    cntrl+g"));
Edit.add(item12=new MenuItem("-"));
Edit.add(item13=new MenuItem("Select All   cntl+a"));
Edit.add(item14=new MenuItem("Time/Date     F5"));
mbar.add(Edit);
Formate=new Menu("Formate");
//		setMenuBar(mbar);
//		MenuItem item1,item2,item3,item4,item5,item6,item7;
		Formate.add(item1=new CheckboxMenuItem("Word Wrape"));
		Formate.add(item2=new MenuItem("Formate"));
mbar.add(Formate);

View=new Menu("View");
//		setMenuBar(mbar);
//		MenuItem item1,item2,item3,item4,item5,item6,item7;
		View.add(item1=new MenuItem("Status Bar"));
	mbar.add(View);


View=new Menu("View");
//		setMenuBar(mbar);
//		MenuItem item1,item2,item3,item4,item5,item6,item7;
		View.add(item1=new MenuItem("View help"));
	View.add(item2=new MenuItem("About Notepad"));
	mbar.add(View);


}

}