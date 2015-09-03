//Christian Sangle

import java.util.*;
import java.io.*;

public class DemoBridgePoints
{
  public static void main (String [] args)throws IOException
  {
    BufferedReader hand = new BufferedReader (new InputStreamReader (System.in));
    
    System.out.println(" PLease Enter your Hand ");//User enters their hand.
    String cards= hand.readLine();
    
    int positionC= cards.indexOf("C");
    int positionD=cards.indexOf("D");
    int positionH=cards.indexOf("H");
    int positionS=cards.indexOf("S");
    
    Bridge score= new Bridge(cards,positionC,positionD,positionH,positionS);//This class calculates the score.
    
    int pointsC=score.getCpoints();
    int pointsD=score.getDpoints();
    int pointsH=score.getHpoints();
    int pointsS=score.getSpoints();
    
    Card suit= new Card(cards,positionC,positionD,positionH,positionS);//Class determines which cards are what suit.
    String cardClubs= suit.getClubs();
    String cardDiamonds= suit.getDiamonds();
    String cardHearts= suit.getHearts();
    String cardSpades= suit.getSpades();
    
    Exceptions bonus = new Exceptions(cards,cardClubs,cardDiamonds,cardHearts,cardSpades);//Class adds points if hand has a doubleton or a singleton or a void.
    int clubBonus=bonus.getClubBonus();
    int diaBonus=bonus.getDiamBonus();
    int heartBonus=bonus.getHeartBonus();
    int spadeBonus=bonus.getSpadeBonus();
    
    int total= pointsC + pointsD + pointsH + pointsS+clubBonus+diaBonus+heartBonus+spadeBonus;//Total Points
      
    System.out.println("Clubs: "+ cardClubs + " Score: "+ (pointsC+clubBonus));
    System.out.println("Diamonds: "+cardDiamonds + " Score: " + (pointsD+diaBonus));
    System.out.println("Hearts: "+ cardHearts + " Score: "+ (pointsH+heartBonus));
    System.out.println("Spades: "+cardSpades+ " Score: "+(pointsS+spadeBonus));
    System.out.println("Total: "+ total);
  }

}
//C258TJKD69QAHSTJA

class Card //Seperates the cards and determines which cards are which suit.
  {
    private String card2="";
    private String cardClub="";
    private String cardDiamond="";
    private String cardHeart="";
    private String cardSpade="";
    private int posC = 0;
    private int posD = 0;
    private int posH= 0;
    private int posS = 0;
    
    Card(String ca, int pc,int pd,int ph,int ps)
    {
      card2=ca;
      posC=pc;
      posD=pd;
      posH=ph;
      posS=ps;
      cardClubs();
      cardDiamonds();
      cardHearts();
      cardSpades();
    }
    private void cardClubs()
    {
      cardClub+=card2.substring(posC+1,posD);
    }
    private void cardDiamonds()
    {
      cardDiamond+=card2.substring(posD+1,posH);
    }
    private void cardHearts()
    {
      cardHeart+=card2.substring(posH+1,posS);
    }
    private void cardSpades()
    {
      cardSpade+=card2.substring(posS+1,card2.length());
    }
    String getClubs()
    {
      return cardClub;
    }
    String getDiamonds()
    {
      return cardDiamond;
    }
    String getHearts()
    {
      return cardHeart;
    }
    String getSpades()
    {
      return cardSpade;
    }
  }
  class Bridge//Calculates the Score
  {
    private String cards2="";
    private int pointC = 0;
    private int pointD = 0;
    private int pointH= 0;
    private int pointS = 0;
    private int clubs=0;
    private int diamond=0;
    private int hearts=0;
    private int spade=0;
    
    Bridge(String c,int cl, int dia, int h, int s )
    {
      cards2=c;
      clubs=cl;
      diamond=dia;
      hearts=h;
      spade=s;
      points();
    }
    private void points()//Calculates the points.
    {
      for(int i=clubs; i<diamond;i++)//Counts Points for Clubs.
      {
        if(cards2.charAt(i)=='A')
        {
          pointC+=4;
        }
        if(cards2.charAt(i)=='K')
        {
          pointC+=3;
        }
        else if(cards2.charAt(i)=='J')
        {
          pointC+=1;
        }
        else if(cards2.charAt(i)=='Q')
        {
          pointC+=2;
        }
        else
        {
          pointC+=0;
        }
      }
      for(int x= diamond ; x < hearts;x++)//Counts points for Diamonds.
      { 
        if(cards2.charAt(x)=='A')
        {
          pointD+=4;
        }
        if(cards2.charAt(x)=='K')
        {
          pointD+=3;
        }
        else if(cards2.charAt(x)=='J')
        {
          pointD+=1;
        }
        else if(cards2.charAt(x)=='Q')
        {
          pointD+=2;
        }
        else
        {
          pointD+=0;
        }
      }
      for(int y= hearts; y < spade;y++)//Counts points for hearts.
      { 
        if(cards2.charAt(y)=='A')
        {
          pointH+=4;
        }
        if(cards2.charAt(y)=='K')
        {
          pointD+=3;
        }
        else if(cards2.charAt(y)=='J')
        {
          pointH+=1;
        }
        else if(cards2.charAt(y)=='Q')
        {
          pointH+=2;
        }
        else
        {
          pointH+=0;
        }
      }
      
      for(int z= spade; z <= cards2.length()-1;z++)//Counts points for spades.
      { 
        if(cards2.charAt(z)=='A')
        {
          pointS+=4;
        }
        if(cards2.charAt(z)=='K')
        {
          pointS+=3;
        }
        else if(cards2.charAt(z)=='J')
        {
          pointS+=1;
        }
        else if(cards2.charAt(z)=='Q')
        {
          pointS+=2;
        }
        else
        {
          pointS+=0;
        }
      }
    }
    int getCpoints()
    {
      return pointC;
    }
    int getDpoints()
    {
      return pointD;
    }
    int getHpoints()
    {
      return pointH;
    }
    int getSpoints()
    {
      return pointS;
    }
  }
  class Exceptions//Calculates if the hand has a singleton,doubleton, or the none of that suit.
{
  private String card="";
  private String posC ="" ;
  private String posD = "";
  private String posH= "";
  private String posS = "";
  private int spadePt=0;
  private int clubPt=0;
  private int heartPt=0;
  private int diaPt=0;
  
  Exceptions(String c,String psC, String psD,String psH,String psS)
  {
    card=c;
    posC=psC;
    posD=psD;
    posH=psH;
    posS=psS;
    singleton();
  }
  private void singleton()
  {
    if(posC.length()<=2)
    {
      clubPt+=1;
      if(posC.length()==1)
      {
        clubPt-=1;
        clubPt+=2;
      }
      else if(posC.length()==0)
      {
        clubPt-=1;
        clubPt+=3;
      }
    }
    if(posD.length()<=2)
    {
      diaPt+=1;
      if(posD.length()==1)
      {
        diaPt-=1;
       diaPt+=2;
      }
      else if(posD.length()==0)
      {
        diaPt-=1;
        diaPt+=3;
      }
    }
    if(posH.length()<=2)
    {
      heartPt+=1;
      if(posH.length()==1)
      {
        heartPt-=1;
        heartPt+=2;
      }
      else if(posH.length()==0)
      {
        heartPt-=1;
       heartPt+=3;
      }
    }
    if(posS.length()<=2)
    {
      spadePt+=1;
      if(posS.length()==1)
      {
        spadePt-=1;
        spadePt+=2;
      }
      else if(posS.length()==0)
      {
        spadePt-=1;
        spadePt+=3;
      }
    }
}
  int getClubBonus()
  {
    return clubPt;
  }
  int getDiamBonus()
  {
    return diaPt;
  }
  int getHeartBonus()
  {
    return heartPt;
  }
  int getSpadeBonus()
  {
    return spadePt;
  }
}