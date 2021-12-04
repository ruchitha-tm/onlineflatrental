package com.abc.onlineflatrental.repository;
import java.util.List;

import com.cg.ofr.entities.Landlord;
import com.cg.ofr.exception.LandlordNotFoundException;
public interface ILandlordRepository {
	public Landlord addLandlord(Landlord landlord);
	public Landlord updateLandlord(Landlord landlord) throws LandlordNotFoundException;
	public Landlord deleteLandlord(Landlord landlord) throws LandlordNotFoundException;
	public Landlord viewLandlord(int id) throws LandlordNotFoundException;
	public List<Landlord> viewAllLandlord();
}
