package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer_details")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
	@Id
	@Column(name = "customer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int cust_id;

	@Column(name = "customer_name", length = 20, unique = true, nullable = false)
	@OrderBy("cust_name DESC")
	private String cust_name;
	
	private String password;
	
	@Temporal(TemporalType.DATE)
	private Date doj;

}
