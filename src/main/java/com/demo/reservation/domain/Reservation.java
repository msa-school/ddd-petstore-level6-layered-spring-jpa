package com.demo.reservation.domain;

import java.util.Date;

import javax.persistence.*;

import com.demo.reservation.ReservationApplication;

@Entity
public class Reservation {

	@Id @GeneratedValue
	Long id;

    Long subscriber_id;

	Date startDT;
	Date endDT;

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
	ReservationType reservType;

	Long gym_id;
	Long trainer_id;
	Long ptprogram_id;

	public void reserve(){
		Repository repository = ReservationApplication.getApplicationContext().getBean(Repository.class);
		repository.save(this);
	}

	public ReservationType getReservType() {
		return reservType;
	}
	public void setReservType(ReservationType reservType) {
		this.reservType = reservType;
	}
	public Long getSubscriber_id() {
		return subscriber_id;
	}
	public void setSubscriber_id(Long subscriber_id) {
		this.subscriber_id = subscriber_id;
	}
	public Long getGym_id() {
		return gym_id;
	}
	public void setGym_id(Long gym_id) {
		this.gym_id = gym_id;
	}
	public Long getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(Long trainer_id) {
		this.trainer_id = trainer_id;
	}
	public Long getPtprogram_id() {
		return ptprogram_id;
	}
	public void setPtprogram_id(Long ptprogram_id) {
		this.ptprogram_id = ptprogram_id;
	}

}
