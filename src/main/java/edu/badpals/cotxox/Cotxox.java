package edu.badpals.cotxox;

public class Cotxox {

    public static void main(String[] args) {

        /*
         * Configuracion del usuario
         * y de la Carrera.
         */

        String tarjetaCredito = "4916119711304546";
        String origen = "Aeroport Son Sant Joan";
        String destino = "Magaluf";
        double distancia = 7.75;
        int tiempoEsperadoMinutos = 10;

        Carrera carrera = new Carrera(tarjetaCredito);
        carrera.setOrigen(origen);
        carrera.setDestino(destino);
        carrera.setDistancia(distancia);
        carrera.setTiempoEsperado(tiempoEsperadoMinutos);

        System.out.println("\n#####" + "\t Set Pickup: \t" + "#####\n");

        System.out.println("Visa: " + carrera.getTarjetaCredito());
        System.out.println("From: " + carrera.getOrigen());
        System.out.println("To: " + carrera.getDestino());
        System.out.println("Distance: " + carrera.getDistancia());

        System.out.println("\n#####" + "\t See your Cost: \t" + "#####\n");

        System.out.println("Visa: " + carrera.getTarjetaCredito());
        System.out.println("From: " + carrera.getOrigen());
        System.out.println("To: " + carrera.getDestino());
        System.out.println("Distance: " + carrera.getDistancia());
        System.out.println("Total: " + carrera.getCosteEsperado() + "€");

        System.out.println("\n#####" + "\t Get a ride: Driver: \t" + "#####\n");

        /**
         * Necesitamos crear la flota de conductores de donde seleccionar uno
         * para ofrecer el servicio.
         * La flota es un objeto de tipo PoolConductores.
         */

        List<Conductor> poolConductores = new ArrayList<Conductor>();
        Conductor conductor = null;

        // creamos objetos conductor y los metemos en el array

        String[] nombres = { "Samantha", "Fox", "Mola" };
        for (String nombre : nombres) {
            conductor = new Conductor(nombre);
            poolConductores.add(conductor);
        }

        String[] matricula = { "4ABC123", "5DHJ444", "7JKK555" };
        String[] modelos = { "Chevy Malibu", "Toyota Prius", "Mercedes A" };

        int index = 0;
        for (Conductor conductora : poolConductores) {
            conductora.setMatricula(matricula[index]);
            conductora.setModelo(modelos[index]);
            // suponemos que las conductoras tienen una valoracion inicial de 4 stars
            conductora.setValoracion((byte) 4);
            index++;
        }

        // Creamos el objeto flota de conductores, de la clase PoolConductores.

        PoolConductores conductores = new PoolConductores(poolConductores);

        /* Seleccion del conductor en la flota y asignacion a la carrera */

        carrera.asignarConductor(conductores);

        // Info por pantalla

        System.out.println("Driver: " + carrera.getConductor().getNombre());
        System.out.println("Type: " + carrera.getConductor().getModelo());
        System.out.println("Matricula: " + carrera.getConductor().getMatricula());
        System.out.println("Stars: " + carrera.getConductor().getValoracion());
        System.out.println("From: " + carrera.getOrigen());
        System.out.println("To: " + carrera.getDestino());
        boolean ocupado = carrera.getConductor().isOcupado();
        if (ocupado) {
            System.out.println("Disponible para ti");
        } else {
            System.out.println("Esta conductora no esta disponible :/");
        }
        // cancel ride
        // contact by phone

        System.out.println("\n#####" + "\t Pay and Tip: \t" + "#####\n");

        carrera.realizarPago(carrera.getCosteEsperado());
        carrera.recibirPropina(1);
        carrera.liberarConductor();

        System.out.println("Driver: " + carrera.getConductor().getNombre());
        System.out.println("TIP: " + carrera.getPropina());
        System.out.println("Visa: " + carrera.getTarjetaCredito());
        System.out.println("Total: " + carrera.getCosteTotal());
        System.out.println("Ocupado?: " + carrera.getConductor().isOcupado());

        System.out.println("\n#####" + "\t Rate your driver: \t" + "#####\n");

        carrera.getConductor().setValoracion((byte) 5);

        System.out.println("Driver: " + carrera.getConductor().getNombre());
        System.out.println("Stars: " + carrera.getConductor().getValoracion());
    }
}