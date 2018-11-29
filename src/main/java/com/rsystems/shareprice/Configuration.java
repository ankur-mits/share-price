package com.rsystems.shareprice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="share-price")
public class Configuration {
	private int lowprice;
	private int highprice;
	
	public Configuration() {
		super();
	}

	public Configuration(int lowprice, int highprice) {
		super();
		this.lowprice = lowprice;
		this.highprice = highprice;
	}

	public int getLowprice() {
		return lowprice;
	}

	public void setLowprice(int lowprice) {
		this.lowprice = lowprice;
	}

	public int getHighprice() {
		return highprice;
	}

	public void setHighprice(int highprice) {
		this.highprice = highprice;
	}
	
	
	
}
