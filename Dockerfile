# Используем базовый образ с Java 21 и средой выполнения JRE
FROM eclipse-temurin:21-jre-alpine

# Установка рабочей директории внутри контейнера
WORKDIR /app

# Копируем файл JAR в контейнер
COPY build/libs/mats-0.0.1-SNAPSHOT.jar /app/mats-api.jar

# Указываем команду для запуска приложения
CMD ["java", "-jar", "mats-api.jar"]
