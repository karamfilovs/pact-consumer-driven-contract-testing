# pact-consumer-driven-contract-testing
Demo project with Spring Boot applications

## Open the parent pom (the last one) and update the pactBrokerUrl/pactBrokerToken with your own. 
You can register in Pactflow.io for free account.

## Check the comments in TODO

## To generate the pacts navigate to consumers module and execute
``` shell
mvn clean test
```
## To publish the contracts in the Pactflow
``` shell
mvn pact:verify
```

## To verify the contracts, first navigate to provider folder and then executed
``` shell
mvn pact:verify -Dpact.verifier.publishResults
```
