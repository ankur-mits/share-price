package com.rsystems.shareprice;

public class SharePrice {
	private int shareLowPrice;
	private int shareHighPrice;
	
	
	
	public SharePrice() {
		super();
	}
	
	public SharePrice(int shareLowPrice, int shareHighPrice) {
		super();
		this.shareLowPrice = shareLowPrice;
		this.shareHighPrice = shareHighPrice;
	}

	public int getShareLowPrice() {
		return shareLowPrice;
	}

	public void setShareLowPrice(int shareLowPrice) {
		this.shareLowPrice = shareLowPrice;
	}

	public int getShareHighPrice() {
		return shareHighPrice;
	}

	public void setShareHighPrice(int shareHighPrice) {
		this.shareHighPrice = shareHighPrice;
	}
	
}
