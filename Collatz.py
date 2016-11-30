"""***********************************+++
+++FRANCISCO JESÚS JIMÉNEZ HIDALGO    +++
+++Conjetura de Collatz               +++
+++***********************************"""


def nextNumber(number):
    """ int -> int
    +++ OBJ: Return a Collatz number from the one given
    +++ PRE: Number is a Natural Number"""

    if number % 2 == 0:
        number //= 2
    else:
        number = 3 * number + 1

    return number

'''Comprobamos que el usuario ha introducido un número y no una letra'''
try:
    number = int(input('Introduzca un número natural: '))
except ValueError:
    print('No has introducido un número')
collatz = [number]

'''Iteramos el programa hasta que lleguemos a uno'''
i = 0
while collatz[i] > 1:
    collatz.append(nextNumber(collatz[i]))
    i += 1

'''Resultados'''
print('La sucesión de Collatz para ' + str(number) + ' es: ' + str(collatz))
print('Tiene ' + str(len(collatz)) + ' términos')