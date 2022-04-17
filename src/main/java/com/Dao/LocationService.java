package com.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Location;

@Service
public class LocationService {
	@Autowired
	LocationDao LocationDaoImpl;
	
	public void add(Location location)
	{
		LocationDaoImpl.addLocation(location);
	}
	public boolean update(Location location)
	{
		return LocationDaoImpl.updateLocation(location);
	}
	public boolean delete(int Id)
	{
		return LocationDaoImpl.deleteLocation(Id);
	}
	public Location find(int id)
	{
		return LocationDaoImpl.findLocation(id);
	}
	public List<Location> findAll()
	{
		return LocationDaoImpl.findAllLocation();
	}
}
