#include <stdio.h>
#include <stdlib.h>
#include "dependente.h"



void criar_dependente(dependente dep[], int codigo, int total)
{

    for(int i = 0; i < total; i++)
    {
        dep[i].codigo = codigo + i + 1;
    }
}


dependente cadastrar_nome_dependente(dependente dep, char *frase_personalizada)
{
    printf("%s", frase_personalizada);
    scanf("%s", dep.nome);
    return dep;
}


int cadastrarQuantidade(int quantidadeSolicitada, int valorMaximoPermitido)
{
    if (quantidadeSolicitada <= valorMaximoPermitido)
    {
        return 1;
    }
    return 0;
}