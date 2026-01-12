package com.example.firstrestapi.product.support;
import org.springframework.stereotype.Component;
import com.example.firstrestapi.product.api.request.ProductRequest;
import com.example.firstrestapi.product.api.response.ProductResponse;
import com.example.firstrestapi.product.domain.Product;
import com.example.firstrestapi.product.api.request.UpdateProductRequest;


@Component
public class ProductMapper {


    public Product toProduct(ProductRequest productRequest){
        return new Product(productRequest.getName());
    }

    public Product toProduct(Product product, UpdateProductRequest updateProductRequest){
        product.setName(updateProductRequest.getName());
        return product;
    }

    public ProductResponse toProductResponse (Product product){
        return new ProductResponse(product.getId(), product.getName());
    }

}
