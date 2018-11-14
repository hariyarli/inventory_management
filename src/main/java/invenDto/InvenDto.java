package invenDto;

public class InvenDto {
	
	private Integer item_no;
	private String item_name;
	private Double c_price;
	private Double s_price;
	private Integer qty;
	private Double tot_amt;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((c_price == null) ? 0 : c_price.hashCode());
		result = prime * result + ((item_name == null) ? 0 : item_name.hashCode());
		result = prime * result + ((item_no == null) ? 0 : item_no.hashCode());
		result = prime * result + ((qty == null) ? 0 : qty.hashCode());
		result = prime * result + ((s_price == null) ? 0 : s_price.hashCode());
		result = prime * result + ((tot_amt == null) ? 0 : tot_amt.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvenDto other = (InvenDto) obj;
		if (c_price == null) {
			if (other.c_price != null)
				return false;
		} else if (!c_price.equals(other.c_price))
			return false;
		if (item_name == null) {
			if (other.item_name != null)
				return false;
		} else if (!item_name.equals(other.item_name))
			return false;
		if (item_no == null) {
			if (other.item_no != null)
				return false;
		} else if (!item_no.equals(other.item_no))
			return false;
		if (qty == null) {
			if (other.qty != null)
				return false;
		} else if (!qty.equals(other.qty))
			return false;
		if (s_price == null) {
			if (other.s_price != null)
				return false;
		} else if (!s_price.equals(other.s_price))
			return false;
		if (tot_amt == null) {
			if (other.tot_amt != null)
				return false;
		} else if (!tot_amt.equals(other.tot_amt))
			return false;
		return true;
	}
	public Integer getItem_no() {
		return item_no;
	}
	public void setItem_no(Integer item_no) {
		this.item_no = item_no;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public Double getC_price() {
		return c_price;
	}
	public void setC_price(Double c_price) {
		this.c_price = c_price;
	}
	public Double getS_price() {
		return s_price;
	}
	public void setS_price(Double s_price) {
		this.s_price = s_price;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Double getTot_amt() {
		return tot_amt;
	}
	public void setTot_amt(Double tot_amt) {
		this.tot_amt = tot_amt;
	}
	@Override
	public String toString() {
		return "InvenDto [item_no=" + item_no + ", item_name=" + item_name + ", c_price=" + c_price + ", s_price="
				+ s_price + ", qty=" + qty + ", tot_amt=" + tot_amt + "]";
	}
	
	

}
