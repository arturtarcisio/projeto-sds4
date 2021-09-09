package com.devsuperior.dsvendas.entities.dto;

import com.devsuperior.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SellerDTO implements Serializable {

    private Long id;
    private String name;

    //Construtor para converter minha entidade Seller em SellerDTO
    public SellerDTO(Seller seller) {
        id = seller.getId();
        name = seller.getName();
    }

}
