// A ball is placed in the rectangle frame:

import javax.swing.JFrame; // frame imported
import java.awt.*; //awt = 
class  FrameDemo
{
	public static void main(String[] args)
	{
	JFrame jf=new JFrame("Game");
	jf.setLayout(new BorderLayout()); // How much componet can be kept in.
	jf.setSize(500,500);
	Can c1=new Can();
	jf.add(c1);
	jf.setVisible(true);
	}
static class Can extends Canvas implements Runnable
 {
	int x = 150, y=360, ct=0;
	Can()
		{
		Thread t1 = new Thread(this); //"This" is used for current instance.
		t1.start();
		}
	public void paint(Graphics g)
		{
		 g.drawRect(100,100,300,300);	 
		 g.fillOval(x,y,30,30);
	}
	public void run()
	 {
		while(true)
			{
				if(ct==0)
				{
					y=x+2;
					y=y-2;
						 if(x==250)
							{
							ct=1;
							}
								
				}else{
					if(ct==1)
					{
						x=x+2;
						y=y+2;
								if(x==400)
									{
									ct=2;
									}
					}else{
						 if(ct==2)
							{
							   x=x-2;
							   y=y+2;
							        if(x==250)
								{
									ct=3;	
								}
								 
							}else
							{
								x=x-2;
								y=y-2;
										if(x==100){
											ct=0;
										}
							}
			}
			}//while closed
	 }		
 }
}
}    //frameCloses