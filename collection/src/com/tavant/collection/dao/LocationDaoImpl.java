package com.tavant.collection.dao;

import java.util.ArrayList;
import java.util.List;

import com.tavant.collection.models.Department;
import com.tavant.collection.models.Employee;
import com.tavant.collection.models.Location;

public class LocationDaoImpl implements LocationDao {
	private List<Location> locations = new ArrayList<Location>(20);

	@Override
	public Location getLocationById(String locationId) {
		for (Location location : locations) {
			if (location.getLocationId().equals(locationId))
				return location;
		}
		return null;
	}

	

	@Override
	public Boolean isExists(String locationId) {
		return (this.getLocationById(locationId)!= null) ? true : false;
	}

	@Override
	public Boolean addLocation(Location location) {
		return this.locations.add(location);
	}

	@Override
	public Location updateLocation(String locationId, Location location) {
		Location tempLocation = this.getLocationById(locationId);
		tempLocation.setLatitude(location.getLatitude());
		tempLocation.setLongitude(location.getLongitude());
		tempLocation.setName(location.getName());
		return tempLocation;
	}

	@Override
	public List<Location> getLocations() {
		return this.locations;
	}

	@Override
	public Boolean deleteLocation(String locationId) {

		return this.locations.remove(this.getLocationById(locationId));
	}

}
