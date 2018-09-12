import java.util.*;


/**
 * Javadocs are required
 */
class CheckTest
{
	// <-- there is a tab here

   // bad variables have something wrong with their names

   public static final int GOODCONSTANT = 5;
   public static final int GOOD_CONST7 = 7;
   public static final int bad_CONSTANT = 1;
   public static final int badCONSTANT = 2;
   static final int _BAD_CONSTANT = 3; // needs visibility modifier

   private int _goodInt;
   public int _BadInt; // visibility should be private
   private int _Badint;
   int badInt; // needs visibility modifier

   // statements on same line. wrong indentation
      private static boolean _bad1, _bad2 = true;

   // main is out of order, should be at file end
   public static void main(String[] args)
   {
      int _badLocalName;
      int myMotherDressedMeUgly[]; // if you are blind to sarcasm, this is bad
      int[] myParentsLovedMe; // good

      BadMethod(0,0,0);

      // bad for loop, no spacing and uses magic numbers
      for(int i=0;i<10;i++)
      {
         System.out.println("I've been a very bad for-loop!");
      }
      // also bad. two statements on one line is bad. total must be declared at
      // start of method.
      int total=1+2; _bad1 = _bad2;

         // using no braces is bad. comment is also not lined up. This line is also over 80 characters long
      if (_bad1)
         _bad2 = false;
      else
      {
         // I have braces
      }
   }

   // no javadocs should throw error on normal methods, also longer than 30
   // lines. braces also dont align
   public void BadMethod(int goodParam, int _badParam, int BadParam) {

      int goodLocal;

      // BadLocal has trailing whitespace
      int BadLocal;
      int _badLocal;
      int bad_local;

      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
      _badLocal = goodLocal + bad_local;
   }

   public CheckTest()
   {
      // bad, out of order and empty constructor!
   }

}


class badclass {}