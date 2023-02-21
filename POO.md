#PROGRAMACION ORIENTADA A OBJETOS

##¿QUE ES POO?

La programación orientada a objetos (POO) es un paradigma de programación que se basa en la idea de modelar el mundo real a través de la definición de objetos que tienen atributos y métodos que les permiten interactuar entre sí.

##PARTES DEL POO

Las partes fundamentales de la POO son las siguientes:

1. Clases: son los moldes o plantillas que se utilizan para crear objetos. Las clases definen los atributos y métodos que tendrán los objetos que se creen a partir de ellas.

2. Objetos: son las instancias de las clases. Cada objeto tiene sus propios valores para los atributos de la clase y puede llamar a los métodos de la misma.

3. Atributos: son las características o propiedades de un objeto. Cada objeto tiene sus propios valores para los atributos de la clase.

4. Métodos: son las acciones o comportamientos que puede realizar un objeto. Los métodos definen qué puede hacer un objeto y cómo hacerlo.

5. Herencia: es un mecanismo que permite crear nuevas clases a partir de clases existentes. Una clase que hereda de otra obtiene todos los atributos y métodos de la clase padre, y puede agregar nuevos atributos y métodos propios.

6. Polimorfismo: es la capacidad de los objetos de una clase para tomar diferentes formas o comportarse de diferentes maneras. El polimorfismo se logra a través de la herencia y la implementación de interfaces.

En resumen, la POO se basa en la creación de clases que definen los atributos y métodos de los objetos que se crean a partir de ellas, y que pueden heredar de otras clases y comportarse de diferentes maneras a través del polimorfismo.

##1. CLASES

En programación orientada a objetos (POO), una clase es una plantilla que define la estructura, comportamiento y propiedades de un objeto. Las clases se utilizan para crear objetos, que son instancias concretas de la clase.

Para definir una clase en Java, se utiliza la siguiente sintaxis:

```JAVA
public class MyClass {
    // Atributos
    private int myAttribute;

    // Constructores
    public MyClass() {
        // Inicialización del objeto
    }

    // Métodos
    public void myMethod() {
        // Implementación del método
    }

    // Getters y setters
    public int getMyAttribute() {
        return myAttribute;
    }

    public void setMyAttribute(int newValue) {
        myAttribute = newValue;
    }
}
```

Aquí se puede ver que la clase se define mediante la palabra clave class, seguida del nombre de la clase (en este caso, MyClass). Después de la definición del nombre de la clase, se abren y cierran llaves que contienen la definición de la clase.

Dentro de la definición de la clase, se pueden definir atributos, constructores, métodos y getters y setters, entre otras cosas. Los atributos son las variables que describen el estado de un objeto de la clase, mientras que los métodos son las funciones que describen el comportamiento del objeto.

En la definición de la clase, también se pueden utilizar modificadores de acceso para restringir la visibilidad de los miembros de la clase. Los modificadores de acceso son public, private, protected y default (este último es el modificador por defecto si no se especifica ningún otro).

##2. OBJETOS

En programación orientada a objetos, un objeto es una instancia de una clase que representa un conjunto de datos y comportamientos. En Java, se definen los objetos creando una instancia de una clase utilizando la palabra clave new.

Por ejemplo, si tenemos una clase Person que tiene una propiedad name, podemos crear un objeto Person y asignarle un valor a la propiedad name de la siguiente manera:

```JAVA
    Person person = new Person();
    person.setName("Juan");
```
En este ejemplo, hemos creado un objeto person de la clase Person utilizando la palabra clave new. A continuación, hemos utilizado el método setName() de la clase Person para asignarle un valor a la propiedad name.

Una vez que hemos creado un objeto, podemos utilizar sus métodos y propiedades para interactuar con los datos que representa. Por ejemplo, podemos utilizar el método getName() para obtener el valor actual de la propiedad name:
```JAVA
    String name = person.getName();
```

En este ejemplo, hemos utilizado el método getName() de la clase Person para obtener el valor actual de la propiedad name del objeto person que hemos creado anteriormente.

Es importante destacar que cada objeto que se crea utilizando la palabra clave new es independiente de los demás objetos de la misma clase. Cada objeto tiene su propio conjunto de valores de propiedad y métodos de acceso y modificación.

##3. ATRIBUTOS

En Java, los atributos de una clase son las variables que definen las propiedades de los objetos creados a partir de esa clase. También se les conoce como campos o propiedades de la clase.

Para definir un atributo en una clase en Java, se utiliza la siguiente sintaxis:

```JAVA
    public class Person {
    private String name;
    private int age;
    }
```

En este ejemplo, la clase Person tiene dos atributos: name, que es de tipo String, y age, que es de tipo int. La palabra clave private indica que estos atributos solo son accesibles desde dentro de la clase, es decir, que no se pueden acceder directamente desde fuera de la clase.

Para acceder a los atributos de un objeto de la clase Person, se suelen utilizar los métodos getter y setter, que permiten obtener o modificar el valor de un atributo, respectivamente. Por ejemplo, para acceder al atributo name de un objeto person de la clase Person, podemos definir los siguientes métodos:

```JAVA

    public String getName() {
    return this.name;
    }

    public void setName(String name) {
    this.name = name;
    }

```

En este ejemplo, el método getName() devuelve el valor actual del atributo name, mientras que el método setName() asigna un nuevo valor al atributo name. La palabra clave this se utiliza para referirse al objeto actual, es decir, al objeto person en este caso.

##4. METODOS

Los métodos en Java son bloques de código que se utilizan para realizar tareas específicas en una clase. Estos métodos pueden ser llamados por otros objetos de la misma clase o por objetos externos a la clase.

La sintaxis básica de un método en Java es la siguiente:

```JAVA

    public class MiClase {
        // Atributos de la clase
        
        // Constructor de la clase
        public MiClase() {
            // Código para inicializar atributos
        }
        
        // Métodos de la clase
        public tipo_de_retorno nombre_del_metodo(parametros) {
            // Código del método
        }
    }

```

Donde:

 *public: Es un modificador de acceso que indica que el método es público y puede ser accedido desde cualquier parte del programa.
 *tipo_de_retorno: Es el tipo de dato que devuelve el método. Si el método no devuelve nada, se utiliza la palabra clave void.
 *nombre_del_metodo: Es el nombre que se le da al método.
 *parametros: Son los parámetros que recibe el método, separados por comas. Si el método no recibe parámetros, se utilizan paréntesis vacíos.
Aquí te dejo un ejemplo de un método en Java:

```JAVA

public class Persona {
    private String nombre;
    private int edad;
    
    // Constructor de la clase
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Método para imprimir los datos de la persona
    public void imprimirDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
}

```


Este método se llama imprimirDatos y no recibe parámetros. Su tipo de retorno es void porque no devuelve ningún valor, sino que simplemente imprime los datos de la persona por consola. Dentro del método se utiliza la palabra clave this para referirse a los atributos de la clase.

##5. HERENCIA

La herencia es un concepto fundamental de la programación orientada a objetos que permite definir nuevas clases basadas en clases ya existentes. En Java, se define la herencia mediante la palabra clave extends.

Por ejemplo, supongamos que queremos definir una clase Student que herede de la clase Person. Podemos hacerlo de la siguiente manera:

```JAVA

public class Student extends Person {
  private String major;
  
  public Student(String name, int age, String major) {
    super(name, age);
    this.major = major;
  }
  
  public String getMajor() {
    return this.major;
  }
  
  public void setMajor(String major) {
    this.major = major;
  }
}

```

En este ejemplo, la clase Student extiende la clase Person utilizando la palabra clave extends. Esto significa que la clase Student hereda todos los atributos y métodos públicos y protegidos de la clase Person, y puede definir sus propios atributos y métodos adicionales. En este caso, la clase Student tiene un atributo adicional major, que representa la especialidad del estudiante, y un constructor que llama al constructor de la clase Person utilizando la palabra clave super.

La herencia permite reutilizar código existente y definir nuevas clases basadas en clases ya existentes, lo que facilita el diseño y la implementación de aplicaciones complejas. Además, la herencia permite establecer relaciones entre clases y organizarlas en jerarquías, lo que puede ayudar a comprender y estructurar el diseño de una aplicación.

##6. POLIMORFISMO

En programación orientada a objetos, el polimorfismo se refiere a la capacidad de un objeto de tomar varias formas o comportarse de varias maneras en tiempo de ejecución. En otras palabras, un objeto puede ser tratado como si fuera de un tipo diferente del que se definió originalmente.

En Java, el polimorfismo se puede lograr de varias maneras, incluyendo la herencia y la implementación de interfaces. Un ejemplo de polimorfismo en Java sería si tuvieras una clase abstracta Animal con un método hacerSonido() que fueras implementado en las subclases Perro, Gato y Vaca. Luego, podrías crear un array de Animal y llamar al método hacerSonido() en cada objeto del array, sin importar si es un Perro, un Gato o una Vaca. Cada objeto tendría su propia implementación del método hacerSonido() y produciría un sonido diferente.

Aquí hay un ejemplo de código en Java que ilustra el polimorfismo mediante la herencia:

```JAVA

public abstract class Animal {
    public abstract void hacerSonido();
}

public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
}

public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}

public class Vaca extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Muuu");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[3];
        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Vaca();
        
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}

```

En este ejemplo, la clase Animal es una clase abstracta que define un método hacerSonido() sin implementación. Las clases Perro, Gato y Vaca son subclases de Animal y cada una implementa su propio método hacerSonido(). Luego, en la clase Main, se crea un array de Animal que contiene un objeto de cada una de las subclases, y se llama al método hacerSonido() en cada uno de los objetos del array mediante un bucle for-each. Como cada objeto tiene su propia implementación del método hacerSonido(), el programa produce la salida "Guau guau", "Miau" y "Muuu".

###ALGUNOS ELEMENTOS EXTRAS

###SETTERS y GETTERS

Los getters y setters son métodos de acceso que se utilizan para acceder a los atributos de una clase. Un getter es un método que devuelve el valor de un atributo, mientras que un setter es un método que establece el valor de un atributo.

En POO, es común que los atributos de una clase sean definidos como privados (es decir, solo pueden ser accedidos desde dentro de la propia clase). Esto se hace por motivos de seguridad y para mantener el encapsulamiento de la clase. Sin embargo, hay ocasiones en las que es necesario acceder a estos atributos desde otras partes del programa. En estos casos, se utilizan los getters y setters para proporcionar un acceso controlado y seguro a los atributos de la clase.

Los getters y setters también son útiles para validar los datos que se asignan a los atributos. Por ejemplo, un setter puede comprobar que el valor que se está intentando asignar a un atributo sea válido antes de aceptarlo.

En resumen, los getters y setters son una práctica común en POO para acceder y modificar los atributos de una clase de manera segura y controlada.

###CONSTRUCTOR

Un constructor en Java es un método especial que se utiliza para inicializar objetos de una clase. Se ejecuta automáticamente cuando se crea un objeto de esa clase y se encarga de asignar valores iniciales a los atributos del objeto. La sintaxis básica de un constructor en Java es la siguiente:

``` JAVA
public class MiClase {
    // Atributos de la clase
    
    // Constructor de la clase
    public MiClase() {
        // Código para inicializar atributos
    }
    
    // Métodos de la clase
}

```
Los constructores en Java tienen las siguientes características:

El nombre del constructor debe ser igual al nombre de la clase.
El constructor no tiene tipo de retorno, ni siquiera void.
Se pueden definir varios constructores en una clase, siempre y cuando tengan parámetros diferentes.
Si no se define ningún constructor, la clase tiene un constructor por defecto sin parámetros que no hace nada.
Aquí te dejo un ejemplo de un constructor en Java que recibe dos parámetros:

```JAVA
public class Persona {
    private String nombre;
    private int edad;
    
    // Constructor de la clase
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Métodos de la clase
    // ...
}
```

Este constructor recibe dos parámetros, un String para el nombre y un int para la edad. Dentro del constructor se utiliza la palabra clave this para referirse a los atributos de la clase y asignarles los valores correspondientes.





