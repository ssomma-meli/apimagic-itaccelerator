# Proyecto base: Api Magic

El proyecto base posee todas las depencias necesarias para poder realizar el módulo Middle End.
No será necesario descargar o configurar nada. Pero puede fallar...

## Levantar el proyecto

Por simplicidad el proyecto utiliza una base de datos en memoria. 

Abrir una nueva terminal estando ubicados en el directorio raiz. Luego ejecutar:

`./scripts/levantar-db.sh`

Deberían ver algo similiar a esto:

```
[Server@3c0f93f1]: Startup sequence initiated from main() method
[Server@3c0f93f1]: Could not load properties from file
[Server@3c0f93f1]: Using cli/default properties only
[Server@3c0f93f1]: Initiating startup sequence...
[Server@3c0f93f1]: Server socket opened successfully in 9 ms.
[Server@3c0f93f1]: Database [index=0, id=0, db=file:db-api-magic, alias=db] opened successfully in 284 ms.
[Server@3c0f93f1]: Startup sequence completed in 295 ms.
[Server@3c0f93f1]: 2020-12-04 20:09:29.702 HSQLDB server 2.5.1 is online on port 9001
[Server@3c0f93f1]: To close normally, connect and execute SHUTDOWN SQL
[Server@3c0f93f1]: From command line, use [Ctrl]+[C] to abort abruptly
```

por último, tenemos que levantar la aplicación. En una pestaña diferente, nuevamente parados en el directorio
raíz, ejecutamos:

`mvn spring-boot:run`

Si todo salió bien deberían ver algo similar a esto (luego de muchas lineas de log):

```
2020-12-04 17:27:26,619 INFO  [main] org.apache.juli.logging.DirectJDKLog: Starting ProtocolHandler ["http-nio-8080"]
2020-12-04 17:27:26,640 INFO  [main] org.springframework.boot.web.embedded.tomcat.TomcatWebServer: Tomcat started on port(s): 8080 (http) with context path '/sitio'
2020-12-04 17:27:26,642 INFO  [main] org.springframework.boot.StartupInfoLogger: Started Application in 4.831 seconds (JVM running for 8.461)
```

Para probar que todo levantó correctamente hacer un [ping](http://localhost:8080/sitio/isAlive)