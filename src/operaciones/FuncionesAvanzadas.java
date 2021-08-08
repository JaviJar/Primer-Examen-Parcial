package operaciones;

public class FuncionesAvanzadas {
    public double raiz(double parametro, int valorDeRaiz) {return Math.pow(parametro, (1d/valorDeRaiz));}

    public double potencia(double numeroOperable, double exponente){
       return Math.pow(numeroOperable, exponente);
    }

    public double seno(double angulo){
        double anguloEnRadianes = Math.toRadians(angulo);
        return Math.sin(anguloEnRadianes);
    }

    public double coseno(double angulo){
        double anguloEnRadianes = Math.toRadians(angulo);
        return Math.cos(anguloEnRadianes);
    }

    public double tangente(double angulo){
        double anguloEnRadianes = Math.toRadians(angulo);
        return Math.tan(anguloEnRadianes);
    }
}
