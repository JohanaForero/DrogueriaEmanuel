package com.farmacia.emanuel.mapper.request;

import com.farmacia.emanuel.dto.request.CreateProductRequest;
import com.farmacia.emanuel.entity.EntityProduct;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface IResquestProductMapper {

    @Mapping(target = "EntityProduct.idProduct", source = "CreateProductRequest.idProduct")
    @Mapping(target = "EntityProduct.name", source = "CreateProductRequest.name")
    @Mapping(target = "EntityProduct.description", source = "CreateProductRequest.description")
    @Mapping(target = "EntityProduct.price", source = "CreateProductRequest.price")
    @Mapping(target = "EntityProduct.location", source = "CreateProductRequest.location")
    @Mapping(target = "EntityProduct.amount", source = "CreateProductRequest.amount")
    @Mapping(target = "EntityProduct.expirationDate", source = "CreateProductRequest.expirationDate")
    @Mapping(target = "EntityProduct.iva", source = "CreateProductRequest.iva")
    @Mapping(target = "idProduct", ignore = true)
    EntityProduct toEntityProduct(CreateProductRequest createProductRequest);
}
