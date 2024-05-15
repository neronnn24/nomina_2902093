import java.util.Scanner;

public class LiquidacionNomina {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numEmpleados;
            
            System.out.print("Ingrese el número de empleados a liquidar: ");
            numEmpleados = scanner.nextInt();
            
            for (int i = 0; i < numEmpleados; i++) {
                System.out.println("Empleado #" + (i + 1));
                System.out.print("Ingrese el nombre del empleado: ");
                String nombre = scanner.next();
                
                System.out.print("Ingrese el apellido del empleado: ");
                String apellido = scanner.next();
                
                System.out.print("Ingrese el documento del empleado: ");
                String documento = scanner.next();
                
                System.out.print("Ingrese los días trabajados por el empleado: ");
                int diasTrabajados = scanner.nextInt();
                
                System.out.print("Ingrese el subsidio de transporte del empleado: ");
                double subsidioTransporte = scanner.nextDouble();
                
                double totalBruto = calcularTotalBruto(diasTrabajados, subsidioTransporte);
                double descuentos = calcularDescuentos(totalBruto);
                double devengos = calcularDevengos(totalBruto, descuentos);
                double valorNeto = calcularValorNeto(devengos, descuentos);
                
                System.out.println("\nLiquidación para: " + nombre + " " + apellido + " - Documento: " + documento);
                System.out.println("Total Bruto: $" + totalBruto);
                System.out.println("Descuentos: $" + descuentos);
                System.out.println("Devengos: $" + devengos);
                System.out.println("Valor Neto a Pagar: $" + valorNeto);
            }
        }
    }

    public static double calcularTotalBruto(int diasTrabajados, double subsidioTransporte) {
        // Aquí puedes implementar la lógica para calcular el total bruto
        return diasTrabajados * 1000 + subsidioTransporte;
    }

    public static double calcularDescuentos(double totalBruto) {
        // Aquí puedes implementar la lógica para calcular los descuentos (por ejemplo, seguridad social, salud, pensión, etc.)
        return totalBruto * 0.1;
    }

    public static double calcularDevengos(double totalBruto, double descuentos) {
        // Aquí puedes implementar la lógica para calcular los devengos (por ejemplo, bonificaciones, horas extras, etc.)
        return totalBruto - descuentos;
    }

    public static double calcularValorNeto(double devengos, double descuentos) {
        // Aquí puedes implementar la lógica para calcular el valor neto a pagar
        return devengos - descuentos;
    }
}


    

