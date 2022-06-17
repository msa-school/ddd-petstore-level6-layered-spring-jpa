package com.demo.reservation.domain;

import javax.persistence.Embeddable;

@Embeddable
public class ReserveItem {
    Long reservItem_id;				// 예약대상 ID(GymID or TrainerID or PTProgramID)
	ReservationType reservType;		// 예약종류 : HEALTH_CENTER, TRAINER_CONSULT, PT_PROGRAM   

	public ReservationType getReservType() {
		return reservType;
	}

	public void setReservType(ReservationType reservType) {
		this.reservType = reservType;
	}

	public Long getReservItem_id() {
		return reservItem_id;
	}

	public void setReservItem_id(Long reservItem_id) {
		this.reservItem_id = reservItem_id;
	}
 
}
