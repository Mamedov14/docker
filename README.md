# docker

Docker — это средство упаковки, доставки и запуска приложения.
Docker Image — сборка, всё что мы упаковали, готовое к запуску приложение.
Docker Контейнер — это работающие приложение, созданное на основе Docker Image.

#### [Пример Dockerfile](https://github.com/Mamedov14/docker/blob/main/Dockerfile)

### ВСЕ КОМАНДЫ ЛУЧШЕ ПИСАТЬ С ИСПОЛЬЗОВАНИЕМ SUDO!!!

- docker images — посмотреть локальные образы
- docker ps— посмотреть контейнеры, которые работают
- docker ps -a — посмотреть контейнеры, которые имеют статус
- docker build -t  < NameTag > .  - собрать образ проекта
- docker run hello — запуск контейнера
- docker rm < ID > || < Name > - удалить контейнер
- docker rmi < ID > || < Name > - удалить образ
- docker stop < ID > || < Name > - остановить работу контейнера
- docker volume ls — посмотреть все папки
- docker volume create <name> — создать папку

+ sudo apt install docker-compose — скачать docker-compose
+ sudo docker-compose up -d — поднять проект, параметр -d запускает всё в фоновом режиме
+ sudo docker-compose down — остановить все контейнеры

Пушить на сервак можно через github или через dockerhub