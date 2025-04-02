package actividad2;

abstract class Motor {
 // Capacidad fija del tanque, ponemos 80 como base
 protected final double CAPACIDAD_TANQUE = 80.0;

 protected double combustibleRestante;
 // Combustible consumido acumulado
 protected double combustibleConsumido;
 
 // este constructor le da la capacidad del tanque que le pusimos mas arriba
 public Motor() {
     this.combustibleRestante = CAPACIDAD_TANQUE;
     this.combustibleConsumido = 0;
 }
 
 // Iniciar el motor con los consumos que corresponden
 public void iniciarMotor() {
     double consumo = getConsumoInicio(); //lo saca del motor correspondiente ecodrive o turbopower
     if(combustibleRestante < consumo) {
         System.out.println("No hay suficiente combustible para iniciar " + getNombre());
     } else {
         combustibleRestante -= consumo;
         combustibleConsumido += consumo;
         System.out.println(getNombre() + " iniciado a 1000 RPM. Consumo inicial: " + consumo + " litros.");
         System.out.println("Combustible restante: " + combustibleRestante + " litros.");
     }
 }
 
 // Método para verificar el nivel del combustible y emitir alerta en caso de reserva
 public void verificarNivelCombustible() {
     if(combustibleRestante <= getUmbralReserva()) {
         System.out.println("ALERTA: " + getNombre() + " requiere reabastecimiento. Nivel de combustible bajo: " + combustibleRestante + " litros.");
     } else {
         System.out.println("Nivel de combustible en " + getNombre() + " es adecuado: " + combustibleRestante + " litros.");
     }
 }
 
 // Permite obtener un reporte con el nombre del motor y el consumo acumulado
 public void imprimirReporte() {
     System.out.println("Reporte de: " + getNombre());
     System.out.println("Combustible consumido: " + combustibleConsumido + " litros.");
     System.out.println("Combustible restante: " + combustibleRestante + " litros.");
 }
 
 // Métodos abstractos que deben implementar las subclases que salen de cada motro
 protected abstract double getConsumoInicio();  // Consumo al iniciar el motor
 protected abstract String getNombre();         // Devuelve el nombre del motor
 protected abstract double getUmbralReserva();    // activar alerta de reserva
 public abstract void acelerar(double litrosAdicional);  // acelerar (con consumo adicional variable)
 public abstract void frenar();                           // frenar (con incremento de consumo fijo)
}
