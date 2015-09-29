# Mejoras en clase `Point`

## Feature#001
 
Añadir una tercera coordenada, haciendo que los puntos sean tridimensionales (x,y,z). Se deberán modificar todos los métodos involucrados y sus respectivos tests.

- Interfaz:

```
public Point(int x, int y, int z);
public Point(int xyz);
public Point();
public int getX();
public int getY();
public int getZ();
public double module();
public double phase();
public void translateOrigin(Point origin);
public String toString();
```

## Feature#002

Permitir la modificación de las coordenadas en tiempo de ejecución. Para ello añadir los `getters` y los `setters` correspondientes.

- Interfaz:

```
public void setX(double nuevoPunto);
public void setY(double nuevoPunto);
public void setZ(double nuevoPunto);
```
