#include <stdio.h>
void main() {
  int c, sum = 0;
  printf("enter count: ");
  scanf("%d", &c);
  sum = .5 * c * (c + 1);
  printf("sum of numbers is:%d", sum);
}
