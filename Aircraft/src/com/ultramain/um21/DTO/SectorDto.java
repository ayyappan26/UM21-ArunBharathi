package com.ultramain.um21.DTO;

public class SectorDto {

	private String sectorId;
	private String aircraftCode;
	private String fromStation;
	private String toStation;
	private String scheduleDate;
	private int scheduleTime;
	
	public String getSectorId() {
		return sectorId;
	}
	
	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}
	
	public String getAircraftCode() {
		return aircraftCode;
	}
	
	public void setAircraftCode(String aircraftCode) {
		this.aircraftCode = aircraftCode;
	}
	
	public String getFromStation() {
		return fromStation;
	}
	
	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}
	
	public String getToStation() {
		return toStation;
	}
	
	public void setToStation(String toStation) {
		this.toStation = toStation;
	}
	
	public String getScheduleDate() {
		return scheduleDate;
	}
	
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	
	public int getScheduleTime() {
		return scheduleTime;
	}
	
	public void setScheduleTime(int scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	
	
}
