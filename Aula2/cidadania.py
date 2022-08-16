class Pessoa:
    nome = None
    sexo = None
    idade = None

    def __init__(self, nome, sexo, idade):
        self.nome = nome
        self.sexo = sexo
        self.idade = idade

class Cidadao(Pessoa):
    cpf = None

    def __init__(self, nome, sexo, idade, cpf):
        super().__init__(nome, sexo, idade)
        self.cpf = cpf


# 
nome = input("Informe o Nome do Cidadão: ")
sexo = input("Informe o Sexo do Cidadão: ")
idade = input("Informe a Idade do Cidadão: ")
cpf = input("Informe o CPF do Cidadão: ")

#
cidadao_1 = Cidadao(nome, sexo, idade, cpf)

#
print(f"Nome: {cidadao_1.nome}\nSexo: {cidadao_1.sexo}\nIdade: {cidadao_1.idade}\nCPF: {cidadao_1.cpf}")


