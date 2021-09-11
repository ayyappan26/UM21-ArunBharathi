package com.ultramain.um21.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.ultramain.um21.DTO.AircraftDto;
import com.ultramain.um21.DTO.SectorDto;

public interface IDao {

	public void registerAircraft(AircraftDto aircraftDto) throws SQLException;
	
	public void enterSectorDetails(SectorDto sectorDto) throws SQLException;
	
	public HashMap<String, ArrayList<SectorDto>> viewSectorDetails() throws SQLException;
	
	 
}
