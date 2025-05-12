package com.skyne7.conversordemonedas.modelos;

import java.util.Map;

public record TasasExchangeRate(Map<String, Double> conversion_rates) {
}
