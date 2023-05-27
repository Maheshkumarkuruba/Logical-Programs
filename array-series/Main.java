/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
                                        //  FINDING DUPICATE ELEMENTS
// public class Main
// {
// 	public static void main(String[] args) {
// // 		System.out.println("Hello World");
// 		int a[]={1,2,3,4,1,4};
// 		for(int i=0;i<a.length;i++){
// 		    for(int j=i+1;j<a.length;j++){
// 		        if(a[i]==a[j]){
// 		            System.out.println(a[i]);
// 		        }
// 		    }
// 		}
		
// 	}
// }

                                 //   FINDING MAX AND MIN
// public class Main
// {
// 	public static void main(String[] args) {
// // 		System.out.println("Hello World");
// 		int a[]={1,2,3,4,5,4,45,78,100};
// 		int max=a[0];
// 		for(int i=0;i<a.length;i++){
// 		    if(a[i]>max){
// 		    max=a[i];
// 		    }
// 		}
// 	System.out.println(max);	
// 	}
// }

        //  REPLACE FACTORS SUM TO ARRAY (5 FACTORS IS 1,5==1+5=6 SO 5 IS REPLACED BY 6)
     /*public class Main
                       {
	public static void main(String[] args) {
	    int sum=0;
        int a[]={5,8,10,12};
        for(int i=0;i<a.length;i++){
            for(int j=1;j<=a[i];j++){
               if(a[i]%j==0){
                sum=sum+j;
            } 
            }
            a[i]=sum;
            sum=0;
           System.out.println(a[i]); 
        }
}
}*/

                        // ROTATING ARRAY BY D TIMES
/*int arr[]={1,2,3,4};
int d=3,n=4;
int count=1;
        while(true){
            if(count<=d){
                int a1=arr[0];
                for(int i=0;i<n-1;i++){
                    arr[i]=arr[i+1];
                    
                }
                arr[n-1]=a1;
                count++;
            }
            else{
                break;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
	}
}*/


                        // SUM OF PRIME ELEMENTS IN ARRAY

/*public class Main
                       {
	public static void main(String[] args) {
	    int count=0,sum=0;
int a[]={5,2,3,7};
for(int i=0;i<a.length;i++){
    for(int j=1;j<=a[i];j++){
        if(a[i]%j==0){
            count++;
        }
    }
    if(count==2){
        sum+=a[i];
       count=0;
    }
}
    System.out.println(sum);
}
}*/

                                  // CHECK SUM OF ARRAY IS PRIME OR ARMSTRONG
//         import java.lang.*;                    
// public class Main{
// 	public static void main(String[] args) {
// 	    int sum=0,count=0;
// 	    int a[]={1,1,5};
// 	    for(int i=0;i<a.length;i++){
// 	       //  System.out.println(a[i]);
// 	        sum+=a[i];
// 	    }
// 	   //  System.out.println(sum);
// 	    for(int i=1;i<=sum;i++){
// 	        if(sum%i==0){
// 	            count++;
// 	        }
// 	    }
// if(count==2){
//     System.out.println("sum is prime no");
// }
// else{
//  System.out.println("sum is not a prime no");    
// }

//                             // CHECK ARRAY SUM IS ARMSTONG OR NOT  
//         int temp,num=0,am=0;
//         for(int j=sum;j>0;j/=10){
//             num++;
//         }
// for(int j=sum;j>0;j/=10){
//     temp=j%10;
//     int cal=(int)Math.pow(temp,num);
//   am+=cal; 
// }
// if(sum==am){
//      System.out.println("sum is armstrong no");
// }
// else{
//      System.out.println("sum is not armstrong no");
// }
// }
// }

                                // PRINT THE SUM OF ARRAY BY ELEMINATING MAX ELEMENT IN IT  eg:(12,1,3,12)==(1+3=4)

/*import java.lang.*;  
import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    int max=a[0],sum=0;
	    for(int i=0;i<n;i++){
	        if(a[i]>max){
	        max=a[i];
	        }
	    }
	    for(int i=0;i<n;i++){
	    if(a[i]!=max){
	        sum=sum+a[i];
	    }
	    }
	    System.out.println(sum);
	}
}*/
                        // PRINTING [45,7,88,9,12,99]==O/P{-1,45,-1,88,88,-1}
                        // or [22,1,84,21,41]==o/p{-1,22,-1,84,84}
                        
/*public class Main{
	public static void main(String[] args) {
int a[]={22,1,84,21,41};
int max=a[1];
for(int i=0;i<a.length;i++){
    if(max>a[i]){
      a[i]=max;  
    }
    else{
        max=a[i];
        a[i]=-1;
    }
    System.out.println(a[i]);
}
}
}*/


                        // DECIMAL TO BINARY USING ARRAY
  /* public class Main{
  public static void toBinary(int decimal){    
     int binary[] = new int[40];    
     int index = 0;    
     while(decimal > 0){    
       binary[index++] = decimal%2;    
       System.out.println(index);
       decimal = decimal/2;    
     }    
     for(int i = index-1;i >= 0;i--){    
       System.out.print(binary[i]);    
     }    
System.out.println();//new line  
}    
public static void main(String args[]){      
System.out.println("Decimal of 10 is: ");  
toBinary(10);    
System.out.println("Decimal of 21 is: ");  
toBinary(21);    
System.out.println("Decimal of 31 is: ");    
toBinary(31);  
}
    }*/    

                             // DECIMAL TO   BINARY  USING SCANNER
/*import java.util.Scanner;
public class Main {
public static void main (String[] arg){
System.out.print("please enter the decimal number :");
int dec_num = new Scanner(System.in).nextInt();
int[] bin_num = new int[110];
int r =0;
while (dec_num>0) {
bin_num[r] = dec_num % 2;
r++;
dec_num = dec_num / 2;
}

for ( r=r-1;r>=0;r--){
System.out.print(bin_num[r]);
}

}
}   */

                                 // kth largest element (IF K=2 PRINT 2ND ELEMENT OF ARRAY)
 /*import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
    if (i==k-1){ 
        System.out.println(a[i]);
}
}
}
}*/

                            // MISSING ELEMENTS IN ARRAY{1,2,3,5}==4 IS MISSING ELEMENT IN ARRAY
/*import java.util.*;
import java.lang.*;
public class Main{     
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
int exp=(n+1),totsum,temp,sum=0,num;
totsum=(exp*(exp+1))/2;
for(int i=0;i<n;i++){
            sum=sum+a[i];
}
num=totsum-sum;
System.out.println(num);    
}
}*/

                                // INSERT THE ELEMENT IN GIVEN POSITION
/*import java.util.*;
import java.lang.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int position=sc.nextInt();
int value=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
for(int i=n-1;i>position;i--){
    a[i]=a[i-1];
}
a[position]=value;
for(int i=0;i<n;i++){
    System.out.println(a[i]);
}
}
}
*/

                            // REMOVE ELEMENTS IN ARRAY   
/*public class Main{
    public static void main(String[]args){
        int a[]={1,2,3};
        int v=2;
        for(int i=0;i<a.length-1;i++){
            if(v==a[i]){
                a[i]=a[i+1];
            }
            System.out.println(a[i]);
        }
    }
}*/
                               
                               
                                //   FIND THE SECOND LARGEST ELEMENTS
                                
                       /* public class Main{
                           public static void main(String[]args){ 
                               int a[]={0,1,0,1,2,0,1};
                               int temp;
                               for(int i=0;i<a.length;i++){
                                   for(int j=i+1;j<a.length;j++){
                                       if(a[i]>a[j]){
                                           temp=a[i];
                                           a[i]=a[j]; 
                                           a[j]=temp;
                                       }
                                   }
                                   System.out.println(a[i]);
                               }
                               
                           }
                        }*/
                        
                            // REMOVE TWO ELEMENETS WHICH ARE DUPICATE EX[1,2,1,0] O/P=[2,0]
                            
     /*  public class Main{
      public static void main(String[]args){  
          int a[]={1,2,3,4,1,2};
          int count=0;
          for(int i=0;i<a.length;i++){
              for(int j=i+1;j<a.length;j++){
                  if(a[i]==a[j]){
                      count++;
                  }
              }
              if(count==1){
                  System.out.print(a[i]+",");
              }
              count=0;
          }
      }
        }
*/
                                // REMOVE DUPLICATE ELEMENTS EX[1,2,1,2,4,5 O/P==1,2,4,5]

/*public class Main{
      public static void main(String[]args){  
          int a[]={1,2,1,5,3,4,1,2,5};
          int count=0;
          for(int i=0;i<a.length;i++){
              for(int j=i+1;j<a.length;j++){
                  if(a[i]==a[j]){
                      count++;
                  }
              }
              if(count==0){
                  System.out.print(a[i]+",");
              }
              count=0;
          }
      }
        }*/



                            // SUM OF DUPLICATE ELEMENTS EXA[1,2,1,2,4,4 O/P==1+2=3]
                            
/*public class Main{
      public static void main(String[]args){
          int n=0;
          int a[]={1,1,2,1,2,4,5};
          for(int i=0;i<a.length;i++){
              int c=0;
             for(int j=i+1;j<a.length;j++){
                 if(a[i]==a[j]){
                 c++;
                 }
             }
             if(c==1){
                n+=a[i]; 
             }
          }
          System.out.println(n);
              }
}*/

                            // SUM OF NON-DUPLICATE ELEMENTS EXAMPLE[1,2,1,2,4,5]  O/P==4+5=9


/*public class Main{
      public static void main(String[]args){
          int n=0;
          int a[]={1,1,2,1,2,4,5};
          for(int i=0;i<a.length;i++){
              int c=0;
             for(int j=0;j<a.length;j++){
                 if(a[i]==a[j]){
                 c++;
                 }
             }
             if(c==1){
                n+=a[i]; 
             }
          }
          System.out.println(n);
              }
}*/

                        //  FREQUENCY OF ELEMENTS IN ARRAY  
                        /*public class Main {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1,1};  
        //Array fr will store frequencies of element  
        int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
  
        //Displays the frequency of each element present in array  
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  
    }}  
*/

                        //   FINDING SUM OF ALPHABETS NUMBERS
                        
// String a[][]={{"abc"},{"def"},{"ghi"},{"jkl"},{"mno"},{"pqr"},{"stu"},{"vwx"},{"yz"}};
// String s="hello";


// IF ADDJECENT ELEMENTS  OR SEQUENCE OF NUMBERS ARE PRESENT IN A STRING THEN PRINT WEEK ELSE PRINT STRONG {EX:(HELLO123) HERE LL ARE ADJECENT ELENTS AND 123 ARE IN SEQUENCE ORDER} 

/*public class Main {  
public static void main(String[] args) {
String s="helo464";
boolean b=true;
for(int i=0;i<s.length()-1;i++){
    char c=s.charAt(i);
    if(c>='0'&& c<='9'){
      if(c==s.charAt(i+1)|| c+1==s.charAt(i+1)){
          b=false;
          break;
      }  
    }
   else if(c==s.charAt(i+1)){
       b=false;
       break;
   }
   
}
if(b==true){
    System.out.println("strong");
}
else{
    System.out.println("week");
}
}
}
*/

                        // (OR)
                        
 //  IF ADDJECENT ELEMENTS  AND SEQUENCE OF NUMBERS IN A STRING THEN PRINT WEEK ELSE PRINT STRONG {EX:(HELLO123) HERE LL ARE ADJECENT ELENTS AND 123 ARE IN SEQUENCE ORDER} 


/*public class Main {  
public static void main(String[] args) {
String s="helo468";
boolean b=true;
for(int i=0;i<s.length()-1;i++){
    char c=s.charAt(i);
    if(c>='0'&& c<='9'){
      if((s.charAt(i+1)-48)-(c-48)==1){
          b=false;
          break;
      }  
    }
   else if(c==s.charAt(i+1)){
       b=false;
       break;
   }
}
if(b==true){
    System.out.println("strong");
}
else{
    System.out.println("week");
}
}
}
*/

            //  A[I]=A[I]>B[I] NUMBER OF ITERARTION 

/*public class Main {  
public static void main(String[] args) {
         int a[]={5,7,10,5,15};
         int b[]={2,2,1,3,5};
         int c=0;
         while(true){
             boolean flag=true;
             for(int i=0;i<a.length;i++){
                 if(a[i]>b[i]){
                     flag=false;
                     a[i]=a[i]-b[i];
                 }
             }
             if(flag==false){
                 c++;
             }
             else{
                 break;
             }
         }
         System.out.println(c);
}
}*/

                        // IDENTICAL MATRIX  COMPARING A[I][J]==B[I][J] 2D MATRIX  
                        
 /*public class Main {  
public static void main(String[] args) {
        int count=0;
    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    int b[][]={{1,2,3},{4,5,6},{7,8,9}};
    for(int i=0;i<a.length;i++){
        for(int j=0;j<b.length;j++){
           if(a[i][j]==b[i][j]){
               count++;
           }
        }
    }
    if(count==(a.length*b.length)){
        System.out.println("identical");
    }
    else{
       System.out.println("not identical"); 
    }
}
}*/
                  
                              // Adding elements of array in revers ex([1,2,3]==123+321==444)  
/*public class Main {  
public static void main(String[] args) {
    int a[]={1,2,3};
    int b[]=new int[a.length];
    int count=a.length-1,num=0,sum,renum=0,temp;
    for(int i=0;i<a.length;i++){
        num=(num*10+a[i]);
        renum=(renum*10+a[count]);
        count--;
    }
    int n=0;
    sum=num+renum;
    for(int j=sum;j>0;j/=10){
        temp=j%10;
        b[n]=temp;
        n++;
        
    }
    System.out.println(sum);
    for(int i=b.length-1;i>=0;i--){
    System.out.print(b[i]+" ");
    }
}
}*/


        
/*public class Main {  
public static void main(String[] args) { 
    int a[]={1,1,2};
    // int n1=a.length;
    while(true){
        
                for(int i=0;i<n1-1;i++){
                    if(a[i]>a[i+1]){
                        a[i]=a[i]-a[i+1];
                    }
                    else{
                        a[i]=a[i+1]-a[i];
                    }
                }  
                if(n1==1){
                    break;
                }
                // a.length--;
    }
    System.out.println(a[0]);
}
}*/


/*public class Main {  
public static void main(String[] args) { 
    int arr[]={1,2,3,3};
    int n=2;
    int leftsum=0;

        for(int i=0;i<n;i++){

            leftsum+=arr[i];
        }
        int rightsum=0;
        for(int i=n-1;i>=0;i--){
            leftsum-=arr[i];
            if(leftsum==rightsum){
                System.out.println("YES");
            }
            rightsum+=arr[i];
        }
         System.out.println("NO");
        
}
}*/


        /*
                        FREQUENCY ORDER COUNTING THE NUMBERS ex: gfg
N = 5
arr[] = {2, 3, 2, 3, 5}
P = 5
Output:
0 2 2 0 1
Explanation: 
Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 2 times.
3 occurring 2 times.
4 occurring 0 times.
5 occurring 1 time.
*/
/*public class Main {  
public static void main(String[] args) { 
    int count=0,index=0;
    int a[]={2,3,2,3,5};
    int b[]=new int[a.length];
    for(int i=1;i<=a.length;i++){
        for(int j=0;j<a.length;j++){
            if(i==a[j]){
                count++;
            }
        }
        if(count>=1){
                b[index]=count;
                index++;
                count=0;
            }
            else{
                b[index]=0;
                index++;
            }
    }
    for(int j=0;j<a.length;j++){
        System.out.print(b[j]+" ");
    }
}
}*/
                    // finding the array which sum==5
     
//      public class Main {  
//   public static void main(String[] args) { 
//     int r=0,sum=0;
//     int a[]={1,2,3,4};
//     int b[]=new int[];
//     for(int i=0;i<a.length;i++){
//         b[r]=a[i];
//         r++;
//         for(int j=0;j<r;j++){
//             sum+=b[j];
//         }
//         if(sum==5){
//             for(int m=0;m<b.length;m++){
//                 System.out.println(b[m]);
//             }
//         }
        
//     }
// }
// }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                        









