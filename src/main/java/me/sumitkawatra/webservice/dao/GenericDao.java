package me.sumitkawatra.webservice.dao;

import java.util.List;

public interface GenericDao<T> {
	public abstract List<T> getAll();
	public abstract T getById(long id);
	public abstract void save(T object);
	public abstract void update(T object);
	public abstract void delete(T object);
	public abstract void deleteById(long id);	
}
