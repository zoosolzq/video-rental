package com.videorental;

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String title;
	private int priceCode;

	public Movie(String title, int priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(int arg) {
		priceCode = arg;
	}

	public String getTitle() {
		return title;
	}

	double getChargeFor(int daysRented) {
		double thisAmount = 0;
		switch (getPriceCode()) {
	
		case Movie.CHILDRENS:
			thisAmount += 1.5;
			if (daysRented > 3)
				thisAmount += (daysRented - 3) * 1.5;
			break;
		}
		return thisAmount;
	}

	int getFrequentRenterPointsFor(int daysRented) {
		if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
			return 2;
		else 
			return 1;
	};
}