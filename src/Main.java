import javax.swing.*;
import java.io.DataInput;
import java.util.Scanner;

public class Main {
    public static void llenarJefe(){
        BlockBoss jefe = new BlockBoss();
        String name = JOptionPane.showInputDialog("DIGITE SU NOMBRE: ");
        String block = JOptionPane.showInputDialog("BLOQUE: ");
        String distritect = JOptionPane.showInputDialog("DISTRITO: ");
        String [] valoresA = {"1","2"};
        String opcion =(String) JOptionPane.showInputDialog(null,
                "VOTO:\n1. A FAVOR\n2.EN CONTRA",
                "..:ELIJA SU VOTO:..",
                2,
                null,
                valoresA,
                valoresA[1]);
        jefe = new BlockBoss(name, block, distritect ,opcion);
        System.out.println("No. "+jefe.getCorrelatie());
        System.out.println("NOMBRE: "+jefe.getName());
        System.out.println("BLOQUE: "+jefe.getBlock());
        System.out.println("DISTRITO: "+jefe.getDistrict());
        System.out.println("PUESTO:"+jefe.getRange());
        System.out.println("VOTO: "+jefe.getVote());
    }
    public static void llenarSubJefe(){
        deputyChief subJefe = new deputyChief();
        String name = JOptionPane.showInputDialog("DIGITE SU NOMBRE: ");
        String block = JOptionPane.showInputDialog("BLOQUE: ");
        String distritect = JOptionPane.showInputDialog("DISTRITO: ");
        String [] valoresA = {"1","2"};
        String opcion =(String) JOptionPane.showInputDialog(null,
                "VOTO:\n1. A FAVOR\n2.EN CONTRA",
                "..:ELIJA SU VOTO:..",
                2,
                null,
                valoresA,
                valoresA[1]);
        subJefe = new deputyChief(name, block, distritect ,opcion);
        System.out.println("No. "+subJefe.getCorrelatie());
        System.out.println("NOMBRE: "+subJefe.getName());
        System.out.println("BLOQUE: "+subJefe.getBlock());
        System.out.println("DISTRITO: "+subJefe.getDistrict());
        System.out.println("PUESTO:"+subJefe.getRange());
        System.out.println("VOTO: "+subJefe.getVote());
    }
    public static void llenarSubJefe2(){
        deputyChief2 subJefe2 = new deputyChief2();
        String name = JOptionPane.showInputDialog("DIGITE SU NOMBRE: ");
        String block = JOptionPane.showInputDialog("BLOQUE: ");
        String distritect = JOptionPane.showInputDialog("DISTRITO: ");
        String [] valoresA = {"1","2"};
        String opcion =(String) JOptionPane.showInputDialog(null,
                "VOTO:\n1. A FAVOR\n2.EN CONTRA",
                "..:ELIJA SU VOTO:..",
                2,
                null,
                valoresA,
                valoresA[1]);
        subJefe2 = new deputyChief2(name, block, distritect ,opcion);
        System.out.println("No. "+subJefe2.getCorrelatie());
        System.out.println("NOMBRE: "+subJefe2.getName());
        System.out.println("BLOQUE: "+subJefe2.getBlock());
        System.out.println("DISTRITO: "+subJefe2.getDistrict());
        System.out.println("PUESTO:"+subJefe2.getRange());
        System.out.println("VOTO: "+subJefe2.getVote());
    }
    public static void Member(){
        Member member = new Member();
        String name = JOptionPane.showInputDialog("DIGITE SU NOMBRE: ");
        String block = JOptionPane.showInputDialog("BLOQUE: ");
        String distritect = JOptionPane.showInputDialog("DISTRITO: ");
        String [] valoresA = {"1","2"};
        String opcion =(String) JOptionPane.showInputDialog(null,
                "VOTO:\n1. A FAVOR\n2.EN CONTRA",
                "..:ELIJA SU VOTO:..",
                2,
                null,
                valoresA,
                valoresA[1]);
        member = new Member(name, block, distritect ,opcion);
        System.out.println("No. "+member.getCorrelatie());
        System.out.println("NOMBRE: "+member.getName());
        System.out.println("BLOQUE: "+member.getBlock());
        System.out.println("DISTRITO: "+member.getDistrict());
        System.out.println("PUESTO:"+member.getRange());
        System.out.println("VOTO: "+member.getVote());
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Deputies dip = new Deputies();
        JOptionPane.showMessageDialog(null, "INICIATIVA DE LEY\n" +
                "Iniciativa que dispone aprobar reformas al Decreto Número 81-87 del Congreso de la República," +
                "\nLey Orgánica del Benemérito Cuerpo Voluntario de Bomberos de Guatemala. Reforma art. 11. Reuniones y dietas, art. 23." +
                "\n Patrimonio y adiciona el art. 27 Bis. Bono de riesgo.");
        String [] valoresAceptados = {"1","2","3","4","5" };
        String op =(String) JOptionPane.showInputDialog(null,
                "MENU:\n1.JEFE DE BLOQUE\n2.SUB-JEFE DE BLOQUE\n3.SUB-JEFE DE BLOQUE 2\n4.INTEGRANTE\n5.SALIR",
                "..:SISTEMA DE VOTACION:..",
                2,
                null,
                valoresAceptados,
                valoresAceptados[1]);


         switch (op) {

             case "1":
              llenarJefe();

                 break;
             case "2":
                llenarSubJefe();
                 break;
             case "3":
                 llenarSubJefe2();
                 break;
             case "4":
                 Member();
                 break;
             case "5":
                 break;
             default:
         }


    }
}