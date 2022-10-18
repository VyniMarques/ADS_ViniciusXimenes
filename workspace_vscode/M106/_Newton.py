# -*- coding: utf-8 -*-
"""
Created on Thu Mar 17 09:23:48 2022

@author: edsonjcg
"""
#print("\n"*100)
def f(x):
    return 2*x**3+3*x**2-0.5
#define f'(x)
def f2(x):
    return 6*x**2+6*x
# critério de parada: |f(x)| < erro
x = float(input("Entre com aproximação inicial: "))
e = float(input("Entre com valor do erro: "))
print("x","\t"*3,"f(x)","\t"*2,"f'(x)")
while(1):
    print("%.4f"%x,"\t"*2, "%.4f"%f(x),"\t", "%.4f"%f2(x))
    if(abs(f(x)) < e):
        break
    else:
        x = x - f(x) / f2(x)

print("\n Raiz aproximada: ", x)


