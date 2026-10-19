public class Empleado {

        private String primerNombre;
        private String apellidoPaterno;
        private double salarioMensual;

        public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
            this.primerNombre = primerNombre;
            this.apellidoPaterno = apellidoPaterno;
            setSalarioMensual(salarioMensual); // valida el salario
        }

        public void setPrimerNombre(String primerNombre) { this.primerNombre = primerNombre; }
        public String getPrimerNombre() { return primerNombre; }

        public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }
        public String getApellidoPaterno() { return apellidoPaterno; }

        // Si el salario no es positivo, NO se cambia el valor
        public void setSalarioMensual(double salarioMensual) {
            if (salarioMensual > 0)
                this.salarioMensual = salarioMensual;
        }
        public double getSalarioMensual() { return salarioMensual; }
}

