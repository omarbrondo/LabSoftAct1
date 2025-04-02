package actividad1;

class SB100 extends MaquinaExpendedora {

    @Override
    public void prepararBebida(String tipo) {
        if (capacidadAgua < 150) {
            System.out.println("No hay suficiente agua para preparar la bebida.");
            return;
        }

        switch (tipo.toLowerCase()) {
            case "fruta":
                System.out.println("Preparando bebida de frutas...");
                break;
            case "proteina":
                System.out.println("Preparando bebida proteica...");
                break;
            default:
                System.out.println("Tipo de bebida no reconocido en SB100.");
                return;
        }

        capacidadAgua -= 150; // Consumir agua
        aguaConsumida += 150;
        System.out.println("Bebida preparada. Se consumieron 150 ml de agua.");
    }
}
