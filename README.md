# restbucks-boot, Restbucks application built with SpringBoot.

#Build / test run options
- only the unit tests: gradle clean test
- build the project but exclude integration tests: gradle clean build -x integrationTest
- only run the integration tests: gradle clean integrationTest
- run the unit tests and integration tests: gradle clean test integrationTest
- full build including running the integration tests: gradle clean build 

#Tests
- Test reports are listed under build/reports/integrationTest and build/reports/test