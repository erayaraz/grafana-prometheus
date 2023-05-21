# Grafana-Prometheus

## Getting Started
To run this project on your local machine, follow the steps below.

## Prerequisites
* Make sure Docker is installed.
## Installation
1. Clone this project:

git clone <repository_link>

2. Navigate to the project directory:

cd <project_directory>

3. Run the following command to start the Docker containers:

docker-compose up

4. You can access the application using the following links:
* Prometheus: http://localhost:9090
![WhatsApp Image 2023-05-21 at 22 35 16](https://github.com/erayaraz/grafana-prometheus/assets/47903345/5fcdd911-95b1-4e0a-a887-cc25963f87aa)
* Grafana: http://localhost:3000
![WhatsApp Image 2023-05-21 at 22 35 17](https://github.com/erayaraz/grafana-prometheus/assets/47903345/7ce350d6-da27-4207-9e39-b84dc00c6a05)
* Micrometer Example: http://localhost:8080
![WhatsApp Image 2023-05-21 at 22 35 16 (1)](https://github.com/erayaraz/grafana-prometheus/assets/47903345/52891549-8301-4b86-b80d-d561cf2ca853)

# Configuration
The Docker network consists of the following components:

* prometheus: Uses the official Prometheus Docker image. It forwards port 9090 to your local machine and links the prometheus.yml configuration file with the prometheus.yml file in the root directory of the project.

* grafana: Uses the official Grafana Docker image. It forwards port 3000 to your local machine and sets the admin password using the GF_SECURITY_ADMIN_PASSWORD environment variable.

* micrometer_example: This component compiles the project source code into a Docker container and forwards port 8080 to your local machine. It has a dependency on prometheus.

# License
This project is licensed under the MIT License. For more information, please see the LICENSE file.
