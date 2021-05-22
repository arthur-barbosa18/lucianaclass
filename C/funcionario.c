#include <stdio.h>
#include <stdlib.h>
#include "dependente.h"
#include "funcionario.h"
#include <string.h>


funcionario criar_codigo(funcionario func)
{
    func.codigo = rand()%500;
    return func;
}

funcionario *inicializa_funcionarios(int quantidade_funcionarios)
{
    funcionario *funcionarios;
    funcionarios = (funcionario *) malloc(quantidade_funcionarios * sizeof(funcionario));
    return funcionarios;
}


funcionario atualiza_salario(funcionario func, char *frase_personalizada){
    printf("%s", frase_personalizada);
    scanf("%f", &func.salario);
    return func;
}

funcionario cadastrar_nome(funcionario func, char *frase_personalizada){
    printf("%s", frase_personalizada);
    scanf("%s", func.nome);
    //fgets(func.nome, sizeof(func.nome), stdin);
    //scanf("%[\n]s", func.nome);
    //printf("\n");
    //memcpy(func.nome, nome, strlen(nome) + 1);
    return func;
}

