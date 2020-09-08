// Lab15st.java
// This is the student, starting file for Lab 15.
// This file is identical to Java1521.java.
// This slide show is about Mr. Leon Schram.
// Each student needs to alter this presentation,
// add pictures, add pages, add graphics and make it about him/herself.


import java.awt.*;


public class Lab15st extends java.applet.Applet
{

   int numClicks;
   Image picture1, picture2, picture3, picture4, picture5, picture6, picture7,
            picture8, picture9, picture10, picture11, picture12, picture13, picture14, picture15, 
               picture16, picture17, picture18, picture19, picture20;

   public void init()
   {
      numClicks = 0;
      picture1 = getImage(getDocumentBase()," ");
      picture2 = getImage(getDocumentBase()," ");
      picture3 = getImage(getDocumentBase()," ");
      picture4 = getImage(getDocumentBase()," ");
      picture5 = getImage(getDocumentBase()," ");
      picture6 = getImage(getDocumentBase()," ");
      picture7 = getImage(getDocumentBase()," ");
      picture8 = getImage(getDocumentBase()," ");
      picture9 = getImage(getDocumentBase()," ");
      picture10 = getImage(getDocumentBase()," "); 
      picture11 = getImage(getDocumentBase()," "); 
      picture12 = getImage(getDocumentBase()," "); 
      picture13 = getImage(getDocumentBase()," "); 
      picture14 = getImage(getDocumentBase()," "); 
      picture15 = getImage(getDocumentBase()," "); 
      picture16 = getImage(getDocumentBase()," "); 
      picture17 = getImage(getDocumentBase()," "); 
      picture18 = getImage(getDocumentBase()," "); 
      picture19 = getImage(getDocumentBase()," "); 
      picture20 = getImage(getDocumentBase()," ");
   
   
   
   
   
   
   	// The following MediaTracker/try/catch code ensures that
   	// all images are loaded before the program continues.
      MediaTracker tracker = new MediaTracker(this);
      tracker.addImage(picture1,1);
      tracker.addImage(picture2,1);
      tracker.addImage(picture3,1);
      tracker.addImage(picture4,1);
      tracker.addImage(picture5,1);
      tracker.addImage(picture6,1);
      tracker.addImage(picture7,1);
      tracker.addImage(picture8,1);
      tracker.addImage(picture9,1);
      tracker.addImage(picture10,1); 
      tracker.addImage(picture11,1); 
      tracker.addImage(picture12,1); 
      tracker.addImage(picture13,1); 
      tracker.addImage(picture14,1); 
      tracker.addImage(picture15,1); 
      tracker.addImage(picture16,1); 
      tracker.addImage(picture17,1); 
      tracker.addImage(picture18,1); 
      tracker.addImage(picture19,1); 
      tracker.addImage(picture20,1);
   
   
   
   
   
      try
      {
         tracker.waitForAll();
      }
      catch(InterruptedException e)
      {
         System.out.println(e);
      }
   }

   public void paint(Graphics g)
   {
      switch (numClicks)
      {
         case 0 : page1(g); 
            break;
         case 1 : page2(g); 
            break;
         case 2 : page3(g); 
            break;
         case 3 : page4(g); 
            break;
         case 4 : page5(g); 
            break;
         case 5 : page6(g); 
            break;
         case 6 : page7(g); 
            break;
         case 7 : page8(g); 
            break;
         case 8 : page9(g); 
            break;
         case 9 : page10(g); 
            break; 
         case 10 : page11(g); 
            break; 
         case 11 : page12(g); 
            break; 
         case 12 : page13(g); 
            break; 
         case 13 : page14(g); 
            break; 
         case 14 : page15(g); 
            break; 
          //case 15 : page16(g); break; 
          //case 16 : page17(g); break; 
          //case 17 : page18(g); break; 
          //case 18 : page19(g); break; 
          //case 19 : page20(g); break; 
           
          
      }
   }

   public boolean mouseDown(Event e, int x, int y)
   {
      numClicks++;
      repaint();
      return true;
   }

   public void page1(Graphics g)
   {  
      Expo.setBackground(g,Expo.lightBlue);
   
      Expo.setColor(g,Expo.red); 
            
      Expo.setFont(g,"Arial Rounded MT Bold", Font.BOLD, 70); 
      Expo.drawString(g,"Neil's Presentation", 225, 200); 
         
    
      picture1 = getImage(getDocumentBase(),"Kroger.png"); 
      g.drawImage(picture1,200, 325 ,this);
   
   }

   public void page2(Graphics g)
   { 
      Expo.setBackground(g,Expo.red); 
   
      Expo.setColor(g,Expo.black); 
    
      Expo.setFont(g,"Snap ITC", Font.BOLD, 70); 
      Expo.drawString(g,"My Car", 0, 100);  
         
      picture2 = getImage(getDocumentBase(),"SnowCar.jpg"); 
      g.drawImage(picture2,600, 225 ,this); 
      
      picture5 = getImage(getDocumentBase(),"nightCar.jpg"); 
      g.drawImage(picture5,200, 225 ,this);
   
   }

   public void page3(Graphics g)
   { 
      Expo.setBackground(g,Expo.lightGreen); 
    
      Expo.setColor(g,Expo.black); 
      Expo.setFont(g,"Arial", Font.BOLD, 70); 
      Expo.drawString(g,"My School", 90, 100); 
         
      picture3 = getImage(getDocumentBase(),"kingwood.jpg"); 
      g.drawImage(picture3,125 , 125 ,this);
   
   
    
    
   
   }

   public void page4(Graphics g)
   { 
      Expo.setBackground(g,Expo.lightRed); 
    
      Expo.setColor(g,Expo.black); 
      Expo.setFont(g,"Times New Roman", Font.ITALIC, 70); 
      Expo.drawString(g,"I work at Kroger", 0, 100); 
         
      picture4 = getImage(getDocumentBase(),"Store.jpg"); 
      g.drawImage(picture4,200, 225 ,this);
   
   
   
   }

   public void page5(Graphics g)
   { 
      Expo.setBackground(g,Expo.lightPink); 
    
      Expo.setColor(g,Expo.black); 
      Expo.setFont(g,"impact", Font.ITALIC, 70); 
      Expo.drawString(g,"I have 2 dogs", 50, 100); 
   
   }

   public void page6(Graphics g)
   { 
      Expo.setBackground(g,Expo.pumpkin); 
    
      Expo.setColor(g,Expo.black); 
      Expo.setFont(g,"Comic Sans MS", Font.ITALIC, 70); 
      Expo.drawString(g,"I have 1 cat", 50, 100);
   
   }

   public void page7(Graphics g)
   { 
      Expo.setBackground(g,Expo.gold); 
    
      Expo.setColor(g,Expo.black); 
      Expo.setFont(g,"Serif", Font.BOLD, 70); 
      Expo.drawString(g,"I have an addiction to cheerios", 0, 100); 
         
      picture6 = getImage(getDocumentBase(),"Cerial.jpg"); 
      g.drawImage(picture6,125 , 125 ,this); 
      
      picture6 = getImage(getDocumentBase(),"Fancy.png"); 
      g.drawImage(picture6,600 , 225 ,this);
   
   }

   public void page8(Graphics g)
   { 
      Expo.setBackground(g,Expo.maroon); 
    
      Expo.setColor(g,Expo.white); 
      Expo.setFont(g,"monospaced", Font.BOLD, 70); 
      Expo.drawString(g,"I enjoy skyscrapers", 0, 100); 
    
      picture7 = getImage(getDocumentBase(),"tower.jpg"); 
      g.drawImage(picture7,125 , 125 ,this); 
      
      picture8 = getImage(getDocumentBase(),"manytower.jpg"); 
      g.drawImage(picture8,500 , 325 ,this); 
    
   }
	
   public void page9(Graphics g)
   { 
      Expo.setBackground(g,Expo.fuschia); 
    
      Expo.setColor(g,Expo.lime); 
      Expo.setFont(g,"monospaced", Font.BOLD, 60); 
      Expo.drawString(g,"I like to play video games", 0, 100); 
         
      picture9 = getImage(getDocumentBase(),"tf2.jpg"); 
      g.drawImage(picture9,600 , 225 ,this); 
      
      picture10 = getImage(getDocumentBase(),"rust.jpg"); 
      g.drawImage(picture10,200 , 400 ,this); 
      
      picture11 = getImage(getDocumentBase(),"starbound.jpg"); 
      g.drawImage(picture11,200 , 215 ,this);
   
   }

   public void page10(Graphics g)
   { 
      Expo.setBackground(g,Expo.olive); 
    
      Expo.setColor(g,Expo.gold); 
      Expo.setFont(g,"tahoma", Font.BOLD, 60); 
      Expo.drawString(g,"BasketBall is cool too", 0, 100);  
         
      picture12 = getImage(getDocumentBase(),"rocketslogo.png"); 
      g.drawImage(picture12,200 , 215 ,this);
         
   
   
   } 
   public void page11(Graphics g)
   { 
      Expo.setBackground(g,Expo.aqua); 
    
      Expo.setColor(g,Expo.red); 
      Expo.setFont(g,"dialog", Font.ITALIC, 60); 
      Expo.drawString(g,"I really love pasta", 500, 150); 
         
      picture13 = getImage(getDocumentBase(),"rocketslogo.png"); 
      g.drawImage(picture13,200 , 215 ,this);
   
   
   } 
   public void page12(Graphics g) 
   { 
      Expo.setBackground(g,Expo.fireBrick); 
    
      Expo.setColor(g,Expo.black); 
      Expo.setFont(g,"Comic Sans MS", Font.PLAIN, 60); 
      Expo.drawString(g,"Perry is the homie", 0, 100);  
         
   
    
   } 
   public void page13(Graphics g) 
   { 
      Expo.setBackground(g,Expo.amber); 
    
      Expo.setColor(g,Expo.lightBlue); 
      Expo.setFont(g,"Arial", Font.ITALIC, 60); 
      Expo.drawString(g,"My favorite show is spongebob", 0, 550);  
         
   
   
   } 
   public void page14(Graphics g) 
   { 
      Expo.setBackground(g,Expo.lighterTan); 
    
      Expo.setColor(g,Expo.red); 
      Expo.setFont(g,"Arial", Font.ITALIC, 50); 
      Expo.drawString(g,"My favorite movie franchise is Bourne", 0, 100); 
   
   } 
   public void page15(Graphics g) 
   { 
      Expo.setBackground(g,Expo.salmon); 
    
      Expo.setColor(g,Expo.black); 
      Expo.setFont(g,"Snap ITC", Font.BOLD, 60); 
      Expo.drawString(g,"Zebra's are my favorite animal", 100, 630);  
         
   
   
   } 
   public void page16(Graphics g) 
   { 
   
   } 
   public void page17(Graphics g) 
   { 
   
   } 
   public void page18(Graphics g) 
   { 
   
   } 
   public void page19(Graphics g) 
   { 
   
   } 
   public void page20(Graphics g)
   { 
   
   }



}
