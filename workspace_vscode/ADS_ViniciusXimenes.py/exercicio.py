from math import pow

val = float(input("Entre com um número: "))
res = pow(val, 3)

if res > 100:
    print(f'{res} é maior que 100')
else:
    print(f'{res} é menor que 100')
