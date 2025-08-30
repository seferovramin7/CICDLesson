
![CI](https://github.com/Milzon1010/CICDLesson/actions/workflows/ci.yml/badge.svg)

“Jangan commit private key; pakai GitHub Secrets.” 
GitHub
# Local run
./gradlew bootRun
# Build jar
./gradlew bootJar
java -jar build/libs/*.jar

endpoint:

/ → “Hellooooo, World!”

/api/hello → JSON message

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]

./gradlew bootJar
docker build -t cicdlesson .
docker run -p 8080:8080 cicdlesson

# CICDLesson

![CI](https://github.com/Milzon1010/CICDLesson/actions/workflows/ci.yml/badge.svg)

Spring Boot “Hello World” yang dipakai untuk latihan CI/CD (GitHub Codespaces + Gradle + JDK 21).

## Requirements
- Java 17+ (disarankan 21)
- Gradle Wrapper (sudah ada `./gradlew`)

## Run Lokal
```bash
./gradlew bootRun

Test
./gradlew test

Docker (opsional)
./gradlew bootJar
docker build -t cicdlesson .
docker run -p 8080:8080 cicdlesson
