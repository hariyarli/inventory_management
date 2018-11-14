package invenDao;

import java.util.List;

import invenDto.InvenDto;

public interface InvenDao {
	public List<InvenDto> getInventoryDetails(Integer item_no);
	public void insertInventoryItems(String item_name, Double c_price, Double s_price);
	public void updatePurchaseItems(String item_name, Integer qty);
	public void updateSoldItems(String item_name, Integer qty);
	public void removeItems(Integer item_no);
}
