package actividad2;

class TurboPower5000 extends Motor {

    @Override
    protected double getConsumoInicio() {
        return 1.0;  // Consumo de arranque: 1 litro
    }

    @Override
    protected String getNombre() {
        return "TurboPower5000";
    }

    @Override
    protected double getUmbralReserva() {
        return 8.0;  // 10% de 80 litros = 8 litros
    }
    
    // Al acelerar, se ingresa una cantidad adicional más un coeficiente de 0.12 L.
    @Override
    public void acelerar(double litrosAdicional) {
        double consumo = litrosAdicional + 0.12;
        if(combustibleRestante < consumo) {
            System.out.println("No hay suficiente combustible para acelerar en " + getNombre());
        } else {
            combustibleRestante -= consumo;
            combustibleConsumido += consumo;
            System.out.println(getNombre() + " acelerando: consumo adicional de " + consumo + " litros.");
        }
    }
    
    // Al frenar, se aumenta el consumo en 0.22 litros.
    @Override
    public void frenar() {
        double consumo = 0.22;
        if(combustibleRestante < consumo) {
            System.out.println("No hay suficiente combustible para frenar en " + getNombre());
        } else {
            combustibleRestante -= consumo;
            combustibleConsumido += consumo;
            System.out.println(getNombre() + " frenando: consumo adicional de " + consumo + " litros.");
        }
    }
}
