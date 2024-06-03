Для запуска предлагается следующее:\
  1)Создадим в контейнере docker базу данных:\
    Для этого убедитесь введите команду, которая создаст и запустит в фоновом режиме нужный контейнер.\
    Команда: docker run --name tech_db -p 5431:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=postgres -d postgres\
    Если имя tech_db уже занято, то в исходной команде замените tech_db на любое незанятое имя\
  2)Запустите приложение командой: mvn spring-boot:run\
