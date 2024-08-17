from eclipse-temurin:17
copy target/lifes.jar lifes.jar
cmd ["java","-jar","lifes.jar"]