package edu.badpals.cotxox.conductores;

import java.util.ArrayList;
import java.util.List;

public class PoolConductores {
    public ArrayList<Conductor> poolConductores;

    public PoolConductores(ArrayList<Conductor> conductores){
        this.poolConductores = conductores;
    }

    public ArrayList<Conductor> getPoolConductores() {
        return poolConductores;
    }

    public Conductor asignarConductor(){
        return ;
    }
}
