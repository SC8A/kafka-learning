package com.appsdeveloperblog.ws.productsmicroservice.service;

import com.appsdeveloperblog.ws.productsmicroservice.rest.CreateProductRequestModel;

public interface ProductService {
    String createProduct(CreateProductRequestModel productRequestModel);

}
