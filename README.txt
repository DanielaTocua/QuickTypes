# QuickTypes

Por:  Diego Efrain Mojica Mendez, Diana Valentina Monroy Molina y  Daniela Tocua Perilla 

QuickTypes es un  DSL que permite generar archivos de Typescript de manera sencilla y rápida. Con QuickTypes podrás inicializar los servicios de tu API en cuestión de minutos. 

## Dependencias
- node
- expressjs 
- postgres
- typeorm (postgres)
- class-validator
- class-transformer 

## Características
- Generación de Entidades de Postgresql
- Generación de DTOS (Data Transfer Objects) definidos por el usuario
- Generación automática de servicios de CRUD a partir de entidades definidas por el usuario

## Instalación

Puedes clonar el repositorio de QuickTypes clonando el siguiente repositorio:

```bash
git clone https://github.com/DanielaTocua/QuickTypes.git

```
o desde GitHub CLI usando 

```bash
gh repo clone DanielaTocua/QuickTypes

```
## Uso

### Configuración Inicial
El objetivo principal de QuickTypes es permitir una fácil inicialización de una API teniendo en cuenta una arquitectura de capas. Teniendo esto en cuenta, QuickTypes **no** genera una aplicación en typescript, sino una serie de archivos que exponen **entidades, DTOs y servicios CRUD** . Esto implica que el usuario debe tener un entorno de Typescript y Postgres configurado.

Si no lo tiene, no se preocupe, en el siguiente repositorio encontrará uno que funciona de manera compatible con QuickTypes:

[DanielaTocua/quicktypesTSTemplate](https://github.com/DanielaTocua/quicktypesTSTemplate)

### Primeros Pasos en QuickTypes

QuickTypes tiene dos operaciones básicas: Definición (**New**) y Generación (**Generate**). 

#### Definición (New)

Los objetos básicos en QuickTypes son las entidades, puesto que los DTO's y los servicios se generan con base en ellas. Puede definir una entidad usando la sentencia **New** ***Entity*** [nombre de la entidad]

```
New Entity Person {  
	properties {  
	number id :{ primary, generated},  
	string name ,  
	string lastname,  
	string email : {validate:{IsEmail}, unique} 
	number age 
	}  
}
```
Person es el nombre de nuestra entidad, esta tiene las propiedades (columnas) id, name, lastname y  email. El tipo de dato (string, number o boolean) se define antes de cada nombre de columna, y esta se recomienda que se escriba en snake_case, por la falta de     case-sensitivity de Postgres. 
Cada columna puede tener propiedades como:
- primary
- generated
- nullable 
- default : valor
- length (para el caso de los strings) 
- validate :   {[validaciones]}

Esta última propiedad nos permite definir validaciones que se tomarán en cuenta en la generación de DTOs

Se cuenta con variedad de validaciones dependientes de class-validator, como:
- IsEmail
- Max
- Min
- IsPositive
- IsNegative
- IsBooleanString
- IsDateString
- IsNumberString
- IsAlpha
- IsAlphanumeric
- MinLength
- MaxLength


Después de las propiedades, se deben definir las relaciones. Estas se definen primero con el tipo de relación (de typeorm) que se requiere, el nombre de la tabla a relacionar, seguido de las columnas de relación (ver ejemplo) , y se pueden definir dos propiedades:

- nullable
- onDelete : ['restrict' | 'cascade' | 'setNull']

Un ejemplo de relaciones a continuación:
```
New Entity Animal {
    properties {
        number id :{ primary, generated},
        string name,
        string breed,
        number age ,
        number owner_id
    }
    relations {
        ManyToOne Person (owner_id, id): {
            onDelete: cascade
        }
    }
}
```
También se pueden definir DTOs personalizados, para generarlos futuramente, de la siguiente manera 

New Animal DTO ToAdopt {
    strict age: {Max: 8, Min:2},
    flexible breed: {IsAlphanumeric}
}


En este paso se usan 3 palabras reservadas:
- strict: Implica que esta columna será requerida y contendrá todas las validaciones definidas desde la entidad
- flexible: Implica que esta columna es opcional y contendrá todas las validaciones definidas desde la entidad
- none: implica que esta columna no tendrá ninguna validación por defecto, solamente las que asigne el usuario 

#### Generación (Generate)
Luego de definir las entidades deseadas, y los DTOs que querramos generar, podemos usar **Generate** para crear su correspondiente archivo 
```
Generate Entity User
Generate User DTO Login 
```

Esto generará los archivos correspondientes a esas definiciones


//TODO: Generación de Servicios
### Integración con un proyecto 
Una vez se generen las carpetas  dentro de TS-Gen, se deberán copiar y pegar estas (o los archivos que desee el usuario dentro de la carpeta src del proyecto en Typescript
finalmente se deben agregar las rutas a la App de Express.

Ejecuta el proyecto y accede a las rutas 
```
- GET /:id para obtener un dato específico 
- POST / para crear un nuevo dato
- PUT /:id para modificar un dato
- DELETE /:id para borrar un dato 
```



## Referencias

Middleware de Validación: https://www.linkedin.com/pulse/dto-json-payload-expressjs-validation-middleware-imran-younas/

Plantilla adaptada y arquitectura de capas adaptadas de: [Andres930410/is2-backend (github.com)](https://github.com/Andres930410/is2-backend)

