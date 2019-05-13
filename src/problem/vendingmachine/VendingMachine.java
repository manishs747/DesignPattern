package problem.vendingmachine;

import java.util.List;

//https://javarevisited.blogspot.com/2016/06/design-vending-machine-in-java.html

public interface VendingMachine {
	public long selectItemAndGetPrice(Item item);
	public void insertCoin(Coin coin);
	public List<Coin> refund();
	public Bucket<Item, List<Coin>> collectItemAndChange();  
	public void reset();
}
