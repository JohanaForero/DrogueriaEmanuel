package com.farmacia.emanuel.dto.request;

import java.util.Date;

public record CreateProductRequest(Long idProduct,String name,String description, double price, double codeProduct,
                                   String location,int amount, Date expirationDate, double iva) {
}
