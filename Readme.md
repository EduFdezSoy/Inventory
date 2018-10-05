Log:

**4/Octubre/2018**

    Inicio de la App
        -Creacion de pantalla de inicio.
        -Creacion de pantalla de login.

**5/Octubre/2018**
    - Modificacion de estilos de la App
        -TextView del login.
        -EditText del login.
        -Botones del login.
        -Creacion de background_shape_edittex.xml

    Creacion de hilos
        -Añadido un hilo que se crea mientras dura el logo.
        -Añadido un finalizador para el logo (para evitar que vuelva atrás).

    Refactorizaciones
        -Refactorizado el Thread.Sleep y el Runnable (Se obvia uno) gracias al método postDelayed() de [Handler](https://developer.android.com/reference/android/os/Handler).
        -Quitado los paddings de styles.xml pues mueve los items después de crearlos.