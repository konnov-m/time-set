# Stage 1: Build the application
FROM maven:3.8.5-openjdk-17 AS build

# Устанавливаем рабочую директорию в контейнере
WORKDIR /time-set

# Копируем родительский POM
COPY pom.xml /time-set/pom.xml

RUN cat /time-set/pom.xml

# Копируем текущий POM
COPY events-service/pom.xml /time-set/events-service/pom.xml

# Копируем исходные файлы проекта
COPY events-service/src /time-set/events-service/src

# Переход в директорию проекта
WORKDIR /time-set/events-service

RUN ls -l /time-set/events-service
RUN cat /time-set/events-service/pom.xml

# Скачиваем зависимости и собираем проект
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM openjdk:17-jdk-alpine

# Устанавливаем рабочую директорию в контейнере
WORKDIR /time-set

# Копируем собранный .jar файл из этапа сборки
COPY --from=build /time-set/events-service/target/events-0.0.1-SNAPSHOT.jar events-0.0.1-SNAPSHOT.jar

# Устанавливаем точку входа
ENTRYPOINT ["java", "-jar", "/time-set/events-0.0.1-SNAPSHOT.jar"]
