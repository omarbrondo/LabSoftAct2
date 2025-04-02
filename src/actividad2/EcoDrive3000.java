package actividad2;

class EcoDrive3000 extends Motor {

    @Override
    protected double getConsumoInicio() {
        return 5.0;  // Consumo de arranque: 5 litros
    }

    @Override
    protected String getNombre() {
        return "EcoDrive3000";
    }

    @Override
    protected double getUmbralReserva() {
        return 12.0;  // 15% de 80 litros = 12 litros
    }
    
    // Al acelerar, se ingresa la cantidad adicional sin coeficiente extra.
    @Override
    public void acelerar(double litrosAdicional) {
        double consumo = litrosAdicional;
        if(combustibleRestante < consumo) {
            System.out.println("No hay suficiente combustible para acelerar en " + getNombre());
        } else {
            combustibleRestante -= consumo;
            combustibleConsumido += consumo;
            System.out.println(getNombre() + " acelerando: consumo adicional de " + consumo + " litros.");
        }
    }
    
    // Al frenar, se incrementa el consumo en 0.33 litros.
    @Override
    public void frenar() {
        double consumo = 0.33;
        if(combustibleRestante < consumo) {
            System.out.println("No hay suficiente combustible para frenar en " + getNombre());
        } else {
            combustibleRestante -= consumo;
            combustibleConsumido += consumo;
            System.out.println(getNombre() + " frenando: consumo adicional de " + consumo + " litros.");
        }
    }
}

