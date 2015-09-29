# Mejoras en clase `User`

## Feature#005
 
Presentar el nombre en mayúsculas.

- Interfaz:

```
public String nameUppercase();
```

## Feature#006
 
Incluir métodos con otras formas de presentar el nombre completo. Por ejemplo, para el siguiente nombre completo:
- name: Diego
- familyName: Gómez

Facilitar los siguientes formatos: `D. Gómez`, `Gómez, Diego`, `Gómez, D.`


- Interfaz:

```
public string fullNameWithInitial();
public string fullNameInverseOrder();
public string fullNameInverseOrderWithInitial();
```
