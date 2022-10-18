# Questão 5 - T.E.U
from numpy import arange

x = arange(-3, 4, 1)


def f(x):
    return x**2 + 1.95*x - 2.09


def f2(x):
    return 2*x + 1.95


print('\n x =', x)
print('\n y1 =', f(x))
print('\n y2 =', f2(x))
