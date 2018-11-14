package invenDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import invenDto.InvenDto;

public class InvenDaoImpl implements InvenDao {

	Connect connector = new Connect();

	Connection connection = connector.getConnection();
	InvenDto inventorydto = new InvenDto();
	List<InvenDto> inventorydetails = new ArrayList<InvenDto>();

	public List<InvenDto> getInventoryDetails(Integer item_no) {
		// TODO Auto-generated method stub
		try {
			Statement stmt = connection.createStatement();
			String invensql = "Select * from inventory.inventorymanagement where item_no = '" + item_no;

			ResultSet rs = stmt.executeQuery(invensql);
			while (rs.next()) {
				// Integer id = rs.getInt("item_no");
				String name = rs.getString("item_name");
				Double cprice = rs.getDouble("c_price");
				Double sprice = rs.getDouble("s_price");
				Integer qty = rs.getInt("qty");
				Double amt = rs.getDouble("tot_amt");

				// inventorydto.setItem_no(id);
				inventorydto.setItem_name(name);
				inventorydto.setC_price(cprice);
				inventorydto.setS_price(sprice);
				inventorydto.setQty(qty);
				inventorydto.setTot_amt(amt);

				inventorydetails.add(inventorydto);
				System.out.println("Inventory Details");

			}

			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return inventorydetails;
	}

	public void insertInventoryItems(String item_name, Double c_price, Double s_price) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt = connection
					.prepareStatement("Insert into inventory.inventorymanagement values (?, ?, ?)");
			pstmt.setString(2, inventorydto.getItem_name());
			pstmt.setDouble(3, inventorydto.getC_price());
			pstmt.setDouble(4, inventorydto.getS_price());
			int i = pstmt.executeUpdate();
			if (i == 1) {
				System.out.println("Added Values to Inventory");
			} else {
				System.out.println("Values not added to Inventory");
			}
			pstmt.close();
			connection.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public void updatePurchaseItems(String item_name, Integer qty) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt = connection
					.prepareStatement("Update inventory.inventorymanagement Set item_name = ?, qty = ?");
			pstmt.setString(2, inventorydto.getItem_name());
			pstmt.setInt(5, inventorydto.getQty());
			int i = pstmt.executeUpdate();
			if (i == 1) {
				System.out.println("Updated purchased items");
			} else {
				System.out.println("purchased items not updated");
			}
			pstmt.close();
			connection.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void updateSoldItems(String item_name, Integer qty) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt = connection
					.prepareStatement("Update inventory.inventorymanagement Set item_name = ?, qty = ?");
			pstmt.setString(2, inventorydto.getItem_name());
			pstmt.setInt(5, inventorydto.getQty());
			int i = pstmt.executeUpdate();
			if (i == 1) {
				System.out.println("Updated sold items");
			} else {
				System.out.println("sold items are not updated");
			}
			pstmt.close();
			connection.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public void removeItems(Integer item_no) {
		// TODO Auto-generated method stub
		try{
			Statement stmt = connection.createStatement();
			int i = stmt.executeUpdate("Delete from inventory.inventorymanagement where item_no = " +inventorydto.getItem_no());
			if(i == 1){
				System.out.println("Record deleted from inventory");
			}else{
				System.out.println("Record not deleted");
			}
			stmt.close();
			connection.close();
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}

	
	}

}
