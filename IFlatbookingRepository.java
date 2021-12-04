package com.abc.onlineflatrental.repository;
import java.util.List;

import com.cg.ofr.entities.Flat;
import com.cg.ofr.entities.FlatBooking;
import com.cg.ofr.exception.FlatBookingNotFoundException;

public interface IFlatbookingRepository {
	public Flat addFlatBooking(FlatBooking flat) ;
	public Flat updateFlatBooking(Flat flat) throws FlatBookingNotFoundException;
	public Flat deleteFlatBooking(Flat flat) throws FlatBookingNotFoundException;
	public Flat viewFlatBooking(int id) throws FlatBookingNotFoundException;
	public List<FlatBooking> viewAllFlatBooking();

}
