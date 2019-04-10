package com.pack.BO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;	
import com.pack.Class.RoomVacant;
import com.pack.DAOhelper.DAO;
import com.pack.exceptions.AuthenticationException;
	
	
	
	
	
	public class BO {
		
		public static boolean verifyUser(String name, String password) throws AuthenticationException
		 {
			boolean b=false;
			try 
			  {
				b=DAO.verifyUser(name, password);
			  } 
			catch (SQLException e)
			  {
			    throw new AuthenticationException(e);
			  }
			return b;
	     }
		
		public static boolean verifyEmp(String name, String password) throws AuthenticationException
		 {
			boolean b=false;
			try 
			  {
				b=DAO.verifyEmp(name, password);
			  } 
			catch (SQLException e)
			  {
			    throw new AuthenticationException(e);
			  }
			return b;
	     }
		
	public static boolean insertUser(String name,String pwd,String rpwd,String email,String dob,long phn,String gender,String address,long pincode,String country) throws AuthenticationException,SQLException
		  {
			boolean b=false;
			try
			 {
			   b=DAO.insertUser(name,pwd,rpwd,email,dob,phn,gender,address,pincode,country);
			 }
			catch (SQLException e) 
			 {
				throw new AuthenticationException(e);
			 }
			return b;	
		  }
	
	public static boolean insertEmp(String name,String pwd,String rpwd,String email,String dob,long phn,String gender,String address,long pincode,String country) throws AuthenticationException,SQLException
	  {
		boolean b=false;
		try
		 {
		   b=DAO.insertEmp(name,pwd,rpwd,email,dob,phn,gender,address,pincode,country);
		 }
		catch (SQLException e) 
		 {
			throw new AuthenticationException(e);
		 }
		return b;	
	  }
	
		public static List<RoomVacant> findTheRoom(String name) throws SQLException,AuthenticationException
		  {
			List<RoomVacant> list=new ArrayList<RoomVacant>();
			try
			  {
				ResultSet rs=DAO.findTheRoom(name);	
			
		        if(rs.next())
		           {
		    	     RoomVacant r=null;
		    	     do
		    	       {
		    		     r=new RoomVacant();
		    		     r.setRoomNo(rs.getInt(1));
		    		     r.setBookStatus(rs.getString(2));
		    		     r.setPrice(rs.getDouble(3));
		    		     list.add(r);
		    	       }
		    	    while(rs.next());
		           }
		       }
			 catch (SQLException e)
			   {
				throw new AuthenticationException(e);
			   }
		    
			   return list;
           }
	
		public static boolean bookRoom(int RoomNo,String BookedBy,String BookFrom,String BookTo) throws AuthenticationException,SQLException 
		  {
			boolean b=false;
			try
			 {
			   b=DAO.bookRoom(RoomNo,BookedBy,BookFrom,BookTo);
			 }
			catch (SQLException e) 
			 {
				throw new AuthenticationException(e);
			 }
			return b;
		  }
	}
