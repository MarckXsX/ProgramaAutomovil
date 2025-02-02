package automovil;

import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Motor motorSubaru = new Motor(2.0,TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(new TanqueGasolina());
        subaru.setColor(Color.BLANCO);
        //Prueba de ingreso de llantas
        subaru.addRueda(new Rueda("Toyota",16,50))
                .addRueda(new Rueda("Toyota",16,50))
                .addRueda(new Rueda("Toyota",16,50))
                .addRueda(new Rueda("Toyota",16,50))
                .addRueda(new Rueda("Toyota",16,50));


        Motor motorMazda = new Motor(3.0,TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,motorMazda);
        mazda.setEstanque(new TanqueGasolina(45));
        System.out.println("mazda.fabricante: "+ mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(4.0,TipoMotor.DIESEL),new TanqueGasolina(50));

        Automovil nissan2 = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(3.5,TipoMotor.BENCINA),new TanqueGasolina(50));

        Automovil auto = new Automovil();
        Date fecha = new Date();
        System.out.println("Son iguales?: " + (nissan == nissan2));
        System.out.println("Son iguales con equals?:  " + nissan.equals(nissan2));
        System.out.println("subaru = " + subaru.verDetalle());
        System.out.println("mazda = " + mazda.verDetalle());
        System.out.println("nissan = " + nissan.verDetalle());

        System.out.println(auto.equals(fecha));
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("Kilómetros por litro: " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Kilómetros por litro: " + subaru.calcularConsumo(300, 60));
        System.out.println("Kilómetros por litro: " + nissan.calcularConsumo(300, 60));
    }
}
