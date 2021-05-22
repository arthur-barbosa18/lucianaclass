#ifndef FUNCIONARIO_H_INCLUDED
#define FUNCIONARIO_H_INCLUDED
#define MAX_DEP 3

#include "dependente.h"

typedef struct funcionario
{
    char nome[100];
    int codigo;
    float salario;
    int quantidade_dependentes;
    dependente dependentes[MAX_DEP];
} funcionario;


//funcionario criar_funcionario(char *nome, float salario, int codigo, int quantidade_dependentes, dependente *dependentes);
funcionario *inicializa_funcionarios(int quantidade_funcionarios);
funcionario atualiza_salario(funcionario func, char *frase_personalizada);
funcionario cadastrar_nome(funcionario func, char *frase_personalizada);
funcionario criar_codigo(funcionario func);

#endif // FUNCIONARIO_H_INCLUDED
