package com.demo.reservation.domain;

import java.util.Date;

import javax.persistence.*;

import com.demo.reservation.ReservationApplication;

@Entity
public class Reservation {

	@Id @GeneratedValue
	Long id;

	Long subscriber_id;				// 예약자
	Date startDT;					// 시작일자
	Date endDT;						// 종료일자
	
	@Embedded
	ReserveItem reserveItem;		// 예약대상(예약 종류, 예약ITEM ID)
		
	public ReserveItem getReserveItem() {
		return reserveItem;
	}

	public void setReserveItem(ReserveItem reserveItem) {
		this.reserveItem = reserveItem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSubscriber_id() {
		return subscriber_id;
	}

	public void setSubscriber_id(Long subscriber_id) {
		this.subscriber_id = subscriber_id;
	}

	public Date getStartDT() {
		return startDT;
	}

	public void setStartDT(Date startDT) {
		this.startDT = startDT;
	}

	public Date getEndDT() {
		return endDT;
	}

	public void setEndDT(Date endDT) {
		this.endDT = endDT;
	}

	public void reserve(){
		Repository repository = ReservationApplication.getApplicationContext().getBean(Repository.class);
		repository.save(this);
	}

}
