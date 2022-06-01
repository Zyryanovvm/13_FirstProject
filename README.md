# Представляю вашему вниманию проект с набором автотестов для формы авторизации на YANDEX

## :page_with_curl: Содержание:

- <a href="#computer-сode_stack">Технологии и инструменты</a>
- <a href="#clipboard-реализованные-проверки">Реализованные проверки</a>
- <a href="#robot-сборки-в-Jenkins">Сборки в Jenkins</a>
- <a href="#keyboard-запуск-из-терминала">Запуск из терминала</a>
- <a href="#bar_chart-allure-отчет">Allure отчет</a>
- <a href="#robot-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#film_projector-видео-пример-прохождения-тестов">Видео пример прохождения тестов</a>

## :computer: Технологии и инструменты
<p align="left"> 
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

## :clipboard: Реализованные проверки
- Проверка ошибок в консоли :heavy_check_mark:
- Проверка заголовка вакансии :heavy_check_mark:
- Проверка уведомлений при вводе некорректного логина :heavy_check_mark:
- Проверка уведомлений при вводе некорректного пароля :heavy_check_mark:


## :robot: Сборки в Jenkins
### <a target="_blank" href="https://jenkins.autotests.cloud/job/qa_13-FullProject/">Параметризированная сборка в Jenkins со всеми тестами</a>
<p align="center">
<img title="Jenkins Job Run with parameters" src="images/Jenkins/Jenkins0.png">
</p>




## :keyboard: Запуск из терминала
Локальный запуск всех тестов:
```
gradle clean test
```


Удаленный запуск всех тестов:
```
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DremoteDriverUrl=https://${REMOTE_DRIVER_LOGIN}:${REMOTE_DRIVER_PASSWORD}@${REMOTE_DRIVER_URL}/wd/hub/
```



## :bar_chart: Allure отчет
- ### Общий отчет
<p align="center">
<img title="Отчеты из Allure 1" src="images/Jenkins/Jenkins1.png">
</p>

- ### Страница с проведенными тестами
<p align="center">
<img title="Отчеты из Allure 2" src="images/Jenkins/Jenkins3.png">
</p>

- ### Пример запущенного теста с параметрами (Логин - 1а. Уведомление  - "Такой логин не подойдёт")
<p align="center">
<img title="Отчеты из Allure 3" src="images/Jenkins/Jenkins2.png">
</p>

## :robot: Отчет в Telegram
- ### Telegram notification message (all results)
<p align="center">
<img title="Telegram notification message (all results)" src="images/Jenkins/Telegram.png">
</p>



## :film_projector: Видео пример прохождения тестов
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/video/video.gif">
</p>