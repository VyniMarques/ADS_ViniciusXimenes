# Questão 6 - Newton-Raphson


def f(x):
    return x**2 + 1.95*x - 2.09


def f2(x):
    return 2*x + 1.95


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