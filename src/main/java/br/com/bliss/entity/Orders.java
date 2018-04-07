package br.com.bliss.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the pedido database table.
 * 
 */
@Entity
@Table(name = "orders")
public class Orders implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6223834324815421413L;
	public Orders() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, table="orders")
	private int id;

	@Column(name = "ORDER_DATE", nullable = false)
	private String orderDate;

	@Column(name = "ORDER_STATUS", length = 45)
	private String orderStatus;

	@Column(name = "PAYMENT_DATE")
	private String datePayment;

	@Column(name = "PAYMENT_STATUS", length = 45)
	private String paymentStatus;

	@Column(name = "SHIPPING_DATE", length = 45)
	private String shippingDate;

	@Column(name = "SHIPPING_STATUS", length = 45)
	private String shippingStatus;

	@Column(nullable = false)
	private String total;

	@Column
	private String discount;

	@Column
	private String sinal;
	
	@Column(name = "COST")
	private String cost;

	// bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name = "FK_COD_CUSTOMER", nullable = false)
	private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}


	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getDatePayment() {
		return datePayment;
	}

	public void setDatePayment(String datePayment) {
		this.datePayment = datePayment;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getShippingDate() {
		return shippingDate;
	}

	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}

	public String getShippingStatus() {
		return shippingStatus;
	}

	public void setShippingStatus(String shippingStatus) {
		this.shippingStatus = shippingStatus;
	}

	

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getSinal() {
		return sinal;
	}

	public void setSinal(String sinal) {
		this.sinal = sinal;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((datePayment == null) ? 0 : datePayment.hashCode());
		result = prime * result + ((discount == null) ? 0 : discount.hashCode());
		result = prime * result + id;
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
		result = prime * result + ((paymentStatus == null) ? 0 : paymentStatus.hashCode());
		result = prime * result + ((shippingDate == null) ? 0 : shippingDate.hashCode());
		result = prime * result + ((shippingStatus == null) ? 0 : shippingStatus.hashCode());
		result = prime * result + ((sinal == null) ? 0 : sinal.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
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
		Orders other = (Orders) obj;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (datePayment == null) {
			if (other.datePayment != null)
				return false;
		} else if (!datePayment.equals(other.datePayment))
			return false;
		if (discount == null) {
			if (other.discount != null)
				return false;
		} else if (!discount.equals(other.discount))
			return false;
		if (id != other.id)
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (orderStatus == null) {
			if (other.orderStatus != null)
				return false;
		} else if (!orderStatus.equals(other.orderStatus))
			return false;
		if (paymentStatus == null) {
			if (other.paymentStatus != null)
				return false;
		} else if (!paymentStatus.equals(other.paymentStatus))
			return false;
		if (shippingDate == null) {
			if (other.shippingDate != null)
				return false;
		} else if (!shippingDate.equals(other.shippingDate))
			return false;
		if (shippingStatus == null) {
			if (other.shippingStatus != null)
				return false;
		} else if (!shippingStatus.equals(other.shippingStatus))
			return false;
		if (sinal == null) {
			if (other.sinal != null)
				return false;
		} else if (!sinal.equals(other.sinal))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		return true;
	}

}