# any-api-weatherstack-serenity

## Clone the repo by running 
```
$ git clone https://github.com/arpit28/any-api-weatherstack-serenity.git
```

## Running the tests locally
```
$ mvn clean install
```
### Access serenity reports locally
```
any-api-weatherstack-serenity/target/site/serenity/blablaSomething.html
```
## How to write test cases
> test classes will be written under below folder---
> 
>any-api-weatherstack-serenity/src/test/java/testcases
>
> And all test classes would have below tag in order to see them under serenity reports
> 
```
@RunWith(SerenityRunner.class)
```
> Each test method would have below tage
```
@Title("This is title visible as tile for for test")
   @Test
```
> any-api-weatherstack-serenity/src/test/java/steps
>package would have all the steps fore test methods
>and each would have below tag
```
@Step("This step can be written in given when then format")
```
