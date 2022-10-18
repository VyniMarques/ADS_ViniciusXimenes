# -*- coding: utf-8 -*-
"""
Created on Mon Oct 18 11:04:56 2021

@author: edsonjcg
"""
#criar um arranjo x com valores de -3 a 3, variando de 1
from numpy import arange
x=arange(-3,4,1) #faixa de valores

#define f(x)
def f(x):
    return 2*x**3+3*x**2-0.5
#define f'(x)
def f2(x):
    return 6*x**2+6*x
#mostra os valores x, f(x) e f'(x)
print('\n x =',x)
print('\n y1 =',f(x))
print('\n y2 =', f2(x))