package actividad1;

//Clase base
 abstract class MaquinaExpendedora {
 protected int capacidadAgua = 1000; // Depósito inicial de 1000 ml
 protected int aguaConsumida = 0;

 // verificar el nivel de agua
 public void verificarNivelAgua() {
     if (capacidadAgua <= 200) { // para disparar alerta
         System.out.println("ALERTA: El nivel de agua es bajo. Reabastezca el depósito.");
     } else {
         System.out.println("El nivel de agua es suficiente.");
     }
 }

 // Reporte
 public void imprimirReporte(String nombreMaquina) {
     System.out.println("Reporte de la máquina: " + nombreMaquina);
     System.out.println("Agua consumida: " + aguaConsumida + " ml.");
     System.out.println("Agua restante: " + capacidadAgua + " ml.");
 }

 // Preparar bebidas
 public abstract void prepararBebida(String tipo);
}

