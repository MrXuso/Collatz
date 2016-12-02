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

int main(void){
  int firstNumber = 0;
  printf("\nIntroduce el primer número de la sucesión de Collatz a mostrar: ");
  scanf("%d", &firstNumber);

  //Mostramos la serie
  printf("\nLa serie de Collatz de %d es: ", firstNumber);

  int number = firstNumber;
  while (number > 1){
    number = nextNumber(number);
    printf("%d ", number);
  }
  printf("\n\n");
  return 0;
}
