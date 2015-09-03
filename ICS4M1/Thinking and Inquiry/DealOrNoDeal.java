//Christian Sangle
import java.io.*;
public class DealOrNoDeal
{
  public static void main (String [] args) throws IOException
  {
    BufferedReader bcase = new BufferedReader (new InputStreamReader (System.in));
    int elimCase;
    int leftCases;
    int total;
    int banker=500;
      
    int briefcase[]= new int[11];
    briefcase[1]=100;
    briefcase[2]=500;
    briefcase[3]=1000;
    briefcase[4]=5000;
    briefcase[5]=10000;
    briefcase[6]=25000;
    briefcase[7]=50000;
    briefcase[8]=100000;
    briefcase[9]=500000;
    briefcase[10]=1000000;
    
    total= briefcase[1]+briefcase[2]+briefcase[3]+briefcase[4]+briefcase[5]+briefcase[6]+briefcase[7]+briefcase[8]+briefcase[9]+briefcase[10];
   
    System.out.println("How many cases are open ?");
    leftCases=Integer.parseInt(bcase.readLine());
    
    for (int n=0; n<leftCases; n++)
    {
    System.out.println("Which case is open ?");
    elimCase=Integer.parseInt(bcase.readLine());
    
    if(elimCase==1)
    {
      total-=briefcase[1];
      briefcase[1]=0;
    }
    else if(elimCase==2)
    {
      total-=briefcase[2];
      briefcase[2]=0;
    }  
     else if(elimCase==3)
    {
      total-=briefcase[3];
      briefcase[3]=0;
    }  
    else if(elimCase==4)
    {
      total-=briefcase[4];
      briefcase[4]=0;
    }
     else if(elimCase==5)
    {
      total-=briefcase[5];
      briefcase[5]=0;
    }
      else if(elimCase==6)
    {
      total-=briefcase[6];
      briefcase[6]=0;
    }
       else if(elimCase==7)
    {
      total-=briefcase[7];
      briefcase[7]=0;

    }
        else if(elimCase==8)
    {
      total-=briefcase[8];
      briefcase[8]=0;

    }
         else if (elimCase==9)
    {
      total-=briefcase[9];
      briefcase[9]=0;
    }
       else if(elimCase==10)
       {
         total-=briefcase[10];
         briefcase[10]=0;
       }
    }
    
    if(briefcase[2]==0&&briefcase[3]==0&&briefcase[8]==0)
    {
      banker=198000;
    }
    
     if(briefcase[10]==0&&briefcase[9]==0&&briefcase[8]==0&&briefcase[7]==0&&briefcase[6]==0&&briefcase[5]==0&&briefcase[4]==0&&briefcase[3]==0)
    {
      banker=400;
    }
    
       if(total<banker)
    {
      System.out.println("Banker Offer: "+ banker);
      System.out.println("Deal");
    }
    else if(total>banker)
    {
      System.out.println("Banker Offer: "+ banker);
      System.out.println("No Deal");
    }
  }
}
