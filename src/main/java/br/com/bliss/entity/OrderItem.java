package br.com.bliss.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the item_pedido database table.
 * 
 */
@Entity
@Table(name="ORDER_ITEM")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemPK id;

	private int quantity;

	public OrderItem() {
	}

	public OrderItemPK getId() {
		return this.id;
	}

	public void setId(OrderItemPK id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}