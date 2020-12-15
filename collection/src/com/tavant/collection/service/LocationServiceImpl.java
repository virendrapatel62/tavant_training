package com.tavant.collection.service;

import java.util.List;

import com.tavant.collection.dao.*;
import com.tavant.collection.models.*;

public class LocationServiceImpl implements LocationService{
		
	private LocationDao locationDao = new LocationDaoImpl();

	@Override
	public Boolean addLocation(Location location) {
		return this.locationDao.addLocation(location);
	}

	@Override
	public Location updateLocation(String locationId, Location location) {
		return this.locationDao.updateLocation(locationId, location);
	}

	@Override
	public List<Location> getLocations() {
		return this.locationDao.getLocations();
	}

	@Override
	public Boolean deleteLocation(String locationId) {
		return this.locationDao.deleteLocation(locationId);
	}

	@Override
	public Location getLocationById(String locationId) {
		return this.locationDao.getLocationById(locationId);
	}

	@Override
	public Boolean isExists(String locationId) {
		return this.locationDao.isExists(locationId);
	}

	
}
