/*
 * Copyright (C) 2016 Prowave Consulting, LLC
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.prowave.chargify.webhook.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dunner {

	@JsonProperty("subscription_id")
	private String subscriptionId;

	private String state;

	private Integer attempts;

	@JsonProperty("last_attempted_at")
	private Date lastAttemptedAt;

	@JsonProperty("created_at")
	private Date createdAt;

	@JsonProperty("revenue_at_risk_in_cents")
	private String revenueAtRiskInCents;

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getAttempts() {
		return attempts;
	}

	public void setAttempts(Integer attempts) {
		this.attempts = attempts;
	}

	public Date getLastAttemptedAt() {
		return lastAttemptedAt;
	}

	public void setLastAttemptedAt(Date lastAttemptedAt) {
		this.lastAttemptedAt = lastAttemptedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getRevenueAtRiskInCents() {
		return revenueAtRiskInCents;
	}

	public void setRevenueAtRiskInCents(String revenueAtRiskInCents) {
		this.revenueAtRiskInCents = revenueAtRiskInCents;
	}

	

}
