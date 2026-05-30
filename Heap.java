public class Heap {

    public int FilhoMaior(int pai, int[] dados, int tamanho) {
        int filhoEsq = (pai * 2) + 1;
        int filhoDir = (pai * 2) + 2;
        int maior = pai;

        if (filhoEsq < tamanho && dados[filhoEsq] > dados[maior]) {
            maior = filhoEsq;
        }
        if (filhoDir < tamanho && dados[filhoDir] > dados[maior]) {
            maior = filhoDir;
        }
        return maior;
    }

    public void HeapSort(int[] dados) {
        int tamanho = dados.length;

        // Constrói o heap
        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            Heapify(dados, tamanho, i);
        }

        // Extrai elementos do heap
        for (int i = tamanho - 1; i > 0; i--) {
            // Troca raiz com último
            int temp = dados[0];
            dados[0] = dados[i];
            dados[i] = temp;

            Heapify(dados, i, 0);
        }

        // Imprime os 15 primeiros valores
        System.out.print("Dados (heapSort): ");
        int limite = Math.min(dados.length, 15);
        for (int i = 0; i < limite; i++) {
            System.out.print(dados[i] + " ");
        }
        System.out.println("...");
    }

    private void Heapify(int[] dados, int tamanho, int pai) {
        int maior = FilhoMaior(pai, dados, tamanho);

        if (maior != pai) {
            // Troca
            int temp = dados[pai];
            dados[pai] = dados[maior];
            dados[maior] = temp;

            Heapify(dados, tamanho, maior);
        }
    }
}
