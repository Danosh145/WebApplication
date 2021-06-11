# WebApplication
Stačí nakonfigurovat connection string k postgres databázi a po spuštění webapp se vytvoří entita Univerzity do které se se nahrajou 4 záznamy z config package.

U posledního bodu požadavku na REST endpoint jsem záznamy místo do json vypsal a upravil do view layeru pomocí Thymeleaf tak doufám, že to tolik vadit nebude. Ten kód by se nijak zvlášť nelišil až na to, co ty metody v controlleru vrací a místo @Controller anotace by byla @RestController.

url na vypsání všech záznamů:
http://localhost:port/

url na vypsání jednoho záznamu podle id:
http://localhost:port/university/id

url form pro přidání záznamu:
http://localhost:port/signup
