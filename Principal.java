public class Principal {
    public static void main(String[] args) {
        empleados();
    }
    private static void empleados(){
        User e1 = new User();
        e1.setNombre("Carolina");
        e1.setId(1007061);
        e1.setFecha_nac(new Date((short)30, (short)06, (short)2003));
        e1.setCiudad_nac("Bello");
        e1.setEmail("c.echev03@gmail.com");
        e1.setTel(1001621);
        e1.setDir(new Adress("Calle", "45","Junin","504","Fundadores","Medellin"));
        
        User e2 = new User();
        e2.setNombre("Vanessa");
        e2.setId(1025489);
        e2.setFecha_nac(new Date((short)11, (short)07, (short)2002));
        e2.setCiudad_nac("Barranquilla");
        e2.setEmail("valexq11@gmail.com");
        e2.setTel(2154582);
        e2.setDir(new Adress("Calle", "23","Milagros","201","Reservas","Medellin"));    

        User e3 = new User();
        e3.setNombre("Carlos");
        e3.setId(1098889);
        e3.setFecha_nac(new Date((short)24, (short)10, (short)1985));
        e3.setCiudad_nac("Caldas");
        e3.setEmail("Carlos12@gmail.com");
        e3.setTel(2655582);
        e3.setDir(new Adress("Carrera", "47","Asuncion","208","TorreSofia","Medellin"));

        User e4 = new User();
        e4.setNombre("Stiven");
        e4.setId(2068589);
        e4.setFecha_nac(new Date((short)13, (short)02, (short)1994));
        e4.setCiudad_nac("Medellin");
        e4.setEmail("stiven14m@gmail.com");
        e4.setTel(4452589);
        e4.setDir(new Adress("Carrera", "18","Cabañitas","509","Fabricato","Bello"));

        User e5 = new User();
        e5.setNombre("Milena ");
        e5.setId(3785589);
        e5.setFecha_nac(new Date((short)30, (short)11, (short)1992));
        e5.setCiudad_nac("Bello");
        e5.setEmail("milenitahermosita@gmail.com");
        e5.setTel(7858552);
        e5.setDir(new Adress("Calle", "29B","Boston","204","Vidia","Medellin"));

        List empleados = new List();
        empleados.addFirst(e1);
        empleados.addFirst(e2);
        empleados.addFirst(e3);
        empleados.addFirst(e4);
        empleados.addFirst(e5);
        empleados.printList();

    }
}
