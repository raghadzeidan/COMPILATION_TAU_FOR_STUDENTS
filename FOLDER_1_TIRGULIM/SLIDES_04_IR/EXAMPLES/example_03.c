#include <stdio.h>
int foo(int n)
{
    int sum=17;
    for (int i=0;i<n;i++)
    {
        sum=sum+i+46;
    }
    return sum;
}
int main(int argc, char **argv) {
    return printf("%d\n",foo(argc));
}
