public class Main {
    public static void main(String[] args) {

        System.out.println(" VIDEOJUEGO ");
        Videojuego juego1 = new Videojuego();
        Videojuego juego2 = new Videojuego();
        Videojuego juego3 = new Videojuego();

        juego1.nombre = "The Legend of Zelda";
        juego1.genero = "Aventura";
        juego1.version = "1.2";
        juego1.activo = false;

        juego2.nombre = "FIFA 26";
        juego2.genero = "Deportes";
        juego2.version = "2.0";
        juego2.activo = false;

        juego3.nombre = "GTA V";
        juego3.genero = "Mundo Abierto";
        juego3.version = "1.20";
        juego3.activo = false;

        juego1.iniciar();

        juego1.mostrarInformacion();
        System.out.println();
        juego2.mostrarInformacion();
        System.out.println();
        juego3.mostrarInformacion();
        System.out.println();

        juego1.mostrarVersion();
        juego2.mostrarVersion();
        juego3.mostrarVersion();

        juego1.cerrar();


        System.out.println("\nSOFTWARE ");
        Modulo login = new Modulo();
        Modulo inventario = new Modulo();
        Modulo reportes = new Modulo();

        login.nombre = "Login";
        login.lenguaje = "Java";
        login.version = "1.0";
        login.terminado = false;

        inventario.nombre = "Inventario";
        inventario.lenguaje = "Python";
        inventario.version = "0.8";
        inventario.terminado = false;

        reportes.nombre = "Reportes";
        reportes.lenguaje = "C#";
        reportes.version = "0.5";
        reportes.terminado = false;

        login.marcarTerminado();

        login.mostrarInformacion();
        System.out.println();
        inventario.mostrarInformacion();
        System.out.println();
        reportes.mostrarInformacion();
        System.out.println();

        login.mostrarEstado();
        inventario.mostrarEstado();
        reportes.mostrarEstado();

        login.mostrarVersion();
        inventario.mostrarVersion();
        reportes.mostrarVersion();

        System.out.println(" \nDESARROLLO ");
        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();

        tarea1.titulo = "Diseñar base de datos";
        tarea1.responsable = "Jair";
        tarea1.horasEstimadas = 6.5;
        tarea1.completada = false;

        tarea2.titulo = "Crear pantalla de login";
        tarea2.responsable = "Martín";
        tarea2.horasEstimadas = 4;
        tarea2.completada = false;

        tarea3.titulo = "Escribir pruebas";
        tarea3.responsable = "Carlos";
        tarea3.horasEstimadas = 3.5;
        tarea3.completada = false;

        tarea1.completar();

        tarea1.mostrarInformacion();
        System.out.println();
        tarea2.mostrarInformacion();
        System.out.println();
        tarea3.mostrarInformacion();
        System.out.println();

        tarea1.mostrarResponsable();
        tarea2.mostrarResponsable();
        tarea3.mostrarResponsable();

        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarEstado();
    }
}
