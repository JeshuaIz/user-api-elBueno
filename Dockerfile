# Etapa 1: Construcción
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app

# Copiamos todo el contenido del repositorio
COPY . .

# Verificamos si los archivos existen y damos permisos
RUN ls -la && chmod +x ./mvnw

# Compilamos la aplicación de Quarkus
RUN ./mvnw package -DskipTests

# Etapa 2: Ejecución
FROM eclipse-temurin:21-jre
WORKDIR /app

# Copiamos los archivos generados por Quarkus
COPY --from=build /app/target/quarkus-app/ /app/

EXPOSE 8080

# Comando para iniciar la aplicación
CMD ["java", "-jar", "/app/quarkus-run.jar"]
