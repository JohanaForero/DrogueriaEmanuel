package com.farmacia.emanuel.services;

import com.farmacia.emanuel.dto.request.CreateProductRequest;

public interface IServicePharmacist {

    void saveProduct(CreateProductRequest createProductRequest);

}
