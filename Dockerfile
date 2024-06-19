# Используем базовый образ с Java 21 и средой выполнения JRE
FROM adoptopenjdk/openjdk21:jre-21.0.0.10-alpine

# Установка рабочей директории внутри контейнера
WORKDIR /app

# Копирование JAR файла (собранного приложения) в контейнер
COPY build/libs/MATS_API_1-0.0.1-SNAPSHOT.jar app.jar

# Команда для запуска приложения в контейнере
CMD ["java", "-jar", "app.jar"]
