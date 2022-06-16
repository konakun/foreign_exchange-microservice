package com.konakun.foreign_exchange.ExchangeValue;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
public class ExchangeValue {
    @Id
    @Getter private Long id;

    @Column(name="currency_from")
    @Getter private String from;

    @Column(name="currency_to")
    @Getter private String to;

    @Getter private BigDecimal conversionMultiple;
    @Setter @Getter private int port;

    public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }
}
