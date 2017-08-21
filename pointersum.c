#include<stdio.h>
#include<conio.h>
void main()
{
    int *ptr1,*ptr2,num;
    printf("Enter 2 values");
    scanf("%d %d",ptr1,ptr2);
    num=*ptr1+*ptr2;
    printf("the sum is %d",num);
}
