package com.cav.spring.service.authentication.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "BankClient")
@Table(name = "Bank_Client")
public class BankClient {

	@Id
	@Column(name="CLIENT_ID")
	private long clientid;
	
	@Column(name="CLIENT_NAME")
	private String clientName;
	
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;
	
	@Column(name="CLIENT_ACTIVE")
	private String clientActive;

	public long getClientid() {
		return clientid;
	}

	public void setClientid(long clientid) {
		this.clientid = clientid;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getClientActive() {
		return clientActive;
	}

	public void setClientActive(String clientActive) {
		this.clientActive = clientActive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientActive == null) ? 0 : clientActive.hashCode());
		result = prime * result + ((clientName == null) ? 0 : clientName.hashCode());
		result = prime * result + (int) (clientid ^ (clientid >>> 32));
		result = prime * result + ((effectiveDate == null) ? 0 : effectiveDate.hashCode());
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
		BankClient other = (BankClient) obj;
		if (clientActive == null) {
			if (other.clientActive != null)
				return false;
		} else if (!clientActive.equals(other.clientActive))
			return false;
		if (clientName == null) {
			if (other.clientName != null)
				return false;
		} else if (!clientName.equals(other.clientName))
			return false;
		if (clientid != other.clientid)
			return false;
		if (effectiveDate == null) {
			if (other.effectiveDate != null)
				return false;
		} else if (!effectiveDate.equals(other.effectiveDate))
			return false;
		return true;
	}
}
