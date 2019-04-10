package com.pack.DAOhelper;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static com.pack.constants.DbConstants.*;

public class DAO {
	static {
		try {
			Class.forName(Driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, user, password);
	}

	public static Statement getStatement() throws SQLException {
		return getConnection().createStatement();
	}

	public static PreparedStatement getPreparedSatement(String qry)
			throws SQLException {
		return getConnection().prepareStatement(qry);
	}

	public static CallableStatement getCallableStatement(String qry)
			throws SQLException {
		return getConnection().prepareCall(qry);
	}

	//********************************************FOR LOGIN**************************************************************************
	
	public static boolean verifyUser(String name, String password)
			throws SQLException {
		String query = "select * from RegisterUser where name=? and password=?";
		PreparedStatement pst = DAO.getPreparedSatement(query);
		pst.setString(1, name);
		pst.setString(2, password);
		ResultSet rs = pst.executeQuery();
		if (rs.next())
			return true;
		else
			return false;

	}
	
	public static boolean verifyEmp(String name, String password)
			throws SQLException {
		String query = "select * from Registeremp where name=? and password=?";
		PreparedStatement pst = DAO.getPreparedSatement(query);
		pst.setString(1, name);
		pst.setString(2, password);
		ResultSet rs = pst.executeQuery();
		if (rs.next())
			return true;
		else
			return false;

	}
	
	//************************************************FOR REGISTRATION********************************************************************************************

	public static boolean insertUser(String name,String pwd,String rpwd,String email,String dob,long phn,String gender,String address,long pincode,String country) throws SQLException {
		boolean r = false;
		String query = "insert into registeruser values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement st = DAO.getPreparedSatement(query);
		st.setString(1, name);
		st.setString(2, pwd);
		st.setString(3, rpwd);
		st.setString(4, email);
		st.setString(5, dob);
		st.setLong(6, phn);
		st.setString(7, gender);
		st.setString(8, address);
		st.setLong(9, pincode);
		st.setString(10, country);

		if (st.executeUpdate() > 0) {
			r = true;
			System.out.println("registeration sucessful");
		}
		return r;
	}
	
	public static boolean insertEmp(String name,String pwd,String rpwd,String email,String dob,long phn,String gender,String address,long pincode,String country) throws SQLException {
		boolean r = false;
		String query = "insert into registeremp values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement st = DAO.getPreparedSatement(query);
		st.setString(1, name);
		st.setString(2, pwd);
		st.setString(3, rpwd);
		st.setString(4, email);
		st.setString(5, dob);
		st.setLong(6, phn);
		st.setString(7, gender);
		st.setString(8, address);
		st.setLong(9, pincode);
		st.setString(10, country);

		if (st.executeUpdate() > 0) {
			r = true;
			System.out.println("registeration sucessful");
		}
		return r;
	}

	//***************************************************************************************************************************************
	
	public static ResultSet findTheRoom(String name) throws SQLException {
		String query = "select rd.RoomNo,BookStatus,Price FROM Room_Details rd INNER JOIN Room_Status rs ON BookStatus='Available' and Tid IN (select TypeId from Room_Type where Type=?) and rd.RoomNo=rs.RoomNo";
		PreparedStatement st = DAO.getPreparedSatement(query);
		st.setString(1, name);
		ResultSet rst = st.executeQuery();
		return rst;

	}

	public static boolean bookRoom(int RoomNo,String BookedBy,String BookFrom,String BookTo) throws SQLException {
		boolean r = false;
		String query="update room_status set BookStatus='Booked',BookBy=?,BookFrom=?,BookTo=? where RoomNo=?";
		PreparedStatement st = DAO.getPreparedSatement(query);
		st.setInt(4, RoomNo);
		
		st.setString(1, BookedBy);
		st.setString(2,BookFrom);
		st.setString(3,BookTo);
		
		if (st.executeUpdate() > 0) {
			r = true;
			System.out.println("registeration sucessful");
		}
		return r;
	}
}