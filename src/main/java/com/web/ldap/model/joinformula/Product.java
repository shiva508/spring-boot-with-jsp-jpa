package com.web.ldap.model.joinformula;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.JoinFormula;


@Entity
@Table
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product", orphanRemoval = true)
    private List<Price> prices = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinFormula(
        "(SELECT id FROM price ORDER BY createdOn DESC LIMIT 1)"
    )
    private Price latestPrice;

    public void setName(String name) {
        this.name = name;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void addPrice(BigDecimal priceValue) {
        Price price = new Price();
        price.setPrice(priceValue);
        prices.add(price);
        price.setProduct(this);
        latestPrice = price;
    }

    public Price getLatestPrice() {
        return latestPrice;
    }

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", prices=" + prices + ", latestPrice=" + latestPrice + "]";
	}
    
    
}
