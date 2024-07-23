package automovil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploAutomovilArrego {
    public static void main(String[] args){
        Persona conductorSubaru = new Persona("Luis","Martinez");
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaru.setEstanque(new TanqueGasolina());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);

        Persona pato = new Persona("Pato","Rodriguez");
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO, new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new TanqueGasolina());
        mazda.setConductor(pato);

        Persona bea = new Persona("Bea","Gonzales");
        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(4.0,TipoMotor.DIESEL),new TanqueGasolina(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Persona lalo = new Persona("Lalo","Mena");
        Automovil suzuki = new Automovil("Suzuki","Vistara",Color.GRIS,
                new Motor(1.6,TipoMotor.BENCINA),new TanqueGasolina(50));
        suzuki.setConductor(lalo);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.BLANCO);

        Automovil audi = new Automovil("Audi","A3");
        audi.setConductor(new Persona("Jano","Perez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);
        for (Automovil item: autos){
            System.out.println(item);
        }
    }
}
