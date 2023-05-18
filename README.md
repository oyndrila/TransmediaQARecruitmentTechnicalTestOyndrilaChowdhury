# Transmedia QA Recruitment Technical Test Solution - Oyndrila Chowdhury


**UI Automation**

```
1. Completed Login with your user, add 1 item to the basket, click on checkout, add a new address, fill in the address form, click on submit
2. Completed search button, search for apple, verify that 2 apple products show up and that banana product doesn't show up
```

**UI Automation - Preview**

![Untitled video - Made with Clipchamp](https://github.com/oyndrila/TransmediaQARecruitmentTechnicalTestOyndrilaChowdhury/assets/40711052/5a5afa2a-3542-4e5a-a06b-703ce186b0b6)

**UI Automation - Running Guide**
1. Open the Project with Eclipse or Intellij IDEA IDE. This project is Runnable on both IDEs.
2. Made with POM Architecture
3. Test Classes are located at src/test/java/com/juiceshop/
4. To test Problem One open src/test/java/com/juiceshop/testcase/**TestCaseProblem1.java** and update the folowing variables with your Email and Password
```
private String loginUserName="YOUR_EMAIL";
private static String loginPassword="YOUR_PASSWORD";
```
5. To test Problem One open src/test/java/com/juiceshop/testcase/**TestCaseProblem2.java**


**API Automation**   
   
 ```
1. Completed Sign in the user, add 1 item to the basket, verify that 1 item is in the basket
2. Completed Sign in the user, add 2 items to the basket, delete 1 item and validate that only 1 item remains in the basket
```


Tool Used - Postman

**API Automation - Preview** 

![Untitled video - Made with Clipchamp (2)](https://github.com/oyndrila/TransmediaQARecruitmentTechnicalTestOyndrilaChowdhury/assets/40711052/c8111e50-47d6-49b6-8f32-186dec597e64)

Postman Workspace Link : https://www.postman.com/oyndrila22/workspace/transmedia-assignment-workspace/collection/5876550-1d77ae72-afc6-40b6-897a-095ebfa6b158?action=share&creator=5876550

**API Automation - Running Guide**
1. Open the workspace link from your browser
2. Fork the Transmedia "API Test Collection" to run it on your postman client, make sure to use "Juice Shop Env"
3. You can also import the collection manually from json files included in this repository . The collection and environment is available at "Api Automation - Postman Collection and Env" folder
4. After importing Run the Collection from Postman
