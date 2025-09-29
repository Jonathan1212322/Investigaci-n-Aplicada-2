# Investigaci-n-Aplicada-2
Estructura de la app  

myapi/ 

│ 
├── app/ 
│   ├── manifests/ 
│   │   └── AndroidManifest.xml        # Archivo de configuración principal de la app 
│   │ 
│   ├── kotlin+java/ 
│   │   └── com/example/myapi/ 
│   │       ├── ApiService.kt          # Interfaz de Retrofit para definir los endpoints de la API 
│   │       ├── Item.kt                # Data class para mapear los datos (modelo) 
│   │       ├── ItemAdapter.kt         # Adaptador para mostrar los items en un RecyclerView 
│   │       ├── MainActivity.kt        # Actividad principal de la aplicación 
│   │       └── RetrofitClient.kt      # Configuración del cliente Retrofit 
│   │ 
│   ├── res/ 
│   │   ├── drawable/                  # Recursos gráficos (imágenes, shapes, íconos personalizados) 
│   │   ├── layout/ 
│   │   │   ├── activity_main.xml      # Layout de la pantalla principal 
│   │   │   └── item_layout.xml        # Layout para cada item del RecyclerView 
│   │   ├── mipmap/                    # Iconos de la aplicación (launcher) 
│   │   └── values/ 
│   │       ├── colors.xml             # Definición de colores 
│   │       ├── strings.xml            # Texto y cadenas reutilizables 
│   │       └── themes/                # Archivos de tema (modo claro y oscuro) 

 
