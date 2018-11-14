package invenSer;

import java.util.List;

import invenDto.InvenDto;

public interface InvenServ {

	public List<InvenDto> getInventoryDetails(Integer item_no);
	public void createInvenItems(String item_name, Double c_price, Double s_price);
	public void updateBuyItems(String item_name, Integer qty);
	public void updateSellItems(String item_name, Integer qty);
	public void deleteItems(Integer item_no);
}
