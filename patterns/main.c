/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    
    int i, harqDataTemp[8],result = 0;
    int ackStore = 224;
    int nAckPerCarrier = 2;
    int harqData[2][0];
     for(int j = 0; j < 2; j++)
     {
        for(int k = 0; k < nAckPerCarrier; k++)
		{					
        harqDataTemp[k] = (ackStore >> (7-k)-(nAckPerCarrier)*(j) & 1;
	    harqData[j][0]= harqData[j][0] | (harqDataTemp[k] << k);
        printf("\n harqDataTemp %d  ",harqData[j][0]);
        }
     }
  
    
    

    return 0;
}
