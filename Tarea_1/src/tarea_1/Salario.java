package tarea_1;

public class Salario {
    int codigo= 0;
    float monto= 0;
    int cantidad= 0;
    public Salario (int codigo,float monto,int cantidad){
        this.codigo= codigo;
        this.monto= monto;
        this.cantidad= cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}