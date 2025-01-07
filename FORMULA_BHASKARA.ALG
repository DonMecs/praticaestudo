Algoritmo "Formula_Bhaskara"

Var
a, b, c, delta, x1, x2 : real
Inicio

EscrevaL("Informe os valores de A, B e C")
leia(a)
leia(b)
leia(c)

delta <- Exp(b, 2.0) -4 * a * c
x1 <- (-b + RaizQ(delta)) / (2.0 * a)
x2 <- (-b - RaizQ(delta)) / (2.0 * a)

EscrevaL("======*======")
EscrevaL("A =", a," B =", b," c =", c)
EscrevaL("Delta = ", delta)
EscrevaL("X1 = ", x1)
EscrevaL("X2 = ", x2)
Fimalgoritmo