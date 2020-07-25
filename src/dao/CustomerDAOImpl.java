package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.CustomerDTOImpl;

public class CustomerDAOImpl implements CustomerDAO {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;
	
	public CustomerDAOImpl(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		super();
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}

	protected void connect() throws SQLException {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
			}
			jdbcConnection = DriverManager.getConnection(
										jdbcURL, jdbcUsername, jdbcPassword);
		}
	}
	
	protected void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}

	@Override
	public boolean add(CustomerDTOImpl impl) throws SQLException {
		String sqlInsert = "INSERT INTO Customer (cmnd, name, gaden, giatien) VALUES (?, ?, ?, ?)";
		connect();
		PreparedStatement statement = jdbcConnection.prepareStatement(sqlInsert);
		statement.setString(1, impl.getCmnd());
		statement.setString(2, impl.getName());
		statement.setString(3, impl.getGaden());
		statement.setDouble(4, impl.getGiatien());
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowInserted;
	}

	@Override
	public List<CustomerDTOImpl> readbyadd() throws SQLException {
List<CustomerDTOImpl> listProd = new ArrayList<CustomerDTOImpl>();
		
		String sql = "SELECT * FROM Customer";
		
		connect();
		
		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			String cmnd = resultSet.getString("cmnd");
			String name = resultSet.getString("name");
			String gaden = resultSet.getString("gaden");
			double giatien = resultSet.getDouble("giatien");
			CustomerDTOImpl product = new CustomerDTOImpl(cmnd, name, gaden, giatien);
			listProd.add(product);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return listProd;
	}

	@Override
	public CustomerDTOImpl readcmnd(String cmnd) throws SQLException {
		CustomerDTOImpl prod = null;
		String sql = "SELECT * FROM Customer WHERE cmnd = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, cmnd);
		
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
			String cmnda = resultSet.getString("cmnd");
			String name = resultSet.getString("name");
			String gaden = resultSet.getString("gaden");
			double giatien = resultSet.getDouble("giatien");
			
			prod = new CustomerDTOImpl(cmnda, name, gaden, giatien);
		}
		
		resultSet.close();
		statement.close();
		
		return prod;
	
	}

	public boolean delete(String name) throws SQLException {
       String sql = "DELETE FROM Customer where cmnd = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, name);
		
		boolean rowDeleted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowDeleted;
	}

	@Override
	public boolean update(CustomerDTOImpl impl) throws SQLException {
		String sql = "UPDATE Customer SET name = ?, gaden = ?, giatien = ?  WHERE cmnd = ?";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, impl.getName());
		statement.setString(2, impl.getGaden());
		statement.setDouble(3, impl.getGiatien());
		statement.setString(4, impl.getCmnd());
		
		boolean rowUpdated = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowUpdated;
	}

}
