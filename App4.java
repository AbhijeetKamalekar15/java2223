//Program to draw image on applet
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
   <applet code="App4.java" width=400 height=400>
   </applet>  
*/
public class App4 extends Applet
{
    Image img;
    public void init()
    {
        img=getImage(getDocumentBase(),"img0.jpg");
    }
    public void paint(Graphics g)
    {
        g.drawImage(img,10,10,390,390,this);
    }
}