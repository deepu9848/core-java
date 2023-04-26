package daraaz;

import java.util.List;

public class product {
    /*
    Product Id (long)
    SKU (String)
    Name of Product (String)
    Price of Product (Double)
    Image (List)
    Size Available -[s,m,l,xl,.xxl] => String
    Number of Stock Available (long)
    Product Detail (String)
    Vendor Id (long)
    Rating (Rating)
     */long productId;
     String sku;
     String nameOfProduct;
     double priceOfProduct;
     List images;
     String sizeAvailable;
     long numberOfStocks;
     String productDetail;
     long vendorId;
     Rating rating;


    /*

    ->Behaviours
    ->Like
    ->Share
    ->Add to Cart
    ->Buy
     */
}
