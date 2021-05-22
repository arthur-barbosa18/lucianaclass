#ifndef DEPENDENTE_H_INCLUDED
#define DEPENDENTE_H_INCLUDED


typedef struct dependente
{
    char nome[100];
    int codigo;
    int idade;
} dependente;


void criar_dependente(dependente dep[], int codigo, int total);
dependente cadastrar_nome_dependente(dependente dep, char *frase_personalizada);
int cadastrarQuantidade(int quantidadeSolicitada, int valorMaximoPermitido);
#endif // DEPENDENTE_H_INCLUDED
