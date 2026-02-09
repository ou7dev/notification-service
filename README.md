# Notification Service

This service is a component of the Clean Architecture + Event Driven (Kafka) project. It acts as a **Consumer** service that listens to events from the `student-service`.

## 🚀 Functionality

- **Kafka Consumer**: Listens to the `student-topic`.
- **Action**: Logs received student messages to the console.

## 🛠 Tech Stack

- **Java 17**
- **Spring Boot 3+**
- **Spring Kafka**

## ⚙️ Configuration

The service is configured in `src/main/resources/application.properties`:

- **Server Port**: `8081` (Default)
- **Kafka Bootstrap Servers**: `localhost:9092`
- **Consumer Group ID**: `student-group`
- **Topic**: `student-topic`

## 🏁 How to Run

### 1. Start Infrastructure
Ensure Kafka and Zookeeper are running (usually via Docker Compose in the `student-service` or root directory).

### 2. Build the Service
```bash
mvn clean install
```

### 3. Run the Service
```bash
mvn spring-boot:run
```

## 🧪 Verification
Once running, this service will print incoming messages from the `student-topic` to the console:
```
Received message: {"name": "...", ...}
```
