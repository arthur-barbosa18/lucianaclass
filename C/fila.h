#ifndef FILA_H_INCLUDED
#define FILA_H_INCLUDED


typedef struct TipoItem
{
    char Mensagem[5000];

} TipoItem;

typedef struct CelulaFila *ApontadorFila;

typedef struct CelulaFila
{
    TipoItem Item;
    ApontadorFila Prox;
} TCelulaFila;

typedef struct TFila
{
    ApontadorFila Frente;
    ApontadorFila Tras;
} TFila;

void FFVazia(TFila *Fila);
int VaziaFila(TFila Fila);
void Enfileira(TipoItem x, TFila *Fila);
void Desenfileira(TFila *Fila);

#endif // FILA_H_INCLUDED
