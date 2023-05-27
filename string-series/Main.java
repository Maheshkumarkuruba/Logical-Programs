/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
                                // FINDING THE NEAREST VOWELS

/*import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter a character: ");
        int asc = sc.next().charAt(0);
       
        /* Here
         *
         * sc.next() -> reads a String.
         * sc.next().charAt(0)  -> extracts the first character of that string
         * (int)sc.next().charAt(0)  -> gives the ASCII Value of that character
         *
         */
       
        /* ASCII CODE INFORMATION
         *
         * A-Z -> 65-90
         * a-z -> 97-122
         *
         * A - 65
         * E - 69
         * I - 73
         * O - 79
         * U - 85
         *
         * a - 97
         * e - 101
         * i - 105
         * o - 111
         * u - 117
         *
         *
         * There can be characters which can be equidistant from two Vowels. So, we need multiple runs of a loop.
         *
         */
       
        /*/*int VOW[] = {65,69,73,79,85};       //Array of ASCII Codes for Capital Vowels
        int vow[] = {97,101,105,111,117};   //Array of ASCII Codes for Small Vowels
        if((asc>=65)&&(asc<=90))            //Considering Capital Letter Sequence
        {
            int diff[] = new int[5];        //diff[] will contain the difference between input character and Vowels
           
            for(int i=0;i<5;i++)            //This loop calculates all elements of diff[] array
            {
                if(asc>VOW[i])
                {
                    diff[i] = asc - VOW[i];
                }
                else
                {
                    diff[i] = VOW[i] - asc;
                }
            }
           
            int min = diff[0];      //min is the Minimum Difference
            int pos = 0;            //pos is the Array Position corresponding to Minimum Value of diff[]
           
            // for(int i=0;i<5;i++)    //This loop finds minimum value in diff[]
            // {
            //     if(diff[i]<min)
            //     {
            //         min = diff[i];
            //         pos = i;
            //     }
            // }
           
            /* Now, some characters are equidistant from two vowels. So we need to make another loop to check. */
              
            /*int pos2=-1;    //pos2 will contain Array Position of another equidistant vowel, if present. Else it will be negative
           
            for(int i=0;i<5;i++)    //This loop finds if there is another diff[] element with same value as in min
            {
                if(i==pos)
                {
                    continue;
                }
                else
                {
                    if(diff[i]==min)    //If another equidistant value is found, then Array Position is stored in pos2
                    {
                        pos2 = i;
                    }
                }
            }
           
            if(pos2<0)      //Negative pos2 means that there is no second vowel as the answer
            {
                System.out.println("Nearest Vowel is: "+((char)VOW[pos]));
            }
            else
            {
                System.out.println("Nearest Vowels are both:"+((char)VOW[pos])+"and"+((char)VOW[pos2]));
            }
           
           
        }
       
        else if((asc>=97)&&(asc<=122))  //Considering Small Letter Sequence
        {
            int diff[] = new int[5];
           
            for(int i=0;i<5;i++)
            {
                if(asc>vow[i])
                {
                    diff[i] = asc - vow[i];
                }
                else
                {
                    diff[i] = vow[i] - asc;
                }
            }
           
            int min = diff[0];
            int pos = 0;
            for(int i=0;i<5;i++)
            {
                if(diff[i]<min)
                {
                    min = diff[i];
                    pos = i;
                }
            }
           
            int pos2=-1;
           
            for(int i=0;i<5;i++)
            {
                if(i==pos)
                {
                    continue;
                }
                else
                {
                    if(diff[i]==min)
                    {
                        pos2 = i;
                    }
                }
            }
           
            if(pos2<0)
            {
                System.out.println("Nearest Vowel is: "+((char)vow[pos]));
            }
            else
            {
                System.out.println("Nearest Vowels are both: "+((char)vow[pos])+" and "+((char)vow[pos2]));
            }
        }
        else    //Considering the case when input character is not an Alphabet
        {
            System.out.println("Not an Alphabet");
        }
    }
}
*/
                                
                                //THE VOWELS  NOT PRESENT IN SRING
/*import java.lang.*;
import java.util.*;
public class Main
{
public static void main(String[] args) {
// 		System.out.println("Hello World");
int count=0,num=0;
String s1="";
String s="mahesh";
String s2="aeiou";
for(int i=0;i<s2.length();i++){
    char c=s2.charAt(i);
    for(int j=0;j<s.length();j++){
        char ch=s.charAt(j);
    if(c==ch){
        // System.out.println(c);
        count++;
    }
    else{
        num++;
    }
    }
    if(num>=s.length()){
        s1=s1+c;
    }
    num=0;
}
// System.out.println(s.length());
if(count>=s2.length()){
    System.out.println("present");
}
else{
   System.out.println(s1); 
	}
}
}
*/
                        // STRING CHARACTERS ONLY REVERS  123AK@VH   O/P=123HV@KA   inkageError
                        
/*import java.lang.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s="123ak@ml";
	    String s1="",s2="";
	    for(int i=s.length()-1;i>=0;i--){
	      char c=s.charAt(i);
	      if((c>='a'&&c<='z')|| (c>='A'&&c<='Z')){
	         s1=s1+c; 
	      }
	      }
	      int a=0;
	    for(int i=0;i<s.length();i++){
	        char ch=s.charAt(i);
	        if((ch>='a'&&ch<='z')|| (ch>='A'&&ch<='Z')){
	            s2=s2+s1.charAt(a);
	            a++;
	        }
	        else{
	            s2=s2+ch;
	        }
	    }
	    System.out.println(s2);
	}
}
*/                      

                    // REMOVING DUPICATE ELEMENTS EX(HELLO O/P=HEO)    
 /*public class Main{
	public static void main(String[] args) {
	    String s="hello";
	    int c=0;
	    for(int i=0;i<s.length();i++){
	        for(int j=0;j<s.length();j++){
	        if(s.charAt(i)==s.charAt(j)){
	            c++;
	        }
	    }
	    if(c==1){
	        System.out.print(s.charAt(i));
	    }
	    c=0;
	    }
}
}

*/                            //  PRINT DUPICATE ELEMENTS IN STRING EX(HELLO O/P=L)
 /* public class Main{
	   public static void main(String[] args) {
	       String s="hlmelolmml";
	       for(int i=0;i<s.length();i++){
	           int c=0;
	        for(int j=i+1;j<s.length();j++){
	        if(s.charAt(i)==s.charAt(j)){
	           // System.out.print(s.charAt(i));
	              c++;
	        } 
	        }
	       if(c==1){
	          System.out.print(s.charAt(i));  
	       }
      }
}
}*/

                                // REMOVE DUPICATE ELEMENT EX(HELLO=O/P=HELO)
/*public class Main{
	   public static void main(String[] args) {
	       String s="lhelhlo";int c=0;
	       for(int i=0;i<s.length();i++){
	        for(int j=i+1;j<s.length();j++){
	        if(s.charAt(i)==s.charAt(j)){
	           c++;
	        }  
      }
      if(c==0){
      System.out.print(s.charAt(i));
      }
    //   if(c==1){
        // System.out.print(s.charAt(i));      //IF PRINT ONLY "L" EXECUTE LINE
    //   }
      c=0;
	       }
}
}*/

                        // BRACKET BALANCE
/*public class Main{
 public static void main(String[] args) {
     int count=0,num=0;
	       String s=")(())(";
	       for(int i=0;i<s.length();i++){
	           char c=s.charAt(i);
	           if(c==40){
	               count++;
	           }
	           else if(c==41){
	               num++;
	           }
	       }
	       
	       if(count==num){
	           System.out.println("balance");
	       }
	       else{
	           System.out.println("un balance");
	       }
	   }
}
*/

                            // adding numbers between string Ex(s="14 mahesh 123 hi 47 "  o/p==14+123+47=184)
/*import java.util.*;
import java.lang.*; 
public class Main{
 public static void main(String[] args) {
            String s="14 mahesh 123 hi 47 ";
               int n=0,a=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c>='0' && c<='9'){
                         a=(a*10)+(c-48);
                        // System.out.println(s1);
                    }
                  if(c==' '){
                    n+=a;
                    // System.out.println(n);
                    a=0;
        }
                }
      System.out.println(n);  
 }
}
*/

                                // STORING THE STRING WORDS INTO ARRAY
                                
/*public class Main{
 public static void main(String[] args) {
     String s="hello hi mahesh by";
     int j=0;
     String a[]=new String[10];
     String s1="";
     for(int i=0;i<s.length();i++){
         char c=s.charAt(i);
         if(c>='a' && c<='z'){
            s1=s1+c; 
         }
         if(c==' '){
             a[j]=s1;
             j++;
             s1="";
         }
     }
    a[j]=s1;
    for(int i=0;i<=j;i++){
        System.out.print(a[i]+",");
    }
 }
}*/


                            // REMOVE EXTRA SPACES
                            
/*public class Main{
 public static void main(String[] args) {
     String s="hi mahesh  kumar  bye";
     String s1=""+s.charAt(0);
     for(int i=1;i<s.length();i++){
         if(s.charAt(i)!=' ' && s.charAt(i-1)==' '){
             s1=s1+' '+s.charAt(i);
         }
         else if(s.charAt(i)!=' '){
             s1=s1+s.charAt(i);
         }
     }
    System.out.println(s1);
    System.out.println(s);
 }
}*/
                                            // REMOVE THE SPACES ANOTHER METHOD
                                            
                                            
/*public class Main{
 public static void main(String[] args) {
     String s="hi  mahesh kumar  bye";
      String s1="";
     for(int i=0;i<s.length()-1;i++){
         if(s.charAt(i)==' ' && s.charAt(i+1)==' '){
             s1=s1+' '+s.charAt(i);
         }
         else if(s.charAt(i)!=' '){
          s1=s1+s.charAt(i);
         }
     }
     System.out.println(s1);
      System.out.println(s);
 }
}*/
                            // NUMBER OF TIMES OF CHARACTERS PRESENT

/*public class Main{
public static void main(String[] args) {
     String s="hello";
     String s1="hello";
     int count=1;
    //  char visit='1';
     int cha[]=new int[s.length()];
     for(int i=0;i<s.length();i++){
           //  char c=s.charAt(i);
         for(int j=0;j<s1.length();j++){
            //  char ch=s.charAt(j);
             if(s.charAt(i)==s1.charAt(j)){
                 count++;
                //  cha[j]=visit;
                 s1.charAt(j)='\0';
             }
         }
        //  if(s.charAt(i)!=visit){
        //     cha[i]=count; 
        //  }
     }
     for(int i=0;i<cha.length;i++){
         System.out.println(s.charAt(i)+" "+count);
     }
 }
}
*/


            
                             //   LARGEST WORD IN STRING      
 /*public class Main{
 public static void main(String[] args) {
     String s="hello hi h bye welcome";
     String s1="";
     int j=0;
     String a[]=new String[15];
     for(int i=0;i<s.length();i++){
         char c=s.charAt(i);
         if(c!=' '){
             s1=s1+c;
         }
         else{
             a[j]=s1;
             j++;
             s1="";
         }
     }
     a[j]=s1;
       String s2=a[0];
     for(int i=0;i<=j;i++){
         if(a[i].length()>s2.length()){
             s2=a[i];
         }
     }
     System.out.println(s2);
 }
}*/
                                    // DECREASING THE LENGTH OF STRING  LEFT AND RIGHT
 /* public class Main{
 public static void main(String[] args) {
     String s="combination";
     int r=s.length();
     int l=0;
     System.out.println(s);
     for(int i=0;i<s.length()-1;i++){
         if(i%2==0){
             r--;
         }
         else{
             l++;
         }
         String s2="";
         for(int j=l;j<r;j++){
             s2=s2+s.charAt(j);
         }
         System.out.println(s2);
     }
 }
 }*/
 
                                // REVERSE THE ODD POSITION STRING REVERSE ORDER
/*import java.util.*;
import java.lang.*;
public class Main{
public static void main(String[] args) {                                    
     String s="hello hi bye welcome";
     String a[]=s.split(" ");
     for(int i=0;i<a.length;i++){
         if(i%2==1){
             String s1=a[i];
             String s2="";
             for(int j=s1.length()-1;j>=0;j--){
                 s2=s2+s1.charAt(j);
             }
             System.out.print(s2+" ");
         }  
         else{
             System.out.print(a[i]+" ");    
         }
     }
     
 }
}*/
                                    // reverse the string words
/*import java.util.*;
import java.lang.*;                                 
 public class Main{
public static void main(String[] args) {       
    String s="hello hi bye";
    String a[]=s.split(" ");
    for(int i=a.length-1;i>=0;i--){
        System.out.print(a[i]+",");
    }
    
}
}*/

                        // converting String values into int invalus
// public class Main{
// public static void main(String[] args) {     
//     char s='4';
//     int a=s-48;
//     System.out.println(a);
// }
// }


// COMPARING THE TWO STRING VALUES IF TWO VALUES EQUALS THEN IT IS ANAGRAM THE NUMBER OF CHARACTERS ARE SAME AND THE CHARACTES ALSO SAME
// EX("MAHESH","HEMASH")==O/P=ANAGRAM

/*import java.util.*;
import java.lang.*;
public class Main{
 public static void main(String[] args) {
     String s1="mahesh";
     char c1[]=s1.toCharArray();
     String s2="aheshm";
     char c2[]=s2.toCharArray();
      char temp;
    for(int i=0;i<c1.length;i++){
        for(int j=i+1;j<c1.length;j++){
            if(c1[i]>c1[j]){
               temp=c1[i];
               c1[i]=c1[j];
               c1[j]=temp;
            }
        }
    } 
    String s3=Arrays.toString(c1);
    for(int i=0;i<c2.length;i++){
        for(int j=i+1;j<c2.length;j++){
            if(c2[i]>c2[j]){
               temp=c2[i];
               c2[i]=c2[j];
               c2[j]=temp;
            }
            }
        }
    String s4=Arrays.toString(c2);
    if(s3.equals(s4)){
        System.out.println("anagram");
    }
    else{
        System.out.println("not anagram");
    }
}
}*/

                            
/*public class Main{
 public static void main(String[] args) {
     int count=0;
    char c[]={'h','e','l','l','o'};
    char c1[]={'h','e','l','l','o'};
    for(int i=0;i<c.length;i++){
        for(int j=0;j<c.length;j++){
        if(c[i]==c1[j]){
            count++;
            c1[j]='\0';
        }
        }
        //  System.out.println(c[i]);
        if(count>=1){
        System.out.println(c[i]+" "+count);
        count=0;
        }
        
    }
 }
}
*/

                     // HIGHEST STRING PALINDRAM

/*public class Main{
    public static boolean palindram(String s){
        String s1="";
        for(int i=0;i<s.length();i++){
            s1=s.charAt(i)+s1;
        }
            return s1.equalsIgnoreCase(s);
        
    }
 public static void main(String[] args) {
     int c=0;
     String s="ceabba";
     String ans=s.charAt(0)+"";
     for(int i=0;i<s.length();i++){
         String temp=""+s.charAt(i);
         for(int j=i+1;j<s.length();j++){
             c++;
            temp=temp+s.charAt(j);
            if(palindram(temp)){
                if(ans.length()<temp.length()){
                ans=temp;
            
            }
            }
         }
     }
     System.out.println(ans);
     System.out.println(c);
 }
}*/

                    // BALANCED BRACKETS ex{"(()()())"}
/*import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args) {
        int c=0;
        String s1="(()))()";
        char a[]=s1.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='('){
                for(int j=i+1;j<a.length;j++){
                    if(a[j]==')'){
                    a[j]='\0';
                    c++;
                    }
                }
            }
        }
            if(c==s1.length()/2 && s1.length()%2==0){
                System.out.println("balanced brackets "+c);
            }
            else{
                 System.out.println("unbalanced brackets "+c);
            }
        }
    }
            */        





































