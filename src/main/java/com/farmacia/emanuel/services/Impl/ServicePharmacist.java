package com.farmacia.emanuel.services.Impl;

import com.farmacia.emanuel.dto.request.CreateProductRequest;
import com.farmacia.emanuel.repository.IRepositoryProduct;
import com.farmacia.emanuel.services.IServicePharmacist;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@AllArgsConstructor
@Service
public class ServicePharmacist implements IServicePharmacist {

    private final IRepositoryProduct repositoryProduct;
    @Transactional
    @Override
    public void saveProduct(CreateProductRequest createProductRequest) {

    }
}
