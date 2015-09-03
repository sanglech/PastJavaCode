public class PreLab
  
{ public static void main (String[] args)
  
  { int r,q,p,s,t,u,m,d;
  
  System.out.println  ("Please enter your year");
  
  int y = ReadLib.readInt ();
  
  p= y / 100;
  q = y - 19 *(y/19);
  r = p - 17/25;
  s = p - ( p / 4 ) - ( p - r ) / 3 + 19*q + 15;
  s = s - 30 *(s/30);
  s = s - (s / 28) * [ 1 - (s/28) * (29/(s+1)) * (21- q/ 11) ];
  t= y + y /4 + s + 2 - p + p/4;
  t= t-7 * (t/7);
  u = s - t;
  m= 3 + (u+ 40)/44;
  d = u + 28 -31 * (m/4);
  
  System.out.println ( " Day was " + d);
  
  System.out.println ( "Month was " + m);
  
}


}