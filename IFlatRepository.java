package com.abc.onlineflatrental.repository;

import java.util.List;

import com.cg.ofr.entities.Flat;
import com.cg.ofr.exception.FlatNotFoundException;
public interface IFlatRepository {
	public Flat addFlat(Flat flat) ;
	public Flat updateFlat(Flat flat) throws FlatNotFoundException;
	public Flat deleteFlat(Flat flat) throws FlatNotFoundException;
	public Flat viewFlat(int id) throws FlatNotFoundException;
	public List<Flat> viewAllFlat();
	public List<Flat> viewAllFlatByCost(float cost,String availability);
}
