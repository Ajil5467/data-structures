#include<stdio.h>
#include<stdlib.h>
#include<math.h>
void main() {
    int n,i,j,k,p,a[20],mpp=0;
    printf("enter count:");
    scanf("%d",&n);
    printf("enter numbers:\n");
    for(i=0; i<n; i++) {
        scanf("%d",&a[i]);
    }

    if(n<2) {
        printf("there is no such pairs");
    }
    else {
        for(j=0; j<n; j++) {
            for(k=j+1; k<n; j++) {
                p=a[j]*a[k];
                if(p>mpp)
                {
                    mpp=p;
                }
            }
        }
    }
    printf("maximum pairwise product is: %d",mpp);
}
