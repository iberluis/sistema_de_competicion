
package Registro;

/**
 *
 * @author IBER LUIS
 */
public class Registros_Recorridos {
    private String codigoStr;
    private int recorridoInt;

    public Registros_Recorridos(String codigoStr, int recorridoInt) {
        this.codigoStr = codigoStr;
        this.recorridoInt = recorridoInt;
    }

    public String getCodigoStr() {
        return codigoStr;
    }

    public void setCodigoStr(String codigoStr) {
        this.codigoStr = codigoStr;
    }

    public int getRecorridoInt() {
        return recorridoInt;
    }

    public void setRecorridoInt(int recorridoInt) {
        this.recorridoInt = recorridoInt;
    }
}
