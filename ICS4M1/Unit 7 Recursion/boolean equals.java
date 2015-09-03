// boolean equals( String strA, String strB )
//  {
//    if       ( strA.length() == 0 && strB.length() == 0 )
//      return true;
//      
//    else if  ( strA.length() == 0 && strB.length() != 0 )
//      return false;
//      
//    else if  ( strA.length() != 0 && strB.length() == 0 )
//      return false;
//      
//    else if  ( strA.charAt(0) != strB.charAt(0) )
//      return false;
//      
//    else
//      return equals( strA.substring(1), strB.substring(1) );
//  }