# ooc-shop

![alt text](/UML.jpeg)

![alt text](/flowchart.jpg)

#### GET - to view all items stored in database (you do not need to be logged in):
 
```
http://localhost:8080/item/get
```

#### POST - to register:
 
```
http://localhost:8080/register/add?username=wit&password=1234&email=test&address=salaya
```

#### POST - to login:
 
```
http://localhost:8080/login?username=wit&password=1234
```

#### GET - to view user's username:
 
```
http://localhost:8080/user/info
```

#### POST - to add item to user's cart:
 
```
http://localhost:8080/cart/add?itemid=1
```

#### GET - to view user's cart:
 
```
http://localhost:8080/cart/list
```

#### POST - to remove an item from user's cart by item id:
 
```
http://localhost:8080/cart/remove?itemid=1
```

#### POST - to clear user's cart:
 
```
http://localhost:8080/cart/checkout
```

#### POST - to remove an item from user's cart:
 
```
http://localhost:8080/cart/clear
```

#### POST - checkout, clearing the cart and send bill to database:
 
```
http://localhost:8080/cart/checkout
```

#### POST - to add an item to database:
 
```
http://localhost:8080/item/add?product_name=test&image=/&description=test&price=10
```
