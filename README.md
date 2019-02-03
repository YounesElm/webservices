# Projet services web

## REST Server

- Build le projet en se rendeant à la racine de ce dernier et en exécutant le commande suivante `./mvnw spring-boot:run`
> Normalement, cette commande installe tous les packages nécessaire et execute un npm install pour accéder directement à la liste des vols

- Accéder à la liste des vols via l'url suivant : [http://localhost:8080/](http://localhost:8080/)
> De base, quand l'application se build, seul un vol est diponible, celui de " Fly Emirates "

- Vous pouvez ajouter des vols en executant la commande suivante :
`curl -X POST localhost:8080/api/flights -d "{\"brand\": \"Air France\", \"departure\": \"Thursday 25th January at 6:00pm\", \"arrival\": \"Thursday 25th January at 10:00pm\"}" -H "Content-Type:application/json"`

> Cette commande ajoutera un vol Air France, en acutalisant la liste des vols, vous pouvez voir qu'un nouveau vol apparait.

- Vous pouvez supprimer des vols en executant la commande suivante en remplacant l'id par l'id du vol : 
`curl -X DELETE localhost:8080/api/flights/{id}`

> Vous retrouverez cet id lors de la création, une réponse est retournée précisant l'url du vol crée.
  
  ## SOAP Server

`
