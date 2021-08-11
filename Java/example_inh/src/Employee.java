public class Employee extends Person {
    private String cargo;
    private int tiempo_en_compania;

    public Employee(String nombre, int edad, String cargo, int tiempo_en_compania) {
        super(nombre, edad);
        this.cargo = cargo;
        this.tiempo_en_compania = tiempo_en_compania;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getTiempo_en_compania() {
        return tiempo_en_compania;
    }

    public void setTiempo_en_compania(int tiempo_en_compania) {
        this.tiempo_en_compania = tiempo_en_compania;
    }

    public String bonification() {
        if (this.tiempo_en_compania > 3 && this.tiempo_en_compania < 6) {
            return "Usted tiene un aumento del 0.2%";
        } else if (this.tiempo_en_compania >= 6 && this.tiempo_en_compania < 10) {
            return "Usted tiene un aumento del 2%";
        } else {
            return "Usted tiene un aumento del 6%";
        }
    }
}
