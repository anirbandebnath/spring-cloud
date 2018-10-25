# Spring cloud project with docker and consul for service discovery.
Links: 
  Project reference link: https://howtodoinjava.com/spring-cloud/consul-service-registration-discovery/
  http://www.mammatustech.com/Microservice-Service-Discovery-with-Consul
  https://www.baeldung.com/spring-cloud-consul

Git project links for reference : https://github.com/kbastani/spring-cloud-microservice-example
https://github.com/spring-cloud-samples/brewery

INFO:
bootstrap.yml : Required for docker container. Microservices running in containerized environment needs to find Consul first to boot up the application and register to consul.
Hence, bootstrap.xml(which runs before spring application is initialized).
>> https://stackoverflow.com/questions/34439201/java-spring-will-not-talk-to-consul-when-run-as-a-docker-container
>>https://stackoverflow.com/questions/38690419/spring-boot-app-fail-to-link-consul-in-docker

STEPS:
0. To build the Jar files. 
  ./mvnw package && java -jar target/spring-cloud-consul-student-service-0.0.1-SNAPSHOT.jar
  ./mvnw package && java -jar target/spring-cloud-consul-school-service-0.0.1-SNAPSHOT.jar
1. Run the docker-compose.yml (docker-cpmpose up)
2. Check helth of services. http://localhost:8500
3. In the same VM, run the curl get request.
  a. [GET call to get student details.]curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8098/getSchoolDetails/abcschool
  b. [GET call to school service which calls student-service internally discoverable via CONSUL]. curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:9098/getStudentDetailsForSchool/abcschool
  
  
