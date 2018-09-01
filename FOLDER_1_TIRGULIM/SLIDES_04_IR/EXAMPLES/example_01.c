#include <stdio.h>
int foo(int x,int y,int z)
{
    return x+y+z;
}
int main(int argc, char **argv)
{
    printf("%d\n",foo(1,2,3));
    return 0;
}
