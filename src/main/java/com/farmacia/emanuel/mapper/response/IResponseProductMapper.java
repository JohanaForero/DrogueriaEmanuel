package com.farmacia.emanuel.mapper.response;

import com.farmacia.emanuel.dto.response.ResponseCreateProduct;
import com.farmacia.emanuel.entity.EntityProduct;
import org.mapstruct.Mapper;

@Mapper
public interface IResponseProductMapper {
    ResponseCreateProduct toModelProduct(EntityProduct productEntity);
}
