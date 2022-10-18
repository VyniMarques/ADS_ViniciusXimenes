# Questão 5 - Bissecção

def f(x):
    return x**2 + 1.95*x - 2.09


def f2(x):
    return 2*x + 1.95


##critério de parada: |f(x)| < erro
a = float(input("Entre com valor de a: "))
b = float(input("Entre com valor de b: "))
e = float(input("Entre com valor do erro: "))
cont = 0
n = 0
print("n", "\t" * 2, "a", "\t" * 3, "b", "\t" * 4, "x", "\t" * 4, "f(x)")
while (1):
    x = (a + b) / 2
    fx = f(x)
    print(n, "\t" * 2, "%.4f" % a, "\t" * 2, "%.4f" % b, "\t" * 2, "%.4f" % x, "\t" * 2, "%.4f" % fx)
    n = n + 1
    if (abs(fx) < e):
        break
    elif f(a) * fx < 0:
        b = x
    else:
        a = x
print("\n Raiz aproximada: ", x)


