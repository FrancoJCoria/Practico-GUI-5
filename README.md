📞 Directorio Telefónico en Java

🔹 Descripción

Este proyecto implementa un Directorio Telefónico con Java y Swing, que permite gestionar contactos de manera eficiente. Cada contacto incluye DNI, nombre, apellido, ciudad y dirección, y se organiza en un TreeMap<Long, Contacto> con el teléfono como clave.

La aplicación permite agregar, buscar y eliminar contactos, así como buscar por apellido o ciudad, con validación de campos y actualización dinámica de listas en la interfaz gráfica.

💻 Tecnologías

Java 17+

Swing (GUI)

Colecciones Java: TreeMap, TreeSet, ArrayList

Iterator y estructuras dinámicas (keySet, entrySet)

⚙ Funcionalidades

Agregar contacto: Registrar un nuevo contacto con teléfono como clave.

Buscar contacto por teléfono: Retorna los datos del contacto asociado.

Buscar teléfono por apellido: Devuelve un Set<Long> de números asociados.

Buscar contactos por ciudad: Retorna un ArrayList de contactos.

Borrar contacto: Elimina un contacto por número de teléfono.

🖥 Interfaz Gráfica

frmMenuPrincipal: Contiene el directorio y listado de ciudades.

frmAgregar: Permite agregar contactos y nuevas ciudades.

frmBuscar: Lista teléfonos y carga datos al seleccionar un contacto.

frmBorrar: Lista DNIs y permite eliminar contactos.

frmBuscarClienteCiudad: Busca contactos por ciudad y muestra en tabla.

frmBuscarTelefonoPorApellido: Busca teléfonos por apellido y muestra resultados en tabla.


👥 Colaboradores

Coria Franco

Barzola Juan

Lorenzo Fernando
