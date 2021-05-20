# home-test

## Open Endpoints

Open endpoints require no Authentication.

* [Login] : `POST /api/auth.login`

**URL** : `/api/login/`

**Method** : `GET`

**Auth required** : NO

**Data constraints**

```json
{
    "username": "[valid email address]",
    "password": "[password in plain text]"
}
```

**Data example**

```json
{
    "username": "admin",
    "password": "admin"
}
```

## Endpoints that require Authentication

* [Login] : `POST /api/place/list`

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