import javax.swing.JOptionPane;

public class PruebaEmpleado {
    public static void main(String[] args) {
        // Empleado 1
        String nombre1 = JOptionPane.showInputDialog("Empleado 1 - Primer nombre:");
        String apellido1 = JOptionPane.showInputDialog("Empleado 1 - Apellido paterno:");
        double salario1 = Double.parseDouble(JOptionPane.showInputDialog("Empleado 1 - Salario mensual:"));

        // Empleado 2
        String nombre2 = JOptionPane.showInputDialog("Empleado 2 - Primer nombre:");
        String apellido2 = JOptionPane.showInputDialog("Empleado 2 - Apellido paterno:");
        double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Empleado 2 - Salario mensual:"));

        Empleado empleado1 = new Empleado(nombre1, apellido1, salario1);
        Empleado empleado2 = new Empleado(nombre2, apellido2, salario2);

        String antes = String.format("SALARIO ANUAL ANTES DEL AUMENTO%n%s %s: $%.2f%n%s %s: $%.2f",
                empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(), empleado1.getSalarioMensual() * 12,
                empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(), empleado2.getSalarioMensual() * 12);
        JOptionPane.showMessageDialog(null, antes);

        // Aumento del 10%
        empleado1.setSalarioMensual(empleado1.getSalarioMensual() * 1.10);
        empleado2.setSalarioMensual(empleado2.getSalarioMensual() * 1.10);

        String despues = String.format("SALARIO ANUAL DESPUÉS DEL AUMENTO DEL 10%%%n%s %s: $%.2f%n%s %s: $%.2f",
                empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(), empleado1.getSalarioMensual() * 12,
                empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(), empleado2.getSalarioMensual() * 12);
        JOptionPane.showMessageDialog(null, despues);
    }
}