package actividad1;

public class Main {
    public static void main(String[] args) {
        // SB100
        MaquinaExpendedora maquinaSB100 = new SB100();
        maquinaSB100.prepararBebida("proteina");// proteina, fruta
        maquinaSB100.imprimirReporte("SB100");
        maquinaSB100.verificarNivelAgua();

        System.out.println("-------------------");

        // SB200
        MaquinaExpendedora maquinaSB200 = new SB200();
        maquinaSB200.prepararBebida("vegetales"); //solo vegetales
        maquinaSB200.imprimirReporte("SB200");
        maquinaSB200.verificarNivelAgua();
    }
}
