/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
                                    // prime number
/*import java.util.*;
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp=0;
for(int i=2;i<n;i++){
  if(n%i==0){
      temp++;
  } 
}
if(temp>=1){
    System.out.println( n+":is not a prime number");
}
else{
System.out.println(n+":is prime number");
}

	}
}*/
                                // perfect number
                                
/* public class Main{
     	public static void main(String[] args) {
     	    int n=28,temp=0;
     	    for(int i=1;i<n;i++){
     	        if(n%i==0){
     	            temp+=i;
     	        }
     	       
     	    }
     	     if(temp==n){
     	            System.out.println(n+":is perfect number");
     	        }
     	        else{
     	            System.out.println(n+":is not perfect number");
     	        }
     	}
}*/
                            //  AMSTRONG NUMBER (153)
/*import java.util.*;
import java.lang.*;
public class Main{
     	public static void main(String[] args) {
     	    Scanner sc=new Scanner(System.in);
     	    int n=sc.nextInt();
     	    int num,len=0,add=0,count=0,temp=n,m=n;
     	    for(int i=n;i>0; i/=10){
     	    count++;
     	  //  System.out.println(count);
     	    }
     	    System.out.println("==");
     	    for(int i=temp;i>0;i/=10){
     	        num=i%10;
     	        add=(int)(Math.pow(num,count));
     	        len+=add;
     	    }
     	    if(len==n){
     	        System.out.println(m+":is amstrong number");
     	    }
     	    else{
     	        System.out.println(m+":is not amstrong number");
     	    }
     	}
}*/
     	                //  PALINDROM (141,545)BY USING FOR LOOP  
     	                              
/*import java.util.*;
public class Main{
    public static void main(String[] args){
        int sum=0,temp,num,n=151;
        for(int i=n;i>0;i/=10){
          temp=i%10;
          sum=(sum*10)+temp;
        //   System.out.println(n);
        }
        if(sum==n){
            System.out.println(" number is palindram");
        }
        else{
            System.out.println(" number is not palindram");
        }
}
}*/


                         //  PALINDRAM (151,545) BY USING WHILE LOOP 
/*        int r,sum=0,temp;    
  int n=151;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
  r=n%10;  //getting remainder  
  sum=(sum*10)+r;    
  n=n/10;    
  }    
  if(temp==sum)    
  System.out.println("palindrome number ");    
  else    
  System.out.println("not palindrome");  
    }
}*/

                                // FINDING LCM
/*      import java.util.*;
public class Main{
    public static void main(String[] args){
        int a=10,b=20,g=0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                g=i;
            }
        }
         int l=a*b/g;
         System.out.println(l);
    }
}*/

                                     // STRONG NUMBER FACTORIAL(145==(1!+4!+5!)) AND (40585) ALSO STRONG NO
 /*import java.util.*;                     
public class Main{
  public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
      int count,fact=1,sum=0 ,temp=n;
      for(int j=n;j!=0;j/=10){
      for(int i=j%10;i>=1;i--){
          fact=i*fact;
      }
      System.out.println("==");
      sum=sum+fact;
      System.out.println(sum);
      fact=1;
       
      }
      if(temp==sum){
          System.out.println("it is strong number");
      }
      else{
          System.out.println("not strong number");
      }
  }
}

    */                                    // Arraylist

//   import java.util.*;
//   import java.lang.*;
// public class Main{
    
//     public static void main(String[] args){                              
                                
//         ArrayList a1=new ArrayList();
//     a1.add(1,20);   
//     }
// }
                            // SWITCH STATEMENT
  
/*  
import java.util.*;                     
public class Main{
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("enter symbol ( +,-,*,/) ");
        String mahe=sc.nextLine();
        int res;
        // char mahe=*;
        switch(mahe){
            case "+":res=n1+n2;
            System.out.println(res);
            break;
            case "*":
                res=n1*n2;
                System.out.println(res);
                break;
            case "-": res=n1-n2;
                System.out.println(res);
                break;
            case "/":res=n1/n2;
                System.out.println(res);
                break;
            default :
                System.out.println("invalid");
                        break;
        }    
    }
}*/


                    // Duck Number (201,504,780) all are duck numbers,a numbae  having 0 in i
                        /*class Main{
                    public static void main(String[]args){        
                    int n=15,temp,count=0,num=0;
                   for(int i=n;i>0 ;i/=10){
                       temp=i%10;
                       num++;
                       if(temp==0){
                           System.out.println("it is duck number");
                       }
                       else{
                           count++;
                       }
                        }
                        if(count>=num){
                           System.out.println("it is not a duck number");
                       }
                        }
                        }*/
                                
                                
                            // Fabonacci number  
                            /*class Main{
                                public  static void main(String[]args){ 
                               int a=0,b=1,sum=0,n=5;
                               for(int i=1;i<=n;i++){
                                   sum=a+b;
                                   a=b;
                                   b=sum;
                                   
                               }
                               System.out.println(sum);
                            }
                            }*/
                            
                // DUMMY NUMBER OR DUPLICATE NUMBER (IF ONE DIGIT IS PRESENT 2TIMES IN A NUMBER IS CALLES AS DUPLICATE NO)
                
                /*class Main{
                    public static void main(String[]args){
                int n=123,m,num,temp,count=0;
                for(int i=n;i>0;i/=10){
                    m=i/10;
                    for(int j=m;j>0;j/=10){
                        temp=j%10;
                        num=i%10;
                        if(num==temp){
                            count++;
                        }
                    }
                }
                  if(count>=1){
                      System.out.println("it is dummy no");
                  }             
                  else{
                      System.out.println("it is not a dummy no");
                  }
                    }
                }*/
                                
                                
                                
                    // GETTING GIVEN NUMBER IS POWER OF 2 IS NOT ex(15 IS NOT POWER OF 2 SO PRINT FALSE)
            
                    /*class Main{
                    public static void main(String[]args){
                        boolean flag=true;
                        int n=60;
                        for(int i=n;i>1;i/=2){
                            if(i%2==1){
                                flag=false;
                                System.out.println(i);
                            }
                        }
                        if(flag==true){
                            System.out.println("true");
                        }
                        else{
                            System.out.println("false");
                        }
                    }
                            }*/


                        
                        
                        
                            








