#**SauceDemo**

### **CheckList**

_________________________________________________________________________________________
**В данном проекте находится файл POM.xml (Project Object Model).**

**1.** Для проверки наличия обновлений библиотек, воспользуйтесь командой:
**mvn versions:display-dependency-updates**

[INFO] artifact org.testng:testng: checking for updates from central

[INFO] artifact org.seleniumhq.selenium:selenium-java: checking for updates from central

[INFO] artifact io.github.bonigarcia:webdrivermanager: checking for updates from central

[INFO] The following dependencies in Dependencies have newer versions:

[INFO]   io.github.bonigarcia:webdrivermanager ................. 5.0.0 -> 5.0.3

[INFO]   org.seleniumhq.selenium:selenium-java .............. 3.141.59 -> 4.1.1

[INFO]   org.testng:testng ....................................... 7.1.0 -> 7.5

[INFO] ------------------------------------------------------------------------

[INFO] BUILD SUCCESS

[INFO] ------------------------------------------------------------------------

[INFO] Total time:  37.454 s

[INFO] Finished at: 2022-01-12T22:47:17+03:00

[INFO] ------------------------------------------------------------------------

_______________________________________________________________________________

**2.** Для обновления всех версий библиотек в проекте, воспользуйтесь
командой:
**mvn versions:use-latest-versions**

[INFO] Major version changes allowed

[INFO] Updated org.testng:testng:jar:7.1.0 to version 7.5

[INFO] Updated org.seleniumhq.selenium:selenium-java:jar:3.141.59 to version 4.1.1

[INFO] Updated io.github.bonigarcia:webdrivermanager:jar:5.0.0 to version 5.0.3

[INFO] ------------------------------------------------------------------------

[INFO] BUILD SUCCESS

[INFO] ------------------------------------------------------------------------

[INFO] Total time:  2.073 s

[INFO] Finished at: 2022-01-12T22:51:51+03:00

[INFO] ------------------------------------------------------------------------

______________________________________________________________________________________________


**3.** Для запуска тестов, воспользуйтесь командой:
**mvn clean test -DsuiteXmlFile='src/test/resources/regression.xml'**

[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 29.093 s - in TestSuite

[INFO] Results:

[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------

[INFO] BUILD SUCCESS

[INFO] ------------------------------------------------------------------------

[INFO] Total time:  34.028 s

[INFO] Finished at: 2022-01-12T23:00:24+03:00

[INFO] ------------------------------------------------------------------------

_______________________________________________________________________________________-


**Login:**

1.Заходим на главную страницу сайта 
"https://www.saucedemo.com/"

2.Проверка ввода валидных UserName и Password.

3.Нажимаем на кноаку "Login".

**InventoryPage:**

После успешной регистрации переходим на страницу 
"https://www.saucedemo.com/inventory.html".

1.Выбираем любой продукт.

2.Нажимаем на кнопку "AddToCart".

3.Выбираем следующий продукт.

4.Нажимаем на кнопку "AddToCart".

**CartPage:**

После успешного добавления товара, переходим на страницу "https://www.saucedemo.com/cart.html".

1.Проверяем наличие в корзине двух продуктов которые мы выбрали.

2.Проверяем не изменилась ли цена после добавления в корзину.

3.Если продукт соответствует требованиям, нажимаем кнопку "checkout".
