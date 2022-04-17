package com.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Location;

@Repository
public interface LocationDao {
	
	public void addLocation(Location location);
	public Location findLocation(int id);
	public List<Location> findAllLocation();
	public boolean updateLocation(Location location);
	public boolean deleteLocation(int id);
}
