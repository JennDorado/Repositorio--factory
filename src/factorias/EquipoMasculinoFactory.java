package factorias;

import partes.Arquero;
import partes.ArqueroHombre;
import partes.Atacante;
import partes.AtacanteHombre;
import partes.Defensor;
import partes.DefensorHombre;

public class EquipoMasculinoFactory extends EquipoFactory {

    @Override
    public Arquero crearArquero() {
        // TODO Auto-generated method stub
        return new ArqueroHombre();
    }

    @Override
    public Defensor crearDefensor() {
        // TODO Auto-generated method stub
        return new DefensorHombre() {

        };
    }

    @Override
    public Atacante crearAtacante() {
        // TODO Auto-generated method stub
        return new AtacanteHombre();
    }

}
