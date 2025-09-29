# Investigaci-n-Aplicada-2
Estructura de la app  

myapi/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/myapi/
│   │   │   │   ├── api/
│   │   │   │   │   ├── ApiService.kt          # Interfaz de Retrofit para endpoints de la API
│   │   │   │   │   └── RetrofitClient.kt      # Configuración del cliente Retrofit
│   │   │   │   ├── adapter/
│   │   │   │   │   └── ItemAdapter.kt         # Adaptador para RecyclerView
│   │   │   │   ├── model/
│   │   │   │   │   └── Item.kt                # Data class para mapear datos (modelo)
│   │   │   │   └── ui/
│   │   │   │       └── MainActivity.kt        # Actividad principal de la aplicación
│   │   │   ├── res/
│   │   │   │   ├── drawable/                  # Recursos gráficos
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml      # Layout de la pantalla principal
│   │   │   │   │   └── item_layout.xml        # Layout para cada item del RecyclerView
│   │   │   │   ├── mipmap/                    # Iconos de la aplicación
│   │   │   │   └── values/
│   │   │   │       ├── colors.xml             # Definición de colores
│   │   │   │       ├── strings.xml            # Textos y cadenas reutilizables
│   │   │   │       └── themes/
│   │   │   │           ├── themes.xml         # Tema modo claro
│   │   │   │           └── themes.xml (night) # Tema modo oscuro
│   │   │   └── AndroidManifest.xml            # Configuración principal de la app
│   │   └── test/                              # Pruebas unitarias
│   ├── build.gradle.kts                       # Configuración de dependencias
│   └── proguard-rules.pro                     # Reglas de ofuscación
├── gradle/
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── build.gradle.kts                           # Configuración general del proyecto
├── settings.gradle.kts                        # Configuración de módulos
├── gradle.properties                          # Propiedades de Gradle
└── gradlew                                    # Script de Gradle para Unix
