# pact-consumer-driven-contract-testing
Demo project with Spring Boot applications

## 1. Change configuration 
Open the parent pom (the last one) and update the pactBrokerUrl/pactBrokerToken with your own. 
You can register in Pactflow.io for free account.

## 2. Check the comments in TODO

## 3. To generate the pacts navigate to consumers folders(customer_consumer/order_consumer) and execute
``` shell
mvn clean test
```
## 4. To publish the contracts in the Pactflow
``` shell
mvn pact:verify
```

## 5. To verify the contracts, first navigate to provider folder and then executed
``` shell
mvn pact:verify -Dpact.verifier.publishResults
```
## If maven commands does not work, make sure you see pom.xml in the same folder where you run them
