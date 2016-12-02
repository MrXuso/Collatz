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
  printf("Introduce el primer número de la sucesión de Collatz a mostrar: ");
  scanf("%d", &firstNumber);

  //Mostramos la serie
  printf("La serie de Collatz de %d es: ", firstNumber);

  int number = firstNumber;
  while (number > 1){
    number = nextNumber(number);
    printf("%d ", number);
  }
  return 0;
}
