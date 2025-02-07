// Applets are small java programs that are primarily used in internet computing .They can be transported over the internet from one computer to another and run using appletviewer.
// or any java compatible web browser. An Applet like any application program can do many things for us. It can perform arithmatic operations dislay graphics play songs accept user inout cretae animations and play interactive games.
//     A web page can know contain not inly a single text or a static image but also a java applet which when run can produce graphics sounds and moving images.
//     Local and Remote Applet:
//         We can embed applets into web pages in two ways.
//         1.We can write our own applets and embed them into webpages.
//         2.We can download an applet form computer download system and embed them into web page.
//     An applet developed locally and stored in a local system is known as a local applet. When a web page is trying to find a local applet it does not need to use the internet and therefore the local system does not require the internet connection .It simply searches the directries in the local system and locates and loads the specified applet.abstract
//     A Remote applet is that which is developed by someone else and stored a remote computer connected to the internet if out systen is connected to internet we can download remote applet via internet and run it. In order to load and locate a remote applet we must know applet address on the web thus address is known as Uniform Resourse Locater(URL) and this must be specified in the applet html document as a CODEBASE attribute. In the case local applet CODEBASE may be absent or may specify a local dirctry.
//     How applet differs from application:
//         Both applets and stand alone applications are java programs but there is a significant difference between them applets are not full featured application programs. They are usually written to acomplish a small task. Sice they are usually designed for use on the internet they impose certain limitation and restrictions in there design 
//         1.Applets do not contain main funtion for initiating the execution. Applets when loaded automatically call certain methods of applet class to start and execute applet code.
//         2. Unlike standalone applications apllets cannot be run independently. They are run from inside a web page using special feature know as html tag.
//         3. Applates cannot read from or read files in a local system
//         4. Applets cannot communcate with the other srevers 
//         5. APplets cannot run any program from the local computer.
//         6. Applets are restricted from using libraries from other languages such as c and c++.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
   <applet code="app1.java" width=400 height=400>
   </applet>  
*/
public class app1 extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Welcome to applets",100,100);
    }
}
