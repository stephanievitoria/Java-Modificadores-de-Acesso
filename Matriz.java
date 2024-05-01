public class Matriz {
    private int quantNumerosPreenchidos;
    private int numLinhas;
    private int [][] matriz;

    public Matriz(int dimensão){
        this.quantNumerosPreenchidos = 0; 
        this.numLinhas = dimensão;
        this.matriz = new int [dimensão][dimensão];
    }

    private boolean existeNaLinha(int x, int v){
        for(int i = 0; i < matriz.length; i++){
            if (matriz[x][i] == v){
                return true;
            }
        }
        return false;
    }
 
    private boolean existeNaColuna(int w, int v){
        for (int ii = 0; ii < matriz.length; ii++){
            if (matriz[w][ii] == v){
                return true;
            }
        }
        return false;
    }

    public boolean setaValor(int i, int j, int v) {
        if (i < 0 || i >= numLinhas || j < 0 || j >= numLinhas) {
            return false; 
        }
        if (existeNaLinha(i, v) || existeNaColuna(j, v) || matriz[i][j] != 0) {
            return false; 
        }
        matriz[i][j] = v;
        quantNumerosPreenchidos++;
        return true;
    }

    public boolean removeValor(int i, int j, int v){
        if (i < 0 || i >= numLinhas || j < 0 || j >= numLinhas){
            return false;
        }
        if (matriz[i][j] != v || matriz[i][j] == 0){
            return false;
        }
        matriz [i][j] = 0;
        quantNumerosPreenchidos--;
        return true;
    }

    public void getNumPreenchidos(){
        System.out.println(quantNumerosPreenchidos);
    }

    public void getDim(){
        System.out.println(numLinhas);
    }

    public void imprimeInfo(){
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numLinhas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Quantidade de números preenchidos: " + quantNumerosPreenchidos);
    }
}
