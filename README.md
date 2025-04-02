# Enunciado 2: Sistema de Gestión de Motores de Combustión "TurboMotor" 
Una fábrica desarrolla dos tipos de motores de combustión interna: TurboPower 5000 y EcoDrive 3000.  
Se requiere diseñar un sistema orientado a objetos en Java que gestione estos motores, mediante una clase 
abstracta Motor y dos clases derivadas, TurboPower5000 y EcoDrive3000. 
Aspectos Comunes para Ambos Motores 
### Depósito de Combustible: 
Ambos motores poseen un depósito central de 80 litros, cuyo nivel se monitorea en tiempo real. El sistema de 
diagnóstico debe emitir una alerta cuando el tanque se encuentre en su estado de reserva o el tanque este vacío. 
### Métodos Comunes: 
La clase abstracta Motor incluirá atributos y métodos comunes, como: 
1) Atributo que indique la capacidad del depósito (tanque). 
2) Un método para iniciar el motor (por ejemplo, iniciarMotor()), que muestre el estado del depósito. 
3) Métodos abstractos para acelerar, frenar y mostrar resultados del consumo de combustible según sus 
características. 
4) También cuentan con la posibilidad que el operador pueda obtener un reporte en el cual se 
imprima el nombre de cada motor y el consumo de combustible en cualquier momento. 
TurboPower 5000 
### Características: 
Diseñado para alto rendimiento, opera a un ralentí mínimo de 1000 RPM y consume 1 litro al iniciar el motor. 
### Componentes y Sensores: 
Incorpora un sistema de inyección de combustible de alta precisión y un turbocompresor. 
Sus sensores inteligentes permiten ajustar el desempeño. Al acelerar se ingresa una cantidad de litros adicional que 
incrementa el consumo más un coeficiente de resistencia del 0.12L, y al frenar se incrementa el consumo en un 
coeficiente de parada de 0.22 litros. 
### Umbral de Reserva: 
Se emite una advertencia si el depósito residual es menor o igual a %10 litros de la capacidad del tanque. 
EcoDrive 3000 
### Características: 
Enfocado en la eficiencia y la reducción de emisiones, operando con un ralentí de 1000 RPM consume 5 litros de 
combustible en condiciones normales al iniciar el motor. 
### Componentes y Sensores: 
Cuenta con un sistema de inyección optimizado para el ahorro energético y un sistema de recirculación de gases. 
Sus sensores inteligentes permiten ajustar el desempeño. Al acelerar se ingresa una cantidad de litros adicional que 
incrementa el consumo, y al frenar se incrementa el consumo en un coeficiente de parada de 0.33 litros. 
### Umbral de Reserva: 
Se emite una advertencia si el depósito residual es menor o igual a %15 litros de la capacidad del tanque.
