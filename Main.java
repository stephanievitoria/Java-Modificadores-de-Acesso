public class Main {
    public static void main(String[] args){
                Matriz matriz = new Matriz(4);
        
        System.out.println("01- " + matriz.removeValor(2, 3, 0));
        System.out.println("02- " + matriz.setaValor(0, 0, 1));
        System.out.println("03- " + matriz.setaValor(0, 1, 2));
        System.out.println("04- " + matriz.setaValor(0, 2, 3));
        System.out.println("05- " + matriz.setaValor(0, 3, 4));
        System.out.println("06- " + matriz.setaValor(1, 0, 5));
        System.out.println("07- " + matriz.setaValor(1, 1, 6));
        System.out.println("08- " + matriz.setaValor(1, 2, 7));
        System.out.println("09- " + matriz.setaValor(1, 3, 8));
        System.out.println("10- " + matriz.setaValor(2, 0, 9));
        System.out.println("11- " + matriz.setaValor(2, 1, 10));
        System.out.println("12- " + matriz.setaValor(2, 2, 11));
        System.out.println("13- " + matriz.setaValor(2, 3, 12));
        System.out.println("14- " + matriz.setaValor(3, 0, 13));
        System.out.println("15- " + matriz.setaValor(3, 1, 14));
        System.out.println("16- " + matriz.setaValor(3, 2, 15));
        System.out.println("17- " + matriz.setaValor(3, 3, 16));

        matriz.imprimeInfo();

        System.out.println("18- " + matriz.removeValor(2, 2, 0));
        System.out.println("19- " + matriz.removeValor(1, 3, 0));

        matriz.imprimeInfo();
        }
    }