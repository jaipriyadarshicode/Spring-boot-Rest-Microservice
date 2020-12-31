package com.udacity.pricing;

import com.udacity.pricing.entity.Price;
import com.udacity.pricing.repository.PriceRepository;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PricingServiceApplicationTests {


	@Autowired
	private PriceRepository priceRepository;

	@Before
	public void initDBRec(){
		Price price = new Price(1L, "USD", new BigDecimal(10000.00));
		priceRepository.save(price);
	}
	@Test
	public void contextLoads() {
	}

	@Test
	public void getPricesByID() throws Exception{
		BigDecimal price = priceRepository.findById(1L).get().getPrice();
		Assertions.assertThat(price).isEqualTo(price);
   	}
}
