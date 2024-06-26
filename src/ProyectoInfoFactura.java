import java.util.Arrays;
import java.util.Scanner;

public class ProyectoInfoFactura {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        //Datos de las facturas de los clientes o proveedores
        String[] TipoFactura = {"Venta", "Venta", "Venta", "Venta", "Venta", "Compra", "Compra", "Compra", "Compra",
                "Compra"};//Arreglo con los tipos de factura si es Factura de compra o venta
        String[] NumeroFactura = {"F001-001788", "F001-001789", "F001-001790", "F001-001791", "F001-001792", "F001-010618",
                "F001-010711", "F001-020719", "F001-020755", "F001-020763"};//Arreglo con los numeros de las facturas
        String[] FechaFactura = {"04/04/2024", "16/04/2024", "19/04/2024", "24/04/2024", "30/04/2024", "02/04/2024", "18/04/2024",
                "15/04/2024", "23/04/2024", "29/04/2024"};//Arreglo con las fechas de las facturas
        String[] RUC = {"20518153197", "20554862633", "20252907808", "20548320101", "20546295592", "20459857509", "20459857509",
                "20516827425", "20516827425", "20516827425"};//Arreglo con los RUC de clientes o proveedores
        String[] NombreProveedorOCliente = {"GSP INGENIEROS Y CONSTRUCCION SAC", "CONSORCIO GRUPO 8", "TAYOSA SA",
                "PROYECTO Y SOLUCIONES DE ARQUITECTURA E INGENIERIA SAC", "IMITA CONSTRUCTORA & SERV. GRAL. SRL",
                "NOR ORIENTE MATERIALES DE CONSTRUCCION E.I.R.L.", "NOR ORIENTE MATERIALES DE CONSTRUCCION E.I.R.L.",
                "DISTRIBUCIONES Y REPRESENTACIONES PORLLES S.A.C.", "DISTRIBUCIONES Y REPRESENTACIONES PORLLES S.A.C.",
                "DISTRIBUCIONES Y REPRESENTACIONES PORLLES S.A.C."};//Arreglo con los nombres de los proveedores o clientes
        //Datos de los productos que se compran o venden
        String[] DescripcionProducto = {"CEMENTO SOL TIPO 1", "CEMENTO ANDINO TIPO 1", "FIERRO DE 1/2 ACEROS AREQUIPA", "FIERRO DE 5/8 ACEROS AREQUIPA",
                "FIERRO DE 8MM ACEROS AREQUIPA", "FIERRO DE 3/8 ACEROS AREQUIPA", "FIERRO DE 6MM ACEROS AREQUIPA", "FIERRO DE 4.7MM ACEROS AREQUIPA",
                "CEMENTO SOL TIPO 1", "CEMENTO ANDINO TIPO 1", "FIERRO DE 1/2 ACEROS AREQUIPA", "FIERRO DE 5/8 ACEROS AREQUIPA", "FIERRO DE 8MM ACEROS AREQUIPA"
                , "FIERRO DE 3/8 ACEROS AREQUIPA", "FIERRO DE 6MM ACEROS AREQUIPA", "FIERRO DE 4.7MM ACEROS AREQUIPA", "FIERRO DE 1/2 ACEROS AREQUIPA",
                "FIERRO DE 5/8 ACEROS AREQUIPA", "FIERRO DE 8MM ACEROS AREQUIPA", "FIERRO DE 3/8 ACEROS AREQUIPA", "FIERRO DE 6MM ACEROS AREQUIPA",
                "FIERRO DE 4.7MM ACEROS AREQUIPA", "FIERRO DE 1/2 ACEROS AREQUIPA", "FIERRO DE 5/8 ACEROS AREQUIPA", "FIERRO DE 8MM ACEROS AREQUIPA",
                "FIERRO DE 3/8 ACEROS AREQUIPA", "FIERRO DE 6MM ACEROS AREQUIPA", "FIERRO DE 4.7MM ACEROS AREQUIPA", "CEMENTO SOL TIPO 1", "CEMENTO ANDINO TIPO 1"
                , "CEMENTO SOL TIPO 1", "CEMENTO ANDINO TIPO 1", "FIERRO DE 1/2 ACEROS AREQUIPA", "FIERRO DE 5/8 ACEROS AREQUIPA", "FIERRO DE 8MM ACEROS AREQUIPA",
                "FIERRO DE 3/8 ACEROS AREQUIPA", "FIERRO DE 6MM ACEROS AREQUIPA", "FIERRO DE 4.7MM ACEROS AREQUIPA", "CLAVO ALBAÑIL CON CABEZA 4 X 1 KG- PRODAC",
                "CLAVO ALBAÑIL CON CABEZA 3 X 1 KG- PRODAC", "CLAVO ALBAÑIL CON CABEZA 2 1/2 X 1 KG- PRODAC", "CLAVO ALBAÑIL CON CABEZA 2 X 1 KG- PRODAC",
                "FIERRO DE 1/2 ACEROS AREQUIPA", "FIERRO DE 5/8 ACEROS AREQUIPA", "FIERRO DE 8MM ACEROS AREQUIPA", "FIERRO DE 3/8 ACEROS AREQUIPA",
                "FIERRO DE 6MM ACEROS AREQUIPA", "FIERRO DE 4.7MM ACEROS AREQUIPA", "CLAVO ALBAÑIL CON CABEZA 4 X 1 KG- PRODAC", "CLAVO ALBAÑIL CON CABEZA 3 X 1 KG- PRODAC"
                , "CLAVO ALBAÑIL CON CABEZA 2 1/2 X 1 KG- PRODAC", "CLAVO ALBAÑIL CON CABEZA 2 X 1 KG- PRODAC", "CEMENTO SOL TIPO 1", "CEMENTO ANDINO TIPO 1", "CEMENTO SOL TIPO 1"
                , "CEMENTO ANDINO TIPO 1"};/*Arreglo con la descripcion de los productos que se compran o venden. Ya que en una sola factura pueden haber
        mas de un solo producto*/
        int[] CantidadProducto = {100, 100, 50, 35, 100, 35, 25, 18, 90, 90, 45, 32, 90, 32, 23, 16, 45, 27, 58, 32, 20, 25, 40, 22, 53, 27, 15, 20, 100, 100, 85, 80, 45, 27, 58, 32,
                20, 25, 20, 20, 20, 20, 40, 22, 53, 27, 15, 20, 15, 15, 15, 15, 80, 50, 70, 40};
        double[] ImporteProductoSinIGV = {21.61, 22.29, 29.66, 49.32, 11.44, 16.86, 6.36, 3.81, 23.98, 25.00, 32.97, 53.98, 12.97, 18.98, 7.03, 3.98, 29.49, 49.07,
                10.85, 16.61, 6.27, 3.73, 32.97, 53.98, 12.97, 18.98, 7.03, 3.98, 21.69, 22.37, 23.98, 25.00, 29.58, 49.15, 10.93, 16.61, 6.36, 3.81, 3.81, 3.81, 3.81,
                3.81, 32.97, 53.98, 12.97, 18.98, 7.03, 3.98, 4.07, 4.07, 4.07, 4.07, 21.61, 22.37, 23.98, 25.00};
        //Arreglos auxliares
        String[] Auxiliar = {"CF001-01061820459857509", "CF001-01061820459857509", "CF001-01061820459857509", "CF001-01061820459857509",
                "CF001-01061820459857509", "CF001-01061820459857509", "CF001-01061820459857509", "CF001-01061820459857509", "VF001-00178820518153197",
                "VF001-00178820518153197", "VF001-00178820518153197", "VF001-00178820518153197", "VF001-00178820518153197", "VF001-00178820518153197",
                "VF001-00178820518153197", "VF001-00178820518153197", "CF001-02071920516827425", "CF001-02071920516827425", "CF001-02071920516827425",
                "CF001-02071920516827425", "CF001-02071920516827425", "CF001-02071920516827425", "VF001-00178920554862633", "VF001-00178920554862633",
                "VF001-00178920554862633", "VF001-00178920554862633", "VF001-00178920554862633", "VF001-00178920554862633", "CF001-01071120459857509",
                "CF001-01071120459857509", "VF001-00179020252907808", "VF001-00179020252907808", "CF001-02075520516827425", "CF001-02075520516827425",
                "CF001-02075520516827425", "CF001-02075520516827425", "CF001-02075520516827425", "CF001-02075520516827425", "CF001-02075520516827425",
                "CF001-02075520516827425", "CF001-02075520516827425", "CF001-02075520516827425", "VF001-00179120548320101", "VF001-00179120548320101",
                "VF001-00179120548320101", "VF001-00179120548320101", "VF001-00179120548320101", "VF001-00179120548320101", "VF001-00179120548320101",
                "VF001-00179120548320101", "VF001-00179120548320101", "VF001-00179120548320101", "CF001-02076320516827425", "CF001-02076320516827425",
                "VF001-00179220546295592", "VF001-00179220546295592"};/*Arreglo de apoyo que conecta a los arreglos de los datos del cliente con
los arreglos de los productos que se compran y venden */
        //String[] CodProductos = {"C0001", "C0002", "N0003", "N0004", "N0006", "N0007", "F0009", "F0010", "F0011", "F0012", "F0013", "F0014"};
        /*String[] DescripcionCod = {"CEMENTO ANDINO TIPO 1", "CEMENTO SOL TIPO 1", "CLAVO ALBAÑIL CON CABEZA 2 1/2 X 1 KG- PRODAC","CLAVO ALBAÑIL CON CABEZA 2 X 1 KG- PRODAC", "CLAVO ALBAÑIL CON CABEZA 3 X 1 KG- PRODAC", "CLAVO ALBAÑIL CON CABEZA 4 X 1 KG- PRODAC","FIERRO DE 1/2 ACEROS AREQUIPA", "FIERRO DE 3/8 ACEROS AREQUIPA", "FIERRO DE 4.7MM ACEROS AREQUIPA", "FIERRO DE 5/8 ACEROS AREQUIPA","FIERRO DE 6MM ACEROS AREQUIPA", "FIERRO DE 8MM ACEROS AREQUIPA"};*/

        //Metodo para la busqueda de informacion de una factura segun su numero

        String ConsultaFactura ;
        System.out.println("Ingrese el numero de factura : ");
        ConsultaFactura = SC.nextLine();
        String[] InfoFactura = DetInfoFactura(ConsultaFactura, TipoFactura, NumeroFactura, FechaFactura, RUC, NombreProveedorOCliente, Auxiliar, DescripcionProducto, CantidadProducto, ImporteProductoSinIGV);
        System.out.println(Arrays.toString(InfoFactura));
    }

    private static String[] DetInfoFactura(String consultaFactura, String[] tipoFactura, String[] numeroFactura, String[] fechaFactura,
                                           String[] ruc, String[] nombreProveedorOCliente, String[] auxiliar, String[] descripcionProducto, int[] cantidadProducto, double[] importeProductoSinIGV) {
        String[] InfoFactura1 = new String[tipoFactura.length];
        int COntadorAux = 0;
        for (int i = 0; i < tipoFactura.length; i++) {
            if (consultaFactura.equals(numeroFactura[i])) {
                InfoFactura1[COntadorAux] = String.format("Tipo de factura: " + tipoFactura[i] + "%nNumero de factura: " +
                        numeroFactura[i] + "%nFecha de factura: " + fechaFactura[i] + "%nRUC de factura: " + ruc[i] +
                        "%nNombre del proveedor o cliente: " + nombreProveedorOCliente[i] + "%n%nImporte total sin IGV : S/.%.2f"+
                        "%nIGV : S/.%.2f"+"%nImporte total: S/.%.2f%n"+"%nEl detalle de los productos de la factura es:%n Descripcion del producto  ||  Cantidad  ||  Precio unit sin IGV  ||  Precio unit con IGV  %n",
                        importeProductoSinIGV[i]*cantidadProducto[i],importeProductoSinIGV[i]*cantidadProducto[i]*0.18,importeProductoSinIGV[i]*cantidadProducto[i]*1.18);
                COntadorAux++;
            }
        }
        String[] InfoFactura2 = new String[auxiliar.length];
        int ContadorAux2 = 0;
        for (int n = 0; n < auxiliar.length; n++) {
            if (consultaFactura.equals(auxiliar[n].substring(1, 12))) {
                InfoFactura2[ContadorAux2] = String.format("- " + descripcionProducto[n] + "  ||  " + cantidadProducto[n] + "  ||  " + importeProductoSinIGV[n] + "  ||  " +"%.2f"+"%n",importeProductoSinIGV[n]*1.18);
                ContadorAux2++;
            }
        }
        String[] InfoFacturaCombinada = new String[COntadorAux + ContadorAux2];
        // Copiar elementos de InfoFactura1 a InfoFacturaCombinada
        System.arraycopy(InfoFactura1, 0, InfoFacturaCombinada, 0, COntadorAux);
        // Copiar elementos de InfoFactura2 a InfoFacturaCombinada
        System.arraycopy(InfoFactura2, 0, InfoFacturaCombinada, COntadorAux, ContadorAux2);
        return InfoFacturaCombinada;
    }
}