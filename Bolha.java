public class Bolha {
    public void bubbleSort(int[] dados){
        boolean continuar = true;
        int troca = 0;

        // BubbleSort
        while (continuar){
            continuar = false;

            for(int i = 0; i < dados.length - 1; i++){
                if (dados[i] > dados[i+1]){
                    troca = dados[i+1];
                    dados[i+1] = dados[i];
                    dados[i] = troca;
                    continuar = true;
                }

            }

        };

        // Imprime os 15 primeiros valores
        System.out.print("Dados (bubbleSort): ");
        int limite = Math.min(dados.length, 15);
        for (int i = 0; i < limite; i++) {
            System.out.print(dados[i] + " ");
        }
        System.out.println("...");
    }
}
