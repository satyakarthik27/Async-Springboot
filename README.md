input url to AppService microservice:
GET/ http://localhost:8083/fetchData

output response:
<img width="1906" height="988" alt="Screenshot 2025-11-03 132704" src="https://github.com/user-attachments/assets/3fc6ace8-8ac8-4969-a987-c9f8a5a6b14a" />

output JSON response:
{
    "users": [
        {
            "id": 1,
            "name": "Satya",
            "email": "satya@example.in"
        },
        {
            "id": 2,
            "name": "Karthik",
            "email": "karthik@example.in"
        },
        {
            "id": 3,
            "name": "Koushik",
            "email": "koushik@example.in"
        },
        {
            "id": 4,
            "name": "Pavan",
            "email": "pavan@example.in"
        },
        {
            "id": 5,
            "name": "Ram",
            "email": "ram@example.in"
        }
    ],
    "orders": [
        {
            "id": 1,
            "product": "Laptop",
            "price": 1200.0
        },
        {
            "id": 2,
            "product": "Smartphone",
            "price": 850.0
        },
        {
            "id": 3,
            "product": "Wireless Headphones",
            "price": 150.0
        },
        {
            "id": 4,
            "product": "Gaming Monitor",
            "price": 300.0
        },
        {
            "id": 5,
            "product": "Mechanical Keyboard",
            "price": 75.0
        }
    ]
}

