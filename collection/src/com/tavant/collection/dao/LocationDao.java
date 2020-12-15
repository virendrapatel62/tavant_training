package com.tavant.collection.dao;

import java.util.List;

import com.tavant.collection.models.Employee;
import com.tavant.collection.models.Location;

public interface LocationDao {
	public Boolean addLocation(Location location);
	public Location updateLocation(String locationId , Location location);
	public List<Location> getLocations();
	public Boolean deleteLocation(String empid);
	public Location getLocationById(String empid);
	public Boolean isExists(String empId);
}
