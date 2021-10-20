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
mvn pact:publish
```

## 5. To verify the contracts, first navigate to provider folder and then executed
``` shell
mvn pact:verify -Dpact.verifier.publishResults
```
## If maven commands does not work, make sure you see pom.xml in the same folder where you run them

## Pactflow broker UI
Failing contracts:
![broker_image](https://user-images.githubusercontent.com/4948071/138120706-e16dff2f-ab99-4573-a432-bb0b3c2ef17b.png)

Passing contracts:
![passing_pacts](https://user-images.githubusercontent.com/4948071/138121437-10e76f91-7869-4bae-bab2-1234709e0373.png)

Not verified contracts:
![not_verified](https://user-images.githubusercontent.com/4948071/138121478-6453c745-f86e-4997-9399-515b0aa1a046.png)

