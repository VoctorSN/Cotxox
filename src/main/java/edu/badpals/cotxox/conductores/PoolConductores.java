package edu.badpals.cotxox.conductores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PoolConductores {
    public List<Conductor> poolConductores;

    public PoolConductores(List<Conductor> conductores){
        this.poolConductores = conductores;
    }

    public List<Conductor> getPoolConductores() {
        return poolConductores;
    }

    public Conductor asignarConductor(){
        while (true) {
            Random random = new Random();
            Conductor conductor = getPoolConductores().get(random.nextInt(getPoolConductores().size()));
            if (conductor.isOcupado())
                return getPoolConductores().get(random.nextInt(getPoolConductores().size()));
        }
    }
}
