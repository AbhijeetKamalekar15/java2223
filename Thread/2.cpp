#include <bits/stdc++.h>
using namespace std;
#define NA -1

void sortedArray(int a[],int b[],int n,int m)
{
    int i=n-1;
    int j=m-1;
    int last_Index=n+m-1;
    while(j>=0)
    {
        if(i>=0&&a[i]>b[j])
        {
            a[last_Index]=a[i];
            i--;
        }
        else
        {
            a[last_Index]=b[j];
            j--;
        }
        last_Index--;
    }
}
void printArray(int *arr,int n)
{
    printf("Final Array:\n");
    for(int i=0;i<n;i++)
        cout<<arr[i]<<" ";
}
int main() 
{
    int a[]={20,22,23,24,28,NA,NA,NA,NA,NA};
    int n=5, size_a=10;
    int b[]={26,27,29,30,32};
    int m=5;
    sortedArray(a,b,n,m);
    printArray(a,size_a);
    return 0;
}