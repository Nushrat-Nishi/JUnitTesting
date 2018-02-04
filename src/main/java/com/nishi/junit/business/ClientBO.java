package com.nishi.junit.business;

import java.util.List;

import com.nishi.junit.business.exception.DifferentCurrenciesException;
import com.nishi.junit.model.Amount;
import com.nishi.junit.model.Product;

public interface ClientBO {

	Amount getClientProductsSum(List<Product> products)
			throws DifferentCurrenciesException;

}