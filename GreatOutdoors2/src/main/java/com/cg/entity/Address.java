package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
	@Entity
	@Table(name="AddressDetails")
	public class Address {
		public Address()
		{
			
		}
		
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		private Long AddressId;
		@Column
		private String city;
		@Column
		private String state;
		@Column
		private String Zip;
		@Column
		private String buildingNo;
		@Column
		private String feild;
		@ManyToOne(targetEntity = User.class)
		@JoinColumn(name = "UserId",nullable = false)
		private User user;
		public Long getAddressId() {
			return AddressId;
		}
		public void setAddressId(Long addressId) {
			AddressId = addressId;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getZip() {
			return Zip;
		}
		public void setZip(String zip) {
			Zip = zip;
		}
		public String getBuildingNo() {
			return buildingNo;
		}
		public void setBuildingNo(String buildingNo) {
			this.buildingNo = buildingNo;
		}
		public String getFeild() {
			return feild;
		}
		public void setFeild(String feild) {
			this.feild = feild;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public Address(Long addressId, String city, String state, String zip, String buildingNo, String feild,
				User user) {
			super();
			AddressId = addressId;
			this.city = city;
			this.state = state;
			Zip = zip;
			this.buildingNo = buildingNo;
			this.feild = feild;
			this.user = user;
		}

}
