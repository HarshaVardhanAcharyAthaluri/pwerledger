# pwerledger

## Environment
* Java 11
* Maven 

## How to run
* Check out the code from git
* By Using STS 
  - Import code as existing maven project and right click on project select run as SpringBoot Application 

* By Using Maven
   - Run mvn install
   - Run mvn spring-boot:run
* Ponts to be Noted
  - Using Inmemeory Database i.e H2 avilabe at http://localhost:8080/h2-console
  - Useing Swagger documents, So that we can get all Rest documentation and Testing feature on http://localhost:8080/swagger-ui.html
* Endpoints
  - @GetMapping("/powerledgers") -> Gives all the PowerLedgers
  - @PostMapping("/powerledger/add")
     RequestBody `{
      "postCodes": 0,
      "subUrbName": "string"
    }`
   - @GetMapping("/suburbnames") with Request params fromPassCode=1 & toPasscode=2 to return the suburbnames sorted by name with in the range of PassCodes as well as total number characters count of all suburbnames
