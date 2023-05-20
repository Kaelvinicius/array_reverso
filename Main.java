public class Main {
    public static void main(String[] args) {
        int v[] = {1, 2, 3, 4, 5};

        System.out.println("Ordem correta ");
        for (int i =0; i <v.length; i++){
            System.out.print(v[i] + " ");
        }

        System.out.println("\n");
        inverter(v);

        System.out.println("Ordem inversa ");
        mostrar(v);
    }

    public static void mostrar(int v[]) {
        for (int x : v){
            System.out.print(x + " ");
        }
    }

    public static void inverter(int v[]) {
        int i, f;
        i = 0;
        f = v.length - 1;

        while (i < f) {
            trocar(v, i, f);
            i++;
            f--;
        }
    }

    private static void trocar(int[] v, int i, int f) {
        int aux = v[i];
        v[i] = v[f];
        v[f] = aux;
    }
}
