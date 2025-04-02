package actividad1;

class SB200 extends MaquinaExpendedora {

    @Override
    public void prepararBebida(String tipo) {
        if (capacidadAgua < 180) {
            System.out.println("No hay suficiente agua para preparar la bebida.");
            return;
        }

        if (tipo.equalsIgnoreCase("vegetales")) {
            System.out.println("Preparando bebida de vegetales...");
        } else {
            System.out.println("Tipo de bebida no reconocido en SB200.");
            return;
        }

        capacidadAgua -= 180; // Consumir agua
        aguaConsumida += 180;
        System.out.println("Bebida preparada. Se consumieron 180 ml de agua.");
    }
}

