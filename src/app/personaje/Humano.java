package app.personaje;

import app.ILlevaReliquia;
import app.reliquia.Reliquia;

public class Humano extends Personaje implements ILlevaReliquia {

    public Humano(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);
        // TODO Auto-generated constructor stub
    }

    public Reliquia reliquia;// Reliquia que porta el humano

    @Override
    public Reliquia getReliquia() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setReliquia(Reliquia reliquia) {
        // TODO Auto-generated method stub

    }
}