package com.tavant.collection.service;

import java.util.List;

import com.tavant.collection.models.Department;
import com.tavant.collection.models.Employee;
import com.tavant.collection.models.Location;

public interface LocationService {
	public Boolean addLocation(Location location);
	public Location updateLocation(String locationId , Location location);
	public List<Location> getLocations();
	public Boolean deleteLocation(String locationId);
	public Location getLocationById(String locationId);
	public Boolean isExists(String locationId);
}
