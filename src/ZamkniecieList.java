package src;
import java.awt.*;
import java.awt.event.*;

public class ZamkniecieList extends WindowAdapter 
{
	public void windowClosing(WindowEvent event) 
	{
		System.exit(0);
	}
}