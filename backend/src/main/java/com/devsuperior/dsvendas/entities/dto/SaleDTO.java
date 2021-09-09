package com.devsuperior.dsvendas.entities.dto;

import com.devsuperior.dsvendas.entities.Sale;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaleDTO implements Serializable {

    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    private SellerDTO sellerDTO;

    public SaleDTO(Sale sale) {
        id = sale.getId();
        visited = sale.getVisited();
        deals = sale.getDeals();
        amount = sale.getAmount();
        date = sale.getDate();
        sellerDTO = new SellerDTO(sale.getSeller());
    }
}
