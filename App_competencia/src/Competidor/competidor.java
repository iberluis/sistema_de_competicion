package Competidor;

/**
 *
 * @author IBER LUIS
 */
public class competidor {
    private String codigoStr;
    private String nombreStr;
    private String paisStr;
    private String numeroStr;

    public competidor(String codigoStr, String nombreStr, String paisStr, String numeroStr) {
        this.codigoStr = codigoStr;
        this.nombreStr = nombreStr;
        this.paisStr = paisStr;
        this.numeroStr = numeroStr;
    }

    public String getCodigoStr() {
        return codigoStr;
    }

    public void setCodigoStr(String codigoStr) {
        this.codigoStr = codigoStr;
    }

    public String getNombreStr() {
        return nombreStr;
    }

    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }

    public String getPaisStr() {
        return paisStr;
    }

    public void setPaisStr(String paisStr) {
        this.paisStr = paisStr;
    }

    public String getNumeroStr() {
        return numeroStr;
    }

    public void setNumeroStr(String numeroStr) {
        this.numeroStr = numeroStr;
    }
    
}
