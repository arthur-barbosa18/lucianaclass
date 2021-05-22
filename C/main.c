#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include "dependente.h"
#include "funcionario.h"
#define MAX_DEP 3
#define MAX_IDADE 18

int main()
{
    char menu[1];
    float salario;
    int count = 0;
    char nome[100];
    int quantidade_dependentes = 0;
    int quantidade_funcionarios;
    int tem_dependentes;
    printf("Digite a quantidade de funcionários a serem cadastrados!\n");
    scanf("%i", &quantidade_funcionarios);
    funcionario *funcionarios = inicializa_funcionarios(quantidade_funcionarios);

    while(1)
    {
        printf("Digite a opção requerida!\n");
        printf("A - Inserir Dados funcionários\n");
        printf("B - Exibir Informações\n");
        printf("C - Finalizar\n");
        scanf("%s", menu);
        if (strcmp(menu, "A") == 0 || strcmp(menu, "a") == 0)
        {
            while(count < quantidade_funcionarios)
            {

                funcionarios[count] = cadastrar_nome(funcionarios[count], "Digite o nome do funcionario\n");


                funcionarios[count] = atualiza_salario(funcionarios[count], "Digite o salario do funcionario\n");
                printf("Salario do funcionario %f\n", funcionarios[count].salario);

                funcionarios[count] = criar_codigo(funcionarios[count]);
                printf("codigo do funcionario %i\n", funcionarios[count].codigo);


                printf("Digite agora as informações dos dependentes!\n");
                int count_dep = 0;
                while(cadastrarQuantidade(quantidade_dependentes, MAX_DEP))
                {
                    printf("Você tem mais dependentes? Se sim, digite 0, se não digite 1\n");
                    scanf("%i", &tem_dependentes);
                    if (tem_dependentes)
                    {
                        funcionarios[count].quantidade_dependentes = count_dep;
                        break;
                    }

                    funcionarios[count].dependentes[count_dep] = cadastrar_nome_dependente(
                                funcionarios[count].dependentes[count_dep],
                                "Digite o nome do dependente:\n");
                    do
                    {
                        printf("Lembre-se que dependentes não podem serem maiores de 18 anos!\n");
                        scanf("%i", &funcionarios[count].dependentes[count_dep].idade);
                    }
                    while(!cadastrarQuantidade(funcionarios[count].dependentes[count_dep].idade, MAX_IDADE));
                    count_dep++;

                }
                criar_dependente(funcionarios[count].dependentes, funcionarios[count].codigo, count_dep);

                printf("\n");
                for(int j = 0; j < count_dep; j++)
                {
                    printf("nome = %s\n", funcionarios[count].dependentes[j].nome);
                    printf("idade = %i\n", funcionarios[count].dependentes[j].idade);
                    printf("codigo = %i\n", funcionarios[count].dependentes[j].codigo);
                }
                count++;
            }
        }
        if (strcmp(menu, "B") == 0 || strcmp(menu, "b") == 0)
        {
            for(int h = 0; h < quantidade_funcionarios; h++)
            {
                printf("Funcionário %s\n", funcionarios[h].nome);
                printf("codigo %i\n", funcionarios[h].codigo);
                printf("salario %f\n", funcionarios[h].salario);
                printf("DEPENDENTES: \n");
                for(int k = 0; k < funcionarios[h].quantidade_dependentes; k++)
                {
                    printf("nome = %s\n", funcionarios[h].dependentes[k].nome);
                    printf("idade = %i\n", funcionarios[h].dependentes[k].idade);
                    printf("codigo = %i\n", funcionarios[h].dependentes[k].codigo);
                }
            }
        }
        if (strcmp(menu, "C") == 0 || strcmp(menu, "c") == 0)
        {
            break;
        }

    }

    return 0;
}