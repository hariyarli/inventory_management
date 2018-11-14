package invenSer;

import java.util.ArrayList;
import java.util.List;

import invenDao.InvenDao;
import invenDao.InvenDaoImpl;
import invenDto.InvenDto;

public class InvenServImpl implements InvenServ {
	InvenDao invdao = new InvenDaoImpl();
	List<InvenDto> invdto = new ArrayList<InvenDto>();

	public List<InvenDto> getInventoryDetails(Integer item_no) {
		// TODO Auto-generated method stub
		invdto = invdao.getInventoryDetails(item_no);
		return invdto;
	}

	public void createInvenItems(String item_name, Double c_price, Double s_price) {
		// TODO Auto-generated method stub
		invdao.insertInventoryItems(item_name, c_price, s_price);

	}

	public void updateBuyItems(String item_name, Integer qty) {
		// TODO Auto-generated method stub
		invdao.updatePurchaseItems(item_name, qty);

	}

	public void updateSellItems(String item_name, Integer qty) {
		// TODO Auto-generated method stub
		invdao.updateSoldItems(item_name, qty);

	}

	public void deleteItems(Integer item_no) {
		// TODO Auto-generated method stub
		invdao.removeItems(item_no);

	}

}
