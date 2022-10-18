# -*- coding: utf-8 -*-
"""
Created on Thu Mar 17 09:23:48 2022

@author: edsonjcg
"""
#print("\n"*100)
def f(x):
    return 2*x**3+3*x**2-0.5
##critério de parada: |f(x)| < erro
a = float(input("Entre com valor de a: "))
b = float(input("Entre com valor de b: "))
e = float(input("Entre com valor do erro: "))
cont=0
print("a","\t"*3,"b","\t"*4,"x","\t"*4,"f(x)")
while(1):
    x = (a+b)/2
    fx = f(x)
    print("%.4f"%a,"\t"*2, "%.4f"%b,"\t"*2, "%.4f"%x,"\t"*2, "%.4f"%fx)
 
    if(abs(fx) < e):
        break
    elif f(a)*fx<0:
        b = x
    else:
        a = x
print("\n Raiz aproximada: ", x)


