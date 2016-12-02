/************************************
+++Francisco Jesús jiménez Hidalgo+++
************************************/
#include <stdio.h>

/*Returns next number of collatz sequence*/
int nextNumber(int number){

  if (number % 2 == 0){
    number = number / 2;
  } else {
    number = 3 * number + 1;
  }
  return number;
}
