# Generic Data Ingestion Framework

This is a generic, extensible Java framework to ingest data from various sources (e.g., REST APIs) and send to various sinks (e.g., Kafka).

## Features
- Modular connector interfaces for sources and sinks
- Sample REST API source connector
- Sample Kafka sink connector
- Configurable pipeline runner

## How to run
- Configure your source and sink in `Main.java`
- Build using Maven:
  ```
  mvn clean package
  ```
- Run the main class:
  ```
  java -cp target/generic-data-ingestion-framework-1.0-SNAPSHOT.jar Main
  ```

## Extending
Add new connectors by implementing `SourceConnector` or `SinkConnector`.

## License
MIT License
