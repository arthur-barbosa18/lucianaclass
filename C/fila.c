#include <stdio.h>
#include <stdlib.h>
#include "fila.h"

void FFVazia(TFila *Fila)
{
    Fila->Frente = malloc(sizeof(TCelulaFila));
    Fila->Tras = Fila->Frente;
    Fila->Frente->Prox = NULL;
}

int VaziaFila(TFila Fila)
{
    return (Fila.Frente == Fila.Tras);
}

void Enfileira(TipoItem x, TFila *Fila)
{
    Fila->Tras->Prox = malloc(sizeof(TCelulaFila));
    Fila->Tras = Fila->Tras->Prox;
    Fila->Tras->Item = x;
    Fila->Tras->Prox = NULL;
}

void Desenfileira(TFila *Fila)
{
    if (VaziaFila(*Fila))
    {

        return;
    }
    ApontadorFila q = Fila->Frente;
    Fila->Frente = Fila->Frente->Prox;
    free(q);
}
