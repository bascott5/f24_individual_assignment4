# f24_individual_assignment4
The REST API performs CRUD operations on Animal Objects as described below.

## API Endpoints
POSTMAN is required for the following endpoints...

## Get list of Animals
### Request
```
`GET /animals/all`

`http://localhost:8080/animals/all`
```
### Response
```
[
    {
        "animalId": 1,
        "name": "Cat",
        "scientificName": "Feline",
        "species": "Mammel",
        "habitat": "Land",
        "description": null
    },
    {
        "animalId": 2,
        "name": "Penguin",
        "scientificName": "Swimming Bird",
        "species": "Bird",
        "habitat": "Snow",
        "description": null
    }
]
```

## Get a specific Animal
### Request
```
`GET /animals/{animalId}`

`http://localhost:8080/animals/1`
```
### Response
```
{
    "animalId": 1,
    "name": "Cat",
    "scientificName": "Feline",
    "species": "Mammel",
    "habitat": "Land",
    "description": null
}
```

## Create a new Animal
### Request
```
`POST /animals/new`

`http://localhost:8080/animals/new`
```
### Response
```
[
    {
        "animalId": 1,
        "name": "Cat",
        "scientificName": "Feline",
        "species": "Mammel",
        "habitat": "Land",
        "description": null
    },
    {
        "animalId": 2,
        "name": "Penguin",
        "scientificName": "Swimming Bird",
        "species": "Bird",
        "habitat": "Snow",
        "description": null
    }
]
```

## Update an existing Animal
### Request
```
`PUT /animals/update/{animalId}`

`http://localhost:8080/animals/update/1`
```
### Response
```
{
    "animalId": 1,
    "name": "Cat",
    "scientificName": "Feline",
    "species": "Mammel",
    "habitat": "Land",
    "description": null
}
```

## Delete an existing Animal
### Request
```
`DELETE /animals/delete/{animalId}`

`http://localhost:8080/animals/delete/2`
```
### Response
```
[
    {
        "animalId": 1,
        "name": "Cat",
        "scientificName": "Feline",
        "species": "Mammel",
        "habitat": "Land",
        "description": null
    }
]
```

## Get all Animals of a specific species
### Request
```
`GET /animals/species/{species}`

`http://localhost:8080/animals/species/mammel`
```
### Response
```
[
    {
        "animalId": 1,
        "name": "Cat",
        "scientificName": "Feline",
        "species": "Mammel",
        "habitat": "Land",
        "description": null
    }
]
```

## Search for Animals via string
### Request
```
`GET /animals/search/{string}`

`http://localhost:8080/animals/search/c`
```
### Response
```
[
    {
        "animalId": 1,
        "name": "Cat",
        "scientificName": "Feline",
        "species": "Mammel",
        "habitat": "Land",
        "description": null
    }
]
```
