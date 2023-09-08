# Spring Boot properties

## Categories
1. Core
2. Web
3. Security
4. Data
5. Actuator
6. Integration
7. DevTools
8. Testing

## Core:

### Log Levels severity mapping

#### Logging levels: TRACE, DEBUG, INFO, WARN, ERROR, FATAL, OFF

logging.level.org.springframework=DEBUG
<br>
logging.level.org.hibernate=TRACE
<br>
logging.level.org.luv2code=INFO 

### Log File name

logging.file.name=my-crazy-logs.log
<br>
logging.file.path=c:/myapps/demo


## Web:
### HTTP server port
server.port=7070

### Context path of the application
server.servlet.context-path=/my-silly-app

### Default HTTP session time out
server.servlet.session.timeout=15m




## Actuator

### Endpoints to include by name or wildcard
management.endpoints.web.exposure.include=*

### Endpoints. to exclude by name or wildcard
management.endpoints.web.exposure.exclude=beans,mapping

### Base path for actuator endpoints
management.endpoints.web.base-path=/actuator




## Security

### Default user name
spring.security.user.name=admin

### Password for default user
spring.security.user.password=topsecret



## Data

### JDBC URL of the db
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce

### Login username of the db
spring.datasource.username=scott

### Login password of the db
spring.datasource.password=tiger