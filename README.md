
 - упаковуватись у виконуваний FatJar .jar файл з назвою myname.jar, якщо виконуються команди mvn package та gradle jar для Maven та Gradle проєктів відповідно

 - при запуску командою java -jar myname.jar має вивести в консоль твоє ім'я та прізвище на англійській мові JSON об'єктом, де окремо - ім'я, окремо - прізвище. Наприклад {"name": "Igor", "lastName": "Petrenko"}. Для формування JSON рядка використовуй будь-яку сторонню бібліотеку з Maven Central (наприклад, GSON)
 - у проєкті має бути коректно налаштований файл .gitignore