/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manual_de_mantenimiento;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Manual_De_Mantenimiento {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner cap = new Scanner(System.in);
        String usuario, contrasena;
        
///INTERFAZ PRINCIPAL (USUARIO Y CONTRASEÑA)

        System.out.println("Bienvenido al manual de reparaciones de \n" +
                "MeowWare hardware co.                             /\\_____/\\ \n" +
                "                                                 (= . w . =)  \n" +
                "                                                 (  v   v   )+++* \n" +
                "                                                ---       --- \n ");
                    
        ////SE LE PIDE AL USUARIO UN USUARIO Y CONTRASEÑA 
        
        System.out.println("Por favor ingrese su usuario:");

        while (true) {
            usuario = cap.nextLine();
            System.out.println("");
            System.out.println("Por favor ingrese su contrasena:");
            System.out.println("");
            contrasena = cap.nextLine();

            if (usuario.equals("MeowWare") && contrasena.equals("Miau")) {
                
//// SI LO ESCRITO EN EL USUARIO Y CONTRASEÑA SON IGUALES PASAREMOS A LA SECCION DE LA INTRODUCCION Y SE ROMPERA EL CICLO DEL WHILE

                System.out.println("");
                System.out.println("MewWare Hardware presenta:");
                System.out.println("");
                System.out.println("En este simulador de manual para reparacion de PC podras visualizar los errores mas comunes\n"
                        + "que se pueden presentar a la hora de utilizar tu PC. En este proyecto tendras acceso a una lista de errores\n"
                        + "con muchas de sus posibles soluciones. Tambien tendras acceso a una lista de herramientas necesarias a la\n"
                        + "hora de realizar tus reparaciones. Si sientes que has aprendido lo suficiente! Tenemos una lista de examenes\n"
                        + "practicos los cuales podras intentar y al final de estos comprobar tus resultados. Por ultimo, y no menos\n"
                        + "importante, tenemos una pestana de contacto donde podras encontrar un numero y correo para contactarnos en caso de\n"
                        + "cualquier sugerencia o reporte!\n");
                break;
                ///SI LO QUE DIJITO EL USUARIO NO ES IGUAL SE LE MOSTRARA UN MENSAJE DE ERROR Y SE LE PEDIRA INGRESAR NUEVAMENTE SU USUARIO Y CONTRASEÑA(SE REPETIRA HASTA QUE SEA CORRECTO)
            } else {
                System.out.println("");
                System.out.println("Usuario o contrasena incorrectos. Ingrese de nuevo su usuario:");
            }
        }
       
/// CREACION DEL METODO mostrarMenu PARA INICIALIZAR LA LISTA DE OPCIONES

        mostrarMenu(cap); 
    }
///METODO QUE SE ENCARGA DE AVANZAR AL METODO mostrarListaOpciones
    public static void mostrarMenu(Scanner scanner) {
        /// COMPROBAR SI EL DIGITO DEL USUARIO INGRESADO FUE "1"
        while(true){
        System.out.println("Presiona la tecla (1) para empezar:");
        System.out.println("");
        int opcion = scanner.nextInt(); 
//// SI 1 FUE INGRESADO SE INICIALIZARA EL METODO DE mostrarListaOpciones Y SE ROMPERA EL BUCLE
        if (opcion == 1) {
            mostrarListaOpciones(scanner);
            break;
            ///SI EL USUARIO INGRESO CUALQUIER COSA QUE NO SEA "1" SE MOSTRARA UN MENSAJE DE ERROR Y SE LE PEDIRA INGRESAR LA OPCION NUEVAMENTE , ESTE CICLO SE REPETIRA HASTA QUE SE DIGITE "1"
        } else {
            System.out.println("");
            System.out.println("Opcion no valida. Intente de nuevo.");
        }
    }
    }
    
///METODO QUE MUESTRA LAS OPCIONES PRINCIPALES DEL MANUAL
    
    public static void mostrarListaOpciones(Scanner scanner) {
        System.out.println("Lista de opciones (ingrese el numero de la opcion deseada):");
        System.out.println("");
        System.out.println("1.Lista de herramientas");
        System.out.println("");
        System.out.println("2.Problemas en el hardware");
        System.out.println("");
        System.out.println("3.Problemas en el software");
        System.out.println("");
        System.out.println("4.Examenes Practicos");
        System.out.println("");
        System.out.println("5.Recomendaciones para pc segun su presupuesto");
        System.out.println("");
        System.out.println("Ingrese su opcion:");
        int opcion1= scanner.nextInt();
while (true) { 
        if (opcion1 == 1) {
         ListaHerramientas(scanner);
            break;
        } else if (opcion1 == 2) {
         ProblemasHardware(scanner);
            break;
        } else if (opcion1 == 3) {
           mostrarProblemasSoftware(scanner);
            break;
        } else if (opcion1 == 4) {
            ExamenesPracticos(scanner);
            break;
        } else if (opcion1 == 5) {
          PreciosPc(scanner);
            break;
        } else {
            System.out.println("Opcion no valida. Intente de nuevo:");
            opcion1 = scanner.nextInt(); 
        }
}
    }
    
      public static void ListaHerramientas(Scanner scanner) {
       
 

        System.out.println("Si desea ver el menu de herramientas para software ingrese 1");
        System.out.println("Si desea ver el menu de herramientas para hardware ingrese 2");
        int elec = scanner.nextInt(); // Capturar decision

        switch (elec) {
            case 1:
                mostrarHerramientasSoftware(scanner);
                break;

            case 2:
                mostrarHerramientasHardware(scanner);
                break;

            default:
                System.out.println("Numero invalido");
            
        }
    }

    private static void mostrarHerramientasSoftware(Scanner scanner) {
        Scanner cap = new Scanner(System.in);
        System.out.println("CCleaner Free");
        System.out.println("Microsoft PC Manager");
        System.out.println("IObit Advanced SystemCare");
        System.out.println("BleachBit");
        System.out.println("Process Explorer");
        System.out.println("Wi-Fi Analyzer");
        System.out.println("Angry IP Scanner");
        System.out.println("WinDirStat");
        System.out.println("CrystalDiskInfo");
        System.out.println("Malwarebytes");
   
        System.out.println("Si desea ver la lista de herramientas para hardware ingrese 1, si desea volver al menu inicial ingrese 0 ");
        int e2 = scanner.nextInt();

        while(true){
        switch (e2) {
            case 1:
                mostrarHerramientasHardware(scanner);
                break;

            case 0:
                mostrarListaOpciones(scanner);
                break;
                
            default:
                System.out.println("Numero invalido");
                mostrarHerramientasSoftware(scanner);
                break;
                
        }}
    }

    private static void mostrarHerramientasHardware(Scanner scanner) {
     
        System.out.println("Destornilladores de distintos tamanos y formas");
        System.out.println("Alicates o pinzas antiestaticas");
        System.out.println("Aspiradora para equipos electronicos");
        System.out.println("Estacion de soldadura");
        System.out.println("Cinta aislante");
        System.out.println("Guantes");
        System.out.println("Multimetro o tester");
        System.out.println("Destornillador magnetico con puntas intercambiables");
        System.out.println("Alfombrilla antiestatica");
        System.out.println("Pinza de punta fina");

        System.out.println("Si desea ver la lista de herramientas para software ingrese 1, si desea volver al menu inicial ingrese 0 ");
        int e2 = scanner.nextInt();

        while(true){
            switch (e2) {
            case 1:
                mostrarHerramientasSoftware(scanner);
                break;

            case 0:
                mostrarListaOpciones(scanner);
                break;
                
                
            default:
                System.out.println("Numero invalido");
                mostrarHerramientasHardware(scanner);
                break;
         
        }
        }
    }
    public static void ProblemasHardware(Scanner scanner){
               int opcion1;
        String[] problemas = {"1.La computadora no enciende.",
                              "2.Pantalla sin imagen (monitor negro).",
                              "3.La computadora se sobrecalienta.",
                              "4.El teclado no responde.",
                              "5.El mouse no funciona correctamente.",
                              "6.La computadora se reinicia inesperadamente..",
                              "7.El disco duro no es reconocido.",
                              "8.Problemas con la conexion Wi-Fi o Ethernet.",
                              "9.Los puertos USB no funcionan.",
                              "10.La bateria del laptop no carga.",
                              "11.El ventilador hace ruidos extranos.",
                              "12.La tarjeta grafica no muestra imagen o falla.",
                              "13.La computadora no detecta dispositivos conectados.",
                              "14.La unidad de CD/DVD no lee discos.",
                              "15.El sistema no arranca (pantalla azul o error en BIOS)..",
            
                };
    while (true) {
       
        System.out.println("Seleccione un problema para ver la solucion o 0 para regresar al menu principal:");
        for (int i = 0; i < problemas.length; i++) {
            System.out.println( problemas[i]);
        }

        System.out.print("Ingrese su eleccion: ");
        int opcion = scanner.nextInt();

        if (opcion == 0) { 
            System.out.println("Regresando al menú principal...");
             mostrarListaOpciones(scanner);
            return;
        } else if (opcion > 0 && opcion < problemas.length) {
           
            SolucionesHardware(opcion);
        } else {
            
            System.out.println("Opción no válida. Intente nuevamente.");
        }
    }
}
              public static void SolucionesHardware(int opcion){
    String Solucion [][] = {
  {"1.- Verifica que el cable de alimentacion este conectado correctamente.",
   "2.- Asegurate de que el interruptor de la fuente de poder este en la posicion correcta.",
   "3.-Prueba enchufar en otro tomacorriente."},
   
   {"1.- Confirma que el cable del monitor este bien conectado a la tarjeta grafica o a la motherboard.",
   "2.- Cambia el cable del monitor (HDMI, VGA, DisplayPort).",
   "3.- Ajusta el brillo o selecciona la entrada correcta en el monitor."},
   
   {"1.- Limpia los ventiladores y disipadores con aire comprimido.",
   "2.- Asegurate de que haya un flujo de aire adecuado alrededor del gabinete.",
   "3.- Cambia la pasta termica del procesador."},
   
   {"1.- Desconecta y vuelve a conectar el teclado a otro puerto USB.",
   "2.- Limpia las teclas con aire comprimido para eliminar polvo.",
   "3.-Prueba con otro teclado para descartar fallos fisicos."},
   
   {"1.- Limpia el sensor optico con un pano suave.",
   "2.- Cambia las pilas si es un mouse inalambrico.",
   "3.- Conectalo a otro puerto USB o reinstala los controladores."},
   
   {"1.-Verifica que la fuente de poder este funcionando correctamente.",
   "2.-Asegurate de que no haya sobrecalentamiento (revisa ventiladores y disipadores).",
   "3.-Actualiza los controladores del sistema."},
   
   {"1.- Revisa las conexiones del disco duro a la placa madre y la fuente de alimentacion.",
   "2.- Configura el disco en el BIOS o cambia los ajustes de SATA.",
   "3.- Usa un software de diagnostico para verificar el estado del disco."},
   
   {"1.- Reinicia el router y la computadora.",
   "2.- Verifica que el adaptador de red este habilitado en la configuracion del sistema.",
   "3.- Actualiza los controladores de la tarjeta de red."},
   
   {"1.- Reinicia el sistema y prueba conectar dispositivos nuevamente.",
   "2.- Inspecciona los puertos y limpia con aire comprimido.",
   "3.- Actualiza los controladores del chipset de la motherboard."},
   
   {"1.- Verifica que el cargador y el cable funcionen correctamente en otra laptop.",
   "2.- Comprueba el puerto de carga y limpialo si hay obstrucciones.",
   "3.- Realiza un \"power reset\" desconectando la bateria y manteniendo presionado el boton de encendido."},
   
   {"1.- Limpia el ventilador con aire comprimido para eliminar polvo acumulado.",
   "2.- Ajusta los tornillos para asegurar que este bien montado.",
   "3.- Cambia el ventilador si el ruido persiste y afecta el rendimiento."},
   
   {"1.- Asegurate de que este correctamente instalada en la ranura PCIe.",
   "2.- Actualiza los controladores de la tarjeta grafica.",
   "3.- Prueba la tarjeta en otro sistema para descartar danos fisicos."},
   
   {"1.- Prueba los dispositivos en otro puerto o computadora.",
   "2.- Actualiza o reinstala los controladores del dispositivo.",
   "3.- Revisa las configuraciones de BIOS para asegurarte de que los puertos esten habilitados."},
   
   {"1.-Limpia la lente de la unidad con un kit de limpieza especializado.",
   "2.- Verifica que los discos no esten danados o rayados.",
   "3.- Actualiza el firmware de la unidad optica."},
   
   {"1.- Restaura los valores predeterminados del BIOS.",
   "2.- Verifica las conexiones de hardware como RAM y disco duro.",
   "3.-Usa un disco de recuperacion o memoria USB para reparar el sistema operativo."}

};
  
      for (String solucion : Solucion[opcion]) {
          System.out.println("");
          System.out.println("" + solucion);
    }
    System.out.println();
            }

    
     private static void mostrarProblemasSoftware(Scanner scanner) {
    // Lista de problemas comunes
    String[] problemas = {
        "Regresar al menu",
        "El sistema operativo no arranca",
        "Programas que no abren o se cierran inesperadamente",
        "Problemas de espacio de disco",
        "Infeccion por virus o malware",
        "Sin conexion a internet",
        "Problemas de sonido",
        "Pantalla azul o pantalla de la muerte",
        "Actualizaciones del sistema fallidas",
        "Archivos danados o corruptos",
        "Problemas de compatibilidad por software",
        "Fallos al instalar programas",
        "Rendimiento lento del sistema",
        "Configuracion incorrecta del sistema",
        "Problemas de seguridad y permisos",
        "Error al detectar dispositivos externos como USB o discos duros"
    };

    while (true) {
        // Mostrar los problemas disponibles
        System.out.println("Seleccione un problema para ver la solucion o 0 para regresar al menu principal:");
        for (int i = 0; i < problemas.length; i++) {
            System.out.println(i + ". " + problemas[i]);
        }

        System.out.print("Ingrese su eleccion: ");
        int opcion = scanner.nextInt();

        if (opcion == 0) { // Regresar al menú principal
            System.out.println("Regresando al menú principal...");
            mostrarListaOpciones(scanner); // Llamar al menú principal
            return;
        } else if (opcion > 0 && opcion < problemas.length) {
            // Llamar al metodo para mostrar las soluciones
            mostrarSolucionesSoftware(opcion);
        } else {
            
            System.out.println("Opción no válida. Intente nuevamente.");
        }
    }
}

// Metodo para mostrar las soluciones según la opción seleccionada
private static void mostrarSolucionesSoftware(int opcion) {
    // Soluciones correspondientes a cada problema
    String[][] soluciones = {
        {}, // Solucion vacía para "Regresar al menu"
        {
            "Iniciar en modo seguro (presionar F8 o Shift durante el arranque).",
            "Reparar el inicio del sistema desde las opciones avanzadas de inicio.",
            "Usar un disco de arranque o USB para reparar el sistema operativo.",
            "Reinstalar el sistema operativo sin perder archivos."
        },
        {
            "Verificar que el sistema operativo y el software esten actualizados.",
            "Reiniciar el equipo para resolver problemas temporales de recursos.",
            "Ejecutar el programa como administrador.",
            "Desinstalar y reinstalar el programa afectado."
        },
        {
            "Eliminar archivos temporales y caches del sistema.",
            "Usar una herramienta de limpieza de disco, como Liberador de espacio en disco.",
            "Desinstalar programas innecesarios.",
            "Mover archivos personales a un almacenamiento externo."
        },
        {
            "Ejecutar un software antivirus actualizado para realizar un escaneo completo.",
            "Usar herramientas especificas de eliminacion de malware.",
            "Asegurarse de que el sistema operativo este actualizado.",
            "Restablecer el sistema a un punto anterior, si es posible."
        },
        {
            "Comprobar que el cable o conexion inalambrica este activado.",
            "Reiniciar el modem/router.",
                "Verificar la configuracion de red o realizar una reparacion de red.",
                "Actualizar los controladores del adaptador de red."
        },
        {
            "Comprobar que los altavoces o auriculares esten correctamente conectados.",
            "Asegurarse de que el volumen no este silenciado o muy bajo.",
            "Actualizar los controladores de audio.",
            "Reiniciar el sistema o el servicio de audio."
        },
        {
            "Verificar que todos los controladores del sistema esten actualizados.",
            "Comprobar la memoria RAM con herramientas de diagnostico.",
            "Desinstalar software recien instalado que cause conflictos.",
            "Iniciar el sistema en modo seguro para deshabilitar configuraciones problematicas."
        },
        {
            "Comprobar que el sistema este conectado a Internet.",
            "Ejecutar el solucionador de problemas de Windows Update.",
            "Descargar e instalar actualizaciones manualmente.",
            "Liberar espacio en el disco si es necesario."
        },
        {
            "Usar la herramienta de reparacion de archivos del sistema (sfc/scannow).",
            "Restaurar los archivos a partir de una copia de seguridad.",
            "Descargar o recuperar archivos desde una fuente confiable.",
            "Usar una herramienta de recuperacion de archivos si los datos son irrecuperables."
        },
        {
            "Ejecutar el programa en modo de compatibilidad.",
            "Asegurarse de que todas las dependencias del software esten instaladas.",
            "Comprobar que los controladores esten actualizados.",
            "Desactivar el software antivirus temporalmente si interfiere."
        },
        {
            "Verificar que el archivo de instalacion no este corrupto.",
            "Ejecutar la instalacion como administrador.",
            "Comprobar la compatibilidad del software.",
            "Desactivar temporalmente el software antivirus."
        },
        {
            "Cerrar programas en segundo plano que consumen recursos.",
            "Desactivar los programas de inicio innecesarios.",
            "Liberar espacio en disco y desfragmentar el disco duro.",
            "Asegurarse de que el sistema este libre de malware."
        },
        {
            "Verificar configuraciones incorrectas en el registro.",
            "Restaurar configuraciones del sistema a un punto anterior.",
            "Reconfigurar o reinstalar software problematico."
        },
        {
            "Verificar que los permisos de archivos esten configurados correctamente.",
            "Asegurarse de que el sistema este actualizado.",
            "Deshabilitar temporalmente los software de seguridad."
        },
        {
            "Reiniciar el equipo.",
            "Comprobar los controladores del dispositivo.",
            "Desconectar y volver a conectar el dispositivo externo.",
            "Probar el dispositivo en otro puerto o computadora."
        }
    };

    // Mostrar las soluciones para el problema seleccionado
    System.out.println("Soluciones para el problema seleccionado:");
    for (String solucion : soluciones[opcion]) {
        System.out.println("- " + solucion);
    }
    System.out.println();
}

        public static void ExamenesPracticos(Scanner scanner) {  
        System.out.println("Lista de opciones (ingrese el numero de la opcion deseada):");
        System.out.println("");
        System.out.println("1.Examen Hardware");
        System.out.println("");
        System.out.println("2.Examen Software");
        int opcion1= scanner.nextInt();  
       while (true) {
        if (opcion1 == 1) {
            ExamenHardware(scanner);
            break;
        } else if (opcion1 == 2) {
            ExamenSoftware(scanner);
            break;
            }else{
             System.out.println("Opcion no valida. Intente de nuevo:");
            opcion1 = scanner.nextInt(); 
         
        }
     }
             }
        public static void ExamenHardware(Scanner scanner) { 
             
        String[][] preguntas = {
            {"Que es el hardware?", 
                "A)Elementos fisicos o materiales que constituyen una computadora o un sistema informatico.", 
                "B)Conjunto de programas, instrucciones y reglas informaticas que permiten que un dispositivo electronico realice tareas especificas", 
                "C)Conjunto de dispositivos que estan conectados entre si en una misma ubicacion geografica.", 
                "D)Dispositivo que permite guardar archivos, aplicaciones y el sistema operativo de forma permanente", 
                "A)Elementos fisicos o materiales que constituyen una computadora o un sistema informatico."},
            
           {"Que componentes incluye el hardware de un sistema informatico?", 
        "A) Dispositivo que permite guardar archivos, aplicaciones y el sistema operativo de forma permanente.", 
        "B) Conjunto de aplicaciones que ejecutan tareas especificas.", 
        "C) Redes y conexiones entre varios sistemas.", 
        "D) Dispositivos fisicos como procesador, memoria, y almacenamiento.", 
        "D) Dispositivos fisicos como procesador, memoria, y almacenamiento."},

    {"Que tipo de hardware es una tarjeta grafica?", 
        "A) Software que permite la ejecucion de programas de diseno.", 
        "B) Hardware de procesamiento especializado en graficos.", 
        "C) Unidad de almacenamiento masivo.", 
        "D) Dispositivo que permite guardar archivos, aplicaciones y el sistema operativo de forma permanente", 
        "B) Hardware de procesamiento especializado en graficos."},

    {"Cual es la funcion principal de la memoria ROM?", 
        "A) Dispositivo que permite guardar archivos, aplicaciones y el sistema operativo de forma permanente.", 
        "B) Proveer acceso rapido a datos de uso temporal.", 
        "C) Facilitar la comunicacion entre dispositivos en red.", 
        "D) Almacenar instrucciones esenciales para el arranque del sistema.", 
        "D) Almacenar instrucciones esenciales para el arranque del sistema."},

    {"Que es el bus de datos en el hardware de una computadora?", 
        "A) Software que regula la comunicacion entre dispositivos.", 
        "B) Dispositivo fisico que almacena datos temporalmente.", 
        "C) Conjunto de lineas que transportan informacion entre componentes.", 
        "D) Dispositivo que permite guardar archivos, aplicaciones y el sistema operativo de forma permanente", 
        "C) Conjunto de lineas que transportan informacion entre componentes."},

    {"Que diferencia principal existe entre hardware interno y externo?", 
        "A) El hardware interno se encuentra dentro del gabinete, mientras que el externo incluye perifericos.", 
        "B) El hardware externo se conecta a la red, mientras que el interno no.", 
        "C) El hardware interno solo almacena datos, mientras que el externo los procesa.", 
        "D) Dispositivo que permite guardar archivos, aplicaciones y el sistema operativo de forma permanente", 
        "A) El hardware interno se encuentra dentro del gabinete, mientras que el externo incluye perifericos."},

    {"Para que sirve un disipador de calor en el hardware?", 
        "A) Facilitar la conexion de dispositivos externos.", 
        "B) Almacenar energia para evitar apagones subitos.", 
        "C) Reducir el calor generado por los componentes durante su funcionamiento.", 
        "D) Dispositivo que permite guardar archivos, aplicaciones y el sistema operativo de forma permanente", 
        "C) Reducir el calor generado por los componentes durante su funcionamiento."},

    {"Que componente fisico conecta todos los dispositivos internos de una computadora?", 
        "A) El disco duro.", 
        "B) La tarjeta madre.", 
        "C) El procesador.", 
        "D) Dispositivo que permite guardar archivos, aplicaciones y el sistema operativo de forma permanente", 
        "B) La tarjeta madre."},

    {"Que tipo de hardware es un SSD?", 
        "A) Dispositivo que permite guardar archivos, aplicaciones y el sistema operativo de forma permanente.", 
        "B) Dispositivo de entrada para texto y comandos.", 
        "C) Procesador dedicado a graficos.", 
        "D) Unidad de almacenamiento solido de alta velocidad.", 
        "D) Unidad de almacenamiento solido de alta velocidad."},

    {"Cual es el papel de la fuente de poder en el hardware?", 
        "A) Almacenar datos de manera permanente.", 
        "B) Suministrar energia electrica a todos los componentes del sistema.", 
        "C) Proveer acceso rapido a aplicaciones en ejecucion.", 
        "A) Dispositivo que permite guardar archivos, aplicaciones y el sistema operativo de forma permanente", 
        "A) Almacenar datos de manera permanente.."}
};

        

 
     for (int i = preguntas.length -1 ; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            String[] temp = preguntas[i];
            preguntas[i] = preguntas[j];
            preguntas[j] = temp;
          }
   
   
        
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        int k = 0;
        for (int i = 0; i < preguntas.length; i++) {
            k++;
            System.out.println(" | "+k+ ". "+preguntas[i][0]+ " | "); 
            for (int j = 1; j < 5; j++) {
                System.out.println(j + ". " + preguntas[i][j]); 
            }
            
            int respuestaUsuario;
            while (true) {
                System.out.print(" ");
                System.out.print("Tu respuesta (ingresa el numero de la opcion): ");
                   System.out.print(" ");
                respuestaUsuario = scanner.nextInt();
                if (respuestaUsuario >= 1 && respuestaUsuario <= 4) {
                    break;
                } else {
                       System.out.print(" ");
                    System.out.println("Opcion invalida. Por favor, ingresa un numero entre 1 y 4.");
                }
            }
            
            
            if (preguntas[i][respuestaUsuario].equals(preguntas[i][5])) {
                   System.out.print(" ");
                System.out.println("Correcto!");
                   System.out.print(" ");
                respuestasCorrectas++;
            } else {
                   System.out.print(" ");
                System.out.println("Incorrecto. La respuesta correcta es: " + preguntas[i][5]);
                   System.out.print(" ");
                respuestasIncorrectas++;
            }
            System.out.println();
        }
        
        
         System.out.println(" Respuestas correctas: " + respuestasCorrectas);
           System.out.print(" ");
         System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
            System.out.print(" ");
         
            if(respuestasCorrectas >=9){
                          System.out.println("PERFECTO!!!! " + respuestasCorrectas + " / " + 10+
                "                               /\\_____/\\ \n" +                          
                "                                                 (= ^ 0 ^ =)  \n" +
                "                                                 (  v   v  )+++* \n" +
                "                                                ---       --- \n ");
                            }else if(respuestasCorrectas>=7 ){
                                   System.out.println("Bien hecho!!! " + respuestasCorrectas + " / " + 10+
                "                              /\\_____/\\ \n" +
                "                                                 (= - v - =)  \n" +
                "                                                 (  v   v  )+++* \n" +
                "                                                ---       --- \n ");
                                   }else if(respuestasCorrectas>=5 ){
                                   System.out.println("Puedes mejorar!!! " + respuestasCorrectas + " / " + 10+
                "                        /\\_____/\\ \n" +
                "                                                 (= * O * =)  \n" +
                "                                                 (  v   v  )+++* \n" +
                "                                                ---       --- \n ");
                                }else if(respuestasCorrectas>=1 ){
                                   System.out.println("Necesitas mejorar !!! "  + respuestasCorrectas + "/" + 10+
               "                       /\\_____/\\ \n" +
                "                                                 (= x o x =)  \n" +
                "                                                 (  v   v  )+++* \n" +
                "                                                ---       --- \n ");
                                     }else if(respuestasCorrectas==0 ){
                                   System.out.println("No eres muy bueno en esto verdad ? " + respuestasCorrectas + " / " + 10+
                "         _____ \n" +
                "                                                 /     \\  \n" +
                "                                                /       \\ \n" +
                "                                               |   RIP   |-- \n"+
                "                                               |         |  "
                                                                          
                                                                          + "  ");
                                     }
           
                        
                        
                                       while(true){
                                       System.out.println("Presiona la tecla (1) para continuar:");
                                       System.out.println("");
                                       int sig = scanner.nextInt(); 

                                       if (sig== 1) {
                                      mostrarListaOpciones(scanner);
                                       break;
            
                                       } else {
                                       System.out.println("");
                                       System.out.println("Opcion no valida. Intente de nuevo.");
        }
                                       }
        }
public static void ExamenSoftware(Scanner scanner) { 
                                            
        String[][] preguntas = {
             {"Que es el software?", 
     "A) Elementos fisicos o materiales que constituyen una computadora o un sistema informatico.", 
     "B) Conjunto de programas, instrucciones y reglas informaticas que permiten que un dispositivo electronico realice tareas especificas.", 
     "C) Conjunto de dispositivos que estan conectados entre si en una misma ubicacion geografica.", 
     "D) Dispositivo que permite guardar archivos, aplicaciones y el sistema operativo de forma permanente.", 
     "B) Conjunto de programas, instrucciones y reglas informaticas que permiten que un dispositivo electronico realice tareas especificas."},
    
    {"Que componente es esencial para la ejecucion de programas en una computadora?", 
     "A) El sistema operativo.", 
     "B) El procesador.", 
     "C) La memoria RAM.", 
     "D) El disco duro.", 
     "A) El sistema operativo."},
    
    {"Que tipo de software es un antivirus?", 
     "A) Software de utilidad.", 
     "B) Software de aplicacion.", 
     "C) Software del sistema.", 
     "D) Software malicioso.", 
     "A) Software de utilidad."},
    
    {"Cual es la funcion principal de un sistema operativo?", 
     "A) Gestionar los recursos del hardware y permitir la ejecucion de programas.", 
     "B) Almacenar datos de forma permanente.", 
     "C) Ejecutar aplicaciones de usuario.", 
     "D) Facilitar la conexion a redes.", 
     "A) Gestionar los recursos del hardware y permitir la ejecucion de programas."},
    
    {"Que es un software de codigo abierto?", 
     "A) Un software que se puede modificar y distribuir libremente.", 
     "B) Un software que solo se puede adquirir por medio de compra.", 
     "C) Un software que esta restringido a una sola maquina.", 
     "D) Un software que permite realizar tareas de seguridad en redes.", 
     "A) Un software que se puede modificar y distribuir libremente."},
    
    {"Que es un sistema operativo?", 
     "A) Un conjunto de aplicaciones diseniadas para realizar tareas especificas.", 
     "B) Un conjunto de programas que gestionan los recursos del sistema.", 
     "C) Un dispositivo para la entrada de datos.", 
     "D) Un tipo de software malicioso.", 
     "B) Un conjunto de programas que gestionan los recursos del sistema."},
    
    {"Que tipo de software es un procesador de texto?", 
     "A) Software de sistema.", 
     "B) Software de aplicacion.", 
     "C) Software de desarrollo.", 
     "D) Software de utilidad.", 
     "B) Software de aplicacion."},
    
    {"Cual es la funcion de un compilador?", 
     "A) Ejecutar directamente programas en lenguaje de bajo nivel.", 
     "B) Traducir codigo fuente a lenguaje de maquina para su ejecucion.", 
     "C) Crear interfaces de usuario para aplicaciones.", 
     "D) Gestionar el acceso a la memoria RAM.", 
     "B) Traducir codigo fuente a lenguaje de maquina para su ejecucion."},
    
    {"Que es el software malicioso?", 
     "A) Software diseniado para ayudar en la gestion de recursos.", 
     "B) Software que realiza tareas especificas y utiles para el usuario.", 
     "C) Software que daña, interrumpe o afecta negativamente a los sistemas.", 
     "D) Software que se instala de manera legal en todos los sistemas operativos.", 
     "C) Software que daña, interrumpe o afecta negativamente a los sistemas."},
    
    {"Cual es el papel de un sistema de gestion de bases de datos (DBMS)?", 
     "A) Administrar los archivos de un sistema operativo.", 
     "B) Permitir la comunicacion entre el hardware y el software.", 
     "C) Gestionar, almacenar y organizar grandes volumenes de datos.", 
     "D) Permitir la ejecucion de aplicaciones en red.", 
     "C) Gestionar, almacenar y organizar grandes volumenes de datos."}
};
        

 
      for (int i = preguntas.length -1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            String[] temp = preguntas[i];
            preguntas[i] = preguntas[j];
            preguntas[j] = temp;
          }

        
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
      int k = 0;
        for (int i = 0; i < preguntas.length; i++) {
            k++;
            System.out.println(" | "+k+ ". "+preguntas[i][0]+ " | "); 
            
            for (int j = 1; j < 5; j++) {
                System.out.println(j + ". " + preguntas[i][j]); 
            }
            
            int respuestaUsuario;
            while (true) {
                System.out.print(" ");
                System.out.print("Tu respuesta (ingresa el numero de la opcion): ");
                   System.out.print(" ");
                respuestaUsuario = scanner.nextInt();
                if (respuestaUsuario >= 1 && respuestaUsuario <= 4) {
                    break;
                } else {
                       System.out.print(" ");
                    System.out.println("Opcion invalida. Por favor, ingresa un numero entre 1 y 4.");
                }
            }
            
            
            if (preguntas[i][respuestaUsuario].equals(preguntas[i][5])) {
                   System.out.print(" ");
                System.out.println("Correcto!");
                   System.out.print(" ");
                respuestasCorrectas++;
            } else {
                   System.out.print(" ");
                System.out.println("Incorrecto. La respuesta correcta es: " + preguntas[i][5]);
                   System.out.print(" ");
                respuestasIncorrectas++;
            }
            System.out.println();
        }
        
        
         System.out.println(" Respuestas correctas: " + respuestasCorrectas);
           System.out.print(" ");
         System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
            System.out.print(" ");
         
            if(respuestasCorrectas >=9){
                          System.out.println("PERFECTO!!!! " + respuestasCorrectas + " / " + 10+
                "                               /\\_____/\\ \n" +                          
                "                                                 (= ^ 0 ^ =)  \n" +
                "                                                 (  v   v  )+++* \n" +
                "                                                ---       --- \n ");
                            }else if(respuestasCorrectas>=7 ){
                                   System.out.println("Bien hecho!!! " + respuestasCorrectas + " / " + 10+
                "                              /\\_____/\\ \n" +
                "                                                 (= - v - =)  \n" +
                "                                                 (  v   v  )+++* \n" +
                "                                                ---       --- \n ");
                                   }else if(respuestasCorrectas>=5 ){
                                   System.out.println("Puedes mejorar!!! " + respuestasCorrectas + " / " + 10+
                "                        /\\_____/\\ \n" +
                "                                                 (= * O * =)  \n" +
                "                                                 (  v   v  )+++* \n" +
                "                                                ---       --- \n ");
                                }else if(respuestasCorrectas>=1 ){
                                   System.out.println("Necesitas mejorar !!! "  + respuestasCorrectas + "/" + 10+
               "                       /\\_____/\\ \n" +
                "                                                 (= x o x =)  \n" +
                "                                                 (  v   v  )+++* \n" +
                "                                                ---       --- \n ");
                                     }else if(respuestasCorrectas==0 ){
                                   System.out.println("No eres muy bueno en esto verdad ? " + respuestasCorrectas + " / " + 10+
                "         _____ \n" +
                "                                                 /     \\  \n" +
                "                                                /       \\ \n" +
                "                                               |   RIP   |-- \n"+
                "                                               |         |  "
                                                                          
                                                                          + "  ");
                                     }
           
                        
                        
                                       while(true){
                                       System.out.println("Presiona la tecla (1) para continuar:");
                                       System.out.println("");
                                       int sig = scanner.nextInt(); 

                                       if (sig== 1) {
                                       mostrarListaOpciones(scanner);
                                       break;
            
                                       } else {
                                       System.out.println("");
                                       System.out.println("Opcion no valida. Intente de nuevo.");
        }
                                       }
}
                                       
    public static int PreciosPc(Scanner scanner) {
   
      int opcion1;
      
 System.out.println("| 5.Recomendaciones para pc segun su presupuesto |");
        System.out.println("");
    while (true) { 
        System.out.println("Por favor, digite su presupuesto (+2500$) o digite 0 para volver ala lista");
        opcion1 = scanner.nextInt();

        if (opcion1==0){
             mostrarListaOpciones(scanner);
           
          
        }
            else if (opcion1 >= 2500 && opcion1<=3999) {
            System.out.println("EQUIPO RECOMENDADO CON 2500 A 3999 $MX");
            System.out.println("");
            System.out.println("Procesador: AMD Athlon 3000G."
                    + "\nTarjeta Madre: ASRock A320M-HDV R4.0 (Socket AM4)"
                    + "\nMemoria Ram: Kingston ValueRAM DDR4 8GB 2400 MHz (1 modulo)"
                    + "\nAlmacenamiento: SSD Kingston A400 120GB"
                    + "\nGabinete: GenErico con soporte Micro-ATX"
                    + "\n\nEL PRECIO PUEDE VARIAR Y ESTO ES UN APROXIMADO");
       
                      continue;
            
          
            
        } else if (opcion1 >=4000 && opcion1 <=5999  ){
            System.out.println("EQUIPO RECOMENDADO CON 4000 A 5999 $MX");
            System.out.println("");
            System.out.println("Procesador: AMD Ryzen 3 3200G o Intel Core i3-12100."
                    + "\nTarjeta Madre: ASRock A320M-HDV (Socket AM4)"
                    + "\nMemoria Ram: 8GB DDR4 2666MHz o 3200MHz"
                    + "\nAlmacenamiento: SSD 240GB o 480GB SATA "
                    + "\nGabinete: Cooler Master MasterBox Q300L o DeepCool Matrexx 30"
                    + "\nTarjeta grafica: GTX 1050 TI."
                    + "\n\nEL PRECIO PUEDE VARIAR Y ESTO ES UN APROXIMADO");
       
            } else if (opcion1 >=6000 && opcion1 <=7999){
            System.out.println("EQUIPO RECOMENDADO CON 6000 A 7999 $MX");
              System.out.println("");
            System.out.println("Procesador: AMD Ryzen 5 3400G. "
                    + "\nTarjeta Madre: ASRock B450M Pro4."
                    + "\nMemoria Ram: 16GB DDR4 3000MHz o 3200MHz."
                    + "\nAlmacenamiento: SSD 480GB SATA o NVMe. "
                    + "\nGabinete: Cooler Master MasterBox Q300L o DeepCool Matrexx 30"
                    + "\nTarjeta grafica: GTX 1650"
                    + "\n\nEL PRECIO PUEDE VARIAR Y ESTO ES UN APROXIMADO");
       
        
            } else if (opcion1 >=8000 && opcion1 <=9999){
            System.out.println("EQUIPO RECOMENDADO CON 8000 A 9999 $MX");
            System.out.println("");
            System.out.println("Procesador: AMD Ryzen 5 5600G."
                    + "\nTarjeta Madre: MSI B450M PRO-VDH MAX."
                    + "\nMemoria Ram: 16GB DDR4 3200MHz."
                    + "\nAlmacenamiento: SSD 512GB NVMe. "
                    + "\nGabinete: Cooler Master MasterBox Q300L o DeepCool Matrexx 50. "
                    + "\nTarjeta grafica: GTX 1650 Super o GTX 1660."
                    + "\n\nEL PRECIO PUEDE VARIAR Y ESTO ES UN APROXIMADO");
         
             } else if (opcion1 >=10000 && opcion1 <=13999){
            System.out.println("EQUIPO RECOMENDADO CON 10000 A 13999 $MX");
            System.out.println("");
            System.out.println("Procesador: AMD Ryzen 5 7600."
                    + "\nTarjeta Madre: MSI B550M PRO-VDH."
                    + "\nMemoria Ram: 16GB DDR4 3600MHz (2x8GB)."
                    + "\nAlmacenamiento: SSD 1TB NVMe. "
                    + "\nGabinete: NZXT H510 o Cooler Master MasterBox Q500L . "
                    + "\nNVIDIA GeForce RTX 3050 o AMD Radeon RX 6600 ."
                    + "\n\nEL PRECIO PUEDE VARIAR Y ESTO ES UN APROXIMADO");
            System.out.println("");
               
               } else if (opcion1 > 14000){
            System.out.println("EQUIPO RECOMENDADO CON 14000 EN ADELANTE $MX");
            System.out.println("");
            System.out.println("Procesador: AMD Ryzen 7 7700X ."
                    + "\nTarjeta Madre: MSI B550 TOMAHAWK MAX WIFI."
                    + "\nMemoria Ram: 32GB DDR4 3600MHz (2x16GB)."
                    + "\nAlmacenamiento: SSD NVMe 1TB Gen 4. "
                    + "\nGabinete:NZXT H510 Elite o Corsair iCUE 4000X RGB. "
                    + "\nTarjeta grafica: NVIDIA GeForce RTX 4070 o AMD Radeon RX 7800 XT."
                    + "\n\nEL PRECIO PUEDE VARIAR Y ESTO ES UN APROXIMADO");
            System.out.println("");
             
               }else{
                   System.out.println("Lo sentimos tu presupuesto no es suficiente para armar una pc. Digite otra cantidad:");
                   opcion1 = scanner.nextInt();
          
        }
        
    }
  }
}
