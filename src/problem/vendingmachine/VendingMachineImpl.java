package problem.vendingmachine;

import java.util.List;

public class VendingMachineImpl implements VendingMachine {
	private Inventory<Coin> cashInventory = new Inventory<Coin>(); 
	private Inventory<Item> itemInventory = new Inventory<Item>();


	@Override
	public long selectItemAndGetPrice(Item item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertCoin(Coin coin) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Coin> refund() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bucket<Item, List<Coin>> collectItemAndChange() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

}
