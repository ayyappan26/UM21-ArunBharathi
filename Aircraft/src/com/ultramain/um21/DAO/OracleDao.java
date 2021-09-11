package com.ultramain.um21.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.ultramain.um21.DTO.AircraftDto;
import com.ultramain.um21.DTO.SectorDto;
import com.ultramain.um21.Data.*;
import java.util.ArrayList;
import java.util.HashMap;

public class OracleDao implements IDao{


	public void registerAircraft(AircraftDto aircraftDto) throws SQLException 
	{

		Connection connection = ConnectionClass.getDbConnection();
		String registerQuery = " INSERT INTO aircraft (aircraft_code, description) VALUES (?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(registerQuery);
		
		preparedStatement.setString(1, aircraftDto.getAircraftCode());
		preparedStatement.setString(2, aircraftDto.getDescription());
		
		int rowsUpdated = preparedStatement.executeUpdate();
		
		System.out.println(rowsUpdated + " updated successfully.");
	}
	
	
	public void enterSectorDetails(SectorDto sectorDto) throws SQLException
	{
		
		Connection connection = ConnectionClass.getDbConnection();
		String sectorQuery = " INSERT INTO sector(sector_id, aircraft_code, from_station, to_station, schedule_date, schedule_time) VALUES (?, ?, ?, ?, ?, ?) ";
		PreparedStatement preparedStatement = connection.prepareStatement(sectorQuery);
		
		preparedStatement.setString(1, sectorDto.getSectorId());
		preparedStatement.setString(2, sectorDto.getAircraftCode());
		preparedStatement.setString(3, sectorDto.getFromStation());
		preparedStatement.setString(4, sectorDto.getToStation());
		preparedStatement.setString(5, sectorDto.getScheduleDate());
		preparedStatement.setInt(6, sectorDto.getScheduleTime());
		
		int rowsUpdated = preparedStatement.executeUpdate();
		System.out.println(rowsUpdated + " updated successfully. ");
		
	}
	
	public ArrayList<String> getAircraft() throws SQLException
	{
		
		Connection connection = ConnectionClass.getDbConnection();
		ArrayList<String> aircraft = new ArrayList<String>();
		
		String query = "SELECT aircraft_code FROM aircraft";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next())
		{
			
			aircraft.add(resultSet.getString(1));
		}
		
		return aircraft;
	}
	
	public ArrayList<SectorDto> getSector(String aircraftCode) throws SQLException
	{
		Connection connection = ConnectionClass.getDbConnection();
		
		ArrayList<SectorDto> arrayList = new ArrayList<SectorDto>();
		
		String viewSector = " SELECT sector_id, aircraft_code, from_station, to_station, schedule_date, schedule_time FROM sector WHERE aircraft_code = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(viewSector);
		preparedStatement.setString(1,aircraftCode);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		
		while(resultSet.next())
		{
			SectorDto sectorDto = new SectorDto();
			
			sectorDto.setSectorId(resultSet.getString(1));
			sectorDto.setAircraftCode(resultSet.getString(2));
			sectorDto.setFromStation(resultSet.getString(3));
			sectorDto.setToStation(resultSet.getString(4));
			sectorDto.setScheduleDate(resultSet.getString(5));
			sectorDto.setScheduleTime(resultSet.getInt(6));
				
			arrayList.add(sectorDto);
		}
		
		return arrayList;
	}
	
	public HashMap<String, ArrayList<SectorDto>> viewSectorDetails() throws SQLException
	{
		
		
		ArrayList<String> aircraftDetails = new ArrayList<String>();
		
		HashMap<String, ArrayList<SectorDto>> hashMap = new HashMap<>();
		
		aircraftDetails = getAircraft();
		
		for(String aircraft : aircraftDetails)
		{
			ArrayList<SectorDto> arrayList = getSector(aircraft);
			hashMap.put(aircraft, arrayList);
		}
		
		
		return hashMap;
	}

}
