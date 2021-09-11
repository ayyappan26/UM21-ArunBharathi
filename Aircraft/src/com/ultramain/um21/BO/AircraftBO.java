package com.ultramain.um21.BO;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import com.ultramain.um21.DAO.OracleDao;
import com.ultramain.um21.DTO.AircraftDto;
import com.ultramain.um21.DTO.SectorDto;
import com.ultramain.um21.utility.Scan;

public class AircraftBO {

	HashMap<String, ArrayList<SectorDto>> arrayList = null;
			
	public void bussinessObject()  
	{
		
		OracleDao oracleDao = new OracleDao();
		
		
		
		char nextChoice = 'N';
		do 
		{
			System.out.println("1. Register the Aircraft details ");
			System.out.println("2. Enter the sector details ");
			System.out.println("3. View Sector detail for an aircraft ");
			System.out.println("Enter a Value : ");
			int choice = Scan.getInstance().nextInt();
			
			switch(choice)
			{
				case 1:
					
					AircraftDto aircraftDto = new AircraftDto();
					aircraftDto = registerAirCraft();
					try 
					{
						oracleDao.registerAircraft(aircraftDto);
					}catch(SQLException e)
					{
						System.out.println(e.getMessage());
					}
					
					System.out.println("Do you want to continute (Y/N)");
					nextChoice = Scan.getInstance().next().charAt(0);
					break;
				case 2:
					
					SectorDto sectorDto = new SectorDto();
				try {
					sectorDto = registerSector();
				} catch (ParseException e1) {

					e1.printStackTrace();
				}
					try {
						oracleDao.enterSectorDetails(sectorDto);
					}catch(SQLException e)
					{
						System.out.println(e.getMessage());
					}
					
					System.out.println("Do you want to continute (Y/N)");
					nextChoice = Scan.getInstance().next().charAt(0);
					break;
					
				case 3:
					
					ArrayList<String> aircrafts = null;
					try {
						aircrafts = oracleDao.getAircraft();
					}catch(SQLException e)
					{
						System.out.println(e.getMessage());
					}
					
					System.out.println("The Available Aircrafts are : ");
					
					for(String aircraft : aircrafts)
					{
						System.out.println(aircraft);
					}
					
					System.out.println("Enter the Aircraft Code ");
					String aircraftCode = Scan.getInstance().next();
					
					try {
						printSectorDetail(aircraftCode);
					}catch(SQLException e)
					{
						System.out.println(e.getMessage());
					}
					
					System.out.println("Do you want to continute (Y/N)");
					nextChoice = Scan.getInstance().next().charAt(0);
					
					
					break;
					
			}
		}while(nextChoice == 'Y');
	}
	
	public AircraftDto registerAirCraft()
	{
		
		AircraftDto aircraftDto = new AircraftDto();
		
		System.out.println("Enter the Aircraft code : ");
		aircraftDto.setAircraftCode(Scan.getInstance().next());
		
		System.out.println("Enter the Description : ");
		aircraftDto.setDescription(Scan.getInstance().next());
		
		return aircraftDto;
	}
	
	public SectorDto registerSector() throws ParseException
	{
		SectorDto sectorDto = new SectorDto();
		
		System.out.println("Enter the Sector Id : ");
		sectorDto.setSectorId(Scan.getInstance().next());
		
		System.out.println("Enter the Aircraft Code : ");
		sectorDto.setAircraftCode(Scan.getInstance().next());
		
		System.out.println("Enter the Departure Station : ");
		sectorDto.setFromStation(Scan.getInstance().next());
		
		System.out.println("Enter the Destination Station : ");
		sectorDto.setToStation(Scan.getInstance().next());
		
		System.out.println("Enter the Schedule Date(YYYY-MM-DD) : ");
		sectorDto.setScheduleDate(Scan.getInstance().next());
		
		System.out.println("Enter the Schedule Time : ");
		sectorDto.setScheduleTime(Scan.getInstance().nextInt());
		
		return sectorDto;
		
	}
	
	public void printSectorDetail(String aircraftCode) throws SQLException
	{
		
		OracleDao oracleDao = new OracleDao();
		HashMap<String, ArrayList<SectorDto>> hashMap = oracleDao .viewSectorDetails();
		
		if(hashMap.containsKey(aircraftCode))
		{
			ArrayList<SectorDto> arrayList = hashMap.get(aircraftCode);
			for(SectorDto sectorDto : arrayList)
			{
				System.out.println("Sector Id              : " + sectorDto.getSectorId());
				System.out.println("Aircraft Code          : " + sectorDto.getAircraftCode());
				System.out.println("Departure Station      : " + sectorDto.getFromStation());
				System.out.println("Destination Station    : " + sectorDto.getToStation());
				System.out.println("Schedule Date          : " + sectorDto.getScheduleDate());
				System.out.println("Schedule Time          : " + sectorDto.getScheduleTime());
				System.out.println("--------------------------------------------------");
			}
			
		}
	}
	
}
