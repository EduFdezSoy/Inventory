# Log:

### 4/Octubre/2018

   **Inicio de la App**   
&nbsp;&nbsp; - Creacion de pantalla de inicio.  
&nbsp;&nbsp; - Creacion de pantalla de login.  

### 5/Octubre/2018  
   **Modificacion de estilos de la App**  
&nbsp;&nbsp; - TextView del login.  
&nbsp;&nbsp; - EditText del login.  
&nbsp;&nbsp; - Botones del login.  
&nbsp;&nbsp; - Creacion de background_shape_edittex.xml  

   **Creacion de hilos**  
&nbsp;&nbsp; - Añadido un hilo que se crea mientras dura el logo.  
&nbsp;&nbsp; - Añadido un finalizador para el logo (para evitar que vuelva atrás).  

   **Refactorizaciones**  
&nbsp;&nbsp; - Refactorizado el Thread.Sleep y el Runnable (Se obvia uno) gracias al método postDelayed() de [Handler](https://developer.android.com/reference/android/os/Handler).  
&nbsp;&nbsp; - Quitado los paddings de styles.xml pues mueve los items después de crearlos.  

### 8/OCtubre/2018
   **Modificacion de estilos de la App**  
&nbsp;&nbsp; - Añadido el nuevo icono, y estilos de los botones, se usa la siguiente [Herramienta](http://romannurik.github.io/AndroidAssetStudio/index.html).    
  
 ### 9/OCtubre/2018 (CASA)  
   **Modificacion de estilos de la App** 
&nbsp;&nbsp; - Añadido el estilo para el checkbox de Activity_login.xml.  


 ### 10/OCtubre/2018  
   **Creacion de nueva Activity (activity_login_relativelayoud.xml)**  
&nbsp;&nbsp; - Creacion del Activity.  
&nbsp;&nbsp; - Se añaden los componentes.  

 ### 11/OCtubre/2018  
   **Creacion de nueva Activity (activity_dash_board.xml)**  
&nbsp;&nbsp; - Creacion del Activity.  
&nbsp;&nbsp; - Se añaden los componentes.   

 ### 15/OCtubre/2018  
   **Creacion de otro tipo de Activity (Con android.support.v7.widget.GridLayout)**  
&nbsp;&nbsp; - Muestra de otra forma de hacer el dashboard con [support.GridLayout](https://developer.android.com/reference/android/support/v7/widget/GridLayout). Ejemplo de uso[aquí](https://github.com/JDamianCabello/SupportGridLayout.git).  
&nbsp;&nbsp; - Creación de DependencyEditActivity.  

#### TODO LIST:  
-Acabar dashboard.  
-Dar nombre en strings a todos los componentes de DependencyEditActivity.  
-Poner un padding de 5dp a los tables rows (ponerla en dimens).  
  
  
