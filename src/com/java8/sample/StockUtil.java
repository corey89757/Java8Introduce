package com.java8.sample;

import java.util.function.Predicate;

public class StockUtil {
  public static StockInfo getPrice(final String ticker) {
    System.out.println("getPrice::ticker:"+ticker);
    return new StockInfo(ticker, YahooFinance.getPrice(ticker, false));
  }

  public static Predicate<StockInfo> isPriceLessThan(final double price) {
    System.out.println("isPriceLessThan::"+price);
    return stockInfo -> stockInfo.price < price;
  }

  public static StockInfo pickHigh(
    final StockInfo stockInfo1, final StockInfo stockInfo2) {
      
    return stockInfo1.price > stockInfo2.price ? stockInfo1 : stockInfo2;
  }
}
