package dao;

import java.sql.SQLException;
import java.util.List;

import dto.CustomerDTOImpl;


public interface CustomerDAO {
	boolean add(CustomerDTOImpl impl)throws SQLException;
	List<CustomerDTOImpl> readbyadd () throws SQLException;
	CustomerDTOImpl readcmnd (String cmnd)throws SQLException;
	boolean delete (String name) throws SQLException;
	boolean update (CustomerDTOImpl impl) throws SQLException;
	
}
