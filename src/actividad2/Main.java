package actividad2;

public class Main {
 public static void main(String[] args) {
     // Crear y probar el motor TurboPower5000
     Motor motor1 = new TurboPower5000();
     motor1.iniciarMotor(); // Arranca consumiendo 1 litro
     motor1.acelerar(2.0); // Supongamos que se ingresa 2 litros adicionales al acelerar
     motor1.frenar();      // Se consume 0.22 litros al frenar
     motor1.verificarNivelCombustible();
     motor1.imprimirReporte();
     
     System.out.println("------------------------------");
     
     // Crear y probar el motor EcoDrive3000
     Motor motor2 = new EcoDrive3000();
     motor2.iniciarMotor();  // Arranca consumiendo 5 litros
     motor2.acelerar(3.0);   // Supongamos que se ingresa 3 litros adicionales al acelerar
     motor2.frenar();        // Se consume 0.33 litros al frenar
     motor2.verificarNivelCombustible();
     motor2.imprimirReporte();
 }
}

