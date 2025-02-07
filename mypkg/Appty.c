#include<stdio.h>
void main()
{
    int a[10],min;
    int i=0,j=0;
    while(i<10)
    {
        scanf("%d",&a[i]);
        i++;
    }
    while(j<10)
    {
        if(a[i]>100&&a[i]<a[i++])
            min=a[i];
    }
    printf("%d",min);
    return;


}