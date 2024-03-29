# home-test

## Install instruction'

* Install MySQL on MacOS with user/pass is ```root/admin```: follow this link https://flaviocopes.com/mysql-how-to-install/
* Create db name "travel_list" and execute sql script on source file location ```/home-test/src/main/resources/sql/travel_list.sql```

## Open Endpoints

Open endpoints require no Authentication.

* [Login] : `POST /api/auth.login`

**URL** : `/api/auth.login/`

**Method** : `GET`

**Auth required** : NO

**Data example**

```json
{
    "username": "admin",
    "password": "admin"
}
```

## Endpoints that require Authentication

* [List places] : `POST /api/place/list`

**URL** : `/api/place/list`

**Method** : `GET`

**Auth required** : YES

**Permissions required** : None

## Success Response

**Code** : `200 OK`

**Content examples**

```json
{
    "id": 1,
    "name": "Tokyo",
    "visited": 0
},
{
    "id": 2,
    "name": "Saigon",
    "visited": 1
},
{
    "id": 3,
    "name": "Hanoi",
    "visited": 1
}
```
