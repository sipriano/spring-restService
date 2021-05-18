#Spring API

Simple example of how to use Java with the spring framework.

The API connects to a PostgreSQL database and return a select from the table as a list and then send to the client as JSON.

The project uses Maven to manage all its dependencies and runs on a containerized environment, using Docker.

To build the project use the command "docker build . -t docker/spring:latest -t docker/spring:v1.0"

With Helm installed and a Kubernetes environment, then run the command "helm install spring-example  ./spring --namespace hello"

This project also contains ans Azure pipeline configuration file, to build and deploy the application in an automated CI/CD pipeline.