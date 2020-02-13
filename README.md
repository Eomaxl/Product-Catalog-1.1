# Product-Catalog-1.1

A Spring boot application which cna be used to add products and fetch them using the product id. It is mononlithic applciation where 
three services i.e. adding the product, fetching all the product and fetching the product using it's productId can be consumed.
Module used for building this application are:
  Spring Boot
  Spring H2 Database ( In-Memory database)
  Spring JPA Repository
  
  Urls:
  
  Fetch all the products : http://localhost:8080/products
  Fetch the product using the productId: http://localhost:8080/products/{productId}
  Add a product to the database : http://localhost:8080/products
  
  JSON sample data:
  
  {
    'productId':'B410047',
    'productName:'',
    'productBrand':
    'productPrice:,
    'productSize':,
    'productColor':,
    'productSeller':
  }
  
