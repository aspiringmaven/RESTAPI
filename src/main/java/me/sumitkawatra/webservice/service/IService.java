package me.sumitkawatra.webservice.service;

import java.util.List;

public interface IService<T>  {
	
	public abstract List<T> getAll();
	public abstract T getById(long id);
	public abstract void save(T object);
	public abstract void update(T object);
	public abstract void delete(T object);
	public abstract void deleteById(long id);

}
