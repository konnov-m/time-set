# Stage 1: Build the application
FROM maven:3.8.5-openjdk-17 AS build

# Устанавливаем рабочую директорию в контейнере
WORKDIR /time-set

# Копируем родительский POM
COPY pom.xml /time-set/pom.xml

RUN cat /time-set/pom.xml

# Копируем текущий POM
COPY user-service/pom.xml /time-set/user-service/pom.xml

# Копируем исходные файлы проекта
COPY user-service/src /time-set/user-service/src

# Переход в директорию проекта
WORKDIR /time-set

RUN ls -l /time-set/user-service
RUN cat /time-set/user-service/pom.xml

# Скачиваем зависимости и собираем проект
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM openjdk:17-jdk-alpine

# Устанавливаем рабочую директорию в контейнере
WORKDIR /time-set

# Копируем собранный .jar файл из этапа сборки
COPY --from=build /time-set/user-service/target/user-service-0.0.1-SNAPSHOT.jar user-service-0.0.1-SNAPSHOT.jar

# Устанавливаем точку входа
ENTRYPOINT ["java", "-jar", "/time-set/user-service-0.0.1-SNAPSHOT.jar"]
