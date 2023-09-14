package factorias;

import partes.ArqueraMujer;
import partes.Arquero;
import partes.Atacante;
import partes.AtacanteMujer;
import partes.Defensor;
import partes.DefensorMujer;

public class EquipoFemeninoFactory extends EquipoFactory {

    @Override
    public Arquero crearArquero() {
        // TODO Auto-generated method stub
        return new ArqueraMujer();
    }

    @Override
    public Defensor crearDefensor() {
        // TODO Auto-generated method stub
        return new DefensorMujer();
    }

    @Override
    public Atacante crearAtacante() {
        // TODO Auto-generated method stub
        return new AtacanteMujer();
    }

}
