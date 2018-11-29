package com.rsystems.shareprice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class SharePriceController {
	@Autowired
	Configuration configuration;
	
	@GetMapping(path="/shareprice")
	public SharePrice getSharePrice() {
		return new SharePrice(configuration.getLowprice(), configuration.getHighprice());
	}
}
