package com.pack.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pack.BO.BO;
import com.pack.Class.RoomVacant;
import com.pack.exceptions.AuthenticationException;


@WebServlet(name = "cont", urlPatterns = { "/cont" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			handler(request,response);
		} catch (SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			handler(request,response);
		} catch (SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private void handler(HttpServletRequest request,HttpServletResponse response) throws SQLException, ParseException, ServletException 
	  {
		// TODO Auto-generated method stub
		String Action=request.getParameter("submit");
        HttpSession session = request.getSession();
        RequestDispatcher rd=null;
        System.out.println(Action);
  /*-----------------------------------------------------------Login--------------------------------------------------------------*/
        if(Action.equalsIgnoreCase("Login-User"))
        {
                String user=request.getParameter("user");
                String pass=request.getParameter("pwd");
                System.out.println(user+"----"+pass);
                try 
                   {
                        boolean b=BO.verifyUser(user,pass);
                         if(b)
                           {
                            session.setAttribute("user", user);
                            rd=request.getRequestDispatcher("home.jsp");
                            rd.forward(request, response);
                           } 
                         else
                           {
                            throw new AuthenticationException();
                           }
                   } 
                 catch (AuthenticationException e) 
                   {
                       System.out.println(e.getMessage());
                       try 
                          {
                    	   request.setAttribute("errorMessage", "Invalid user or password?Please login again");
                           RequestDispatcher rd1 = request.getRequestDispatcher("Login.jsp");
                           rd1.forward(request, response); 
                          } 
                       catch (IOException e1) 
                          {
                                // TODO Auto-generated catch block
                            e1.printStackTrace();
                          }                   
                   } 
                catch (IOException e) 
                   {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                   } 
                catch (ServletException e) 
                   {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                   }
                
            }
        else
        	 if(Action.equalsIgnoreCase("Login-Emp"))
             {
                     String user=request.getParameter("user");
                     String pass=request.getParameter("pwd");
                     System.out.println(user+"----"+pass);
                     try 
                        {
                             boolean b=BO.verifyUser(user,pass);
                              if(b)
                                {
                                 session.setAttribute("user", user);
                                 rd=request.getRequestDispatcher("home.jsp");
                                 rd.forward(request, response);
                                } 
                              else
                                {
                                 throw new AuthenticationException();
                                }
                        } 
                      catch (AuthenticationException e) 
                        {
                            System.out.println(e.getMessage());
                            try 
                               {
                         	   request.setAttribute("errorMessage", "Invalid user or password?Please login again");
                                RequestDispatcher rd1 = request.getRequestDispatcher("LoginEmp.jsp");
                                rd1.forward(request, response); 
                               } 
                            catch (IOException e1) 
                               {
                                     // TODO Auto-generated catch block
                                 e1.printStackTrace();
                               }                   
                        } 
                     catch (IOException e) 
                        {
                             // TODO Auto-generated catch block
                             e.printStackTrace();
                        } 
                     catch (ServletException e) 
                        {
                             // TODO Auto-generated catch block
                             e.printStackTrace();
                        }
                     
                 }
      /*-----------------------------------------------------------New User--------------------------------------------------------------*/
        else
        	if(Action.equalsIgnoreCase("User-Register"))
            {
                    String name=request.getParameter("username");
                    String pwd=request.getParameter("password");
                    String rpwd=request.getParameter("re-password");
                    String email=request.getParameter("email");
                    String dob=request.getParameter("dob");
                    long phn=Long.parseLong(request.getParameter("phoneno"));
                    String gender=request.getParameter("s1");
                    String address=request.getParameter("address");
                    long pincode=Long.parseLong(request.getParameter("pincode"));
                    String country=request.getParameter("country");
                    System.out.println(name+"----"+pwd+"----"+rpwd+"----"+email+"----"+dob+"----"+phn+"----"+gender+"----"+address+"----"+pincode+"----"+country);
                    try 
                       {
                            boolean b=BO.insertUser(name,pwd,rpwd,email,dob,phn,gender,address,pincode,country);
                             if(b)
                               {
                                request.setAttribute("user", name);
                                
                                rd=request.getRequestDispatcher("Login.jsp");
                                rd.forward(request, response);
                               } 
                             else
                               {
                                throw new AuthenticationException();
                               }
                       } 
                     catch (AuthenticationException e) 
                       {
                           System.out.println(e.getMessage());
                           try 
                              {
                                response.sendRedirect("errorpage.html");
                              } 
                           catch (IOException e1) 
                              {
                                    // TODO Auto-generated catch block
                                e1.printStackTrace();
                              }                   
                       } 
                    catch (IOException e) 
                       {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                       } 
                    catch (ServletException e) 
                       {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                       }
                    
                }
        	else
        		if(Action.equalsIgnoreCase("Emp-Register"))
                {
                        String name=request.getParameter("username");
                        String pwd=request.getParameter("password");
                        String rpwd=request.getParameter("re-password");
                        String email=request.getParameter("email");
                        String dob=request.getParameter("dob");
                        long phn=Long.parseLong(request.getParameter("phoneno"));
                        String gender=request.getParameter("s1");
                        String address=request.getParameter("address");
                        long pincode=Long.parseLong(request.getParameter("pincode"));
                        String country=request.getParameter("country");
                        System.out.println(name+"----"+pwd+"----"+rpwd+"----"+email+"----"+dob+"----"+phn+"----"+gender+"----"+address+"----"+pincode+"----"+country);
                        try 
                           {
                                boolean b=BO.insertEmp(name,pwd,rpwd,email,dob,phn,gender,address,pincode,country);
                                 if(b)
                                   {
                                    request.setAttribute("user", name);
                                    
                                    rd=request.getRequestDispatcher("LoginEmp.jsp");
                                    rd.forward(request, response);
                                   } 
                                 else
                                   {
                                    throw new AuthenticationException();
                                   }
                           } 
                         catch (AuthenticationException e) 
                           {
                               System.out.println(e.getMessage());
                               try 
                                  {
                                    response.sendRedirect("errorpage.html");
                                  } 
                               catch (IOException e1) 
                                  {
                                        // TODO Auto-generated catch block
                                    e1.printStackTrace();
                                  }                   
                           } 
                        catch (IOException e) 
                           {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                           } 
                        catch (ServletException e) 
                           {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                           }
                        
                    }
   /*-----------------------------------------------------------Home Page Room Type Select--------------------------------------------------------------*/
        	else
            	if(Action.equalsIgnoreCase("Ok"))
                {
            		List<RoomVacant> list=null;

            	
            			
                        String name=request.getParameter("name");
                    
                        System.out.println(name);
                        try 
                           {
                                    list=BO.findTheRoom(name);
                                     System.out.println(list);
                                    request.setAttribute("list", list);
                                    rd=request.getRequestDispatcher("View.jsp");
                                    rd.forward(request, response);
                           }
                         catch (AuthenticationException e) 
                           {
                               e.printStackTrace();
                                                     
                           } 
                        catch (IOException e) 
                           {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                           } 
                        catch (ServletException e) 
                           {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                           }
                        
                    }
        //------------------------------------------------fill for booking--------------------------------------------------
            	else
                	if(Action.equalsIgnoreCase("Book"))
                    {
                		System.out.println("booking ");
                		 /*int RoomNo=Integer.parseInt(request.getParameter("RoomNo"));
                		 String BookStatus=request.getParameter("BookStatus");
                         double price=Double.parseDouble(request.getParameter("price"));
                         System.out.println(RoomNo+"----"+BookStatus+"----"+price);*/
                        
                        try 
                           {
                                    rd=request.getRequestDispatcher("Book.jsp");
                                    rd.forward(request, response);
                           }  

                        catch (IOException e) 
                           {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                           } 
                        catch (ServletException e) 
                           {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                           }
                    }
        //------------------------------------------------------------book ticket---------------------------------------------------
            	else
                	if(Action.equalsIgnoreCase("BookRoom"))
                    {
                		System.out.println("booking ");
                		int RoomNo=Integer.parseInt(request.getParameter("roomno"));
               		    System.out.println(RoomNo);
               		    String BookedBy=request.getParameter("bookby");
               		    String BookFrom=request.getParameter("bookfrom");
               		    String BookTo=request.getParameter("bookto");
                        
                        System.out.println(RoomNo+"----"+"----"+BookedBy+"----"+BookFrom+"----"+BookTo);
                        
                        try 
                           {
                        	 
                        	 boolean b=BO.bookRoom(RoomNo,BookedBy,BookFrom,BookTo);
                               if(b)
                               {
                            	    request.setAttribute("roomno", RoomNo);
                                    rd=request.getRequestDispatcher("details.jsp");
                                    rd.forward(request, response);
                               }
                               else
                               {
                                throw new AuthenticationException();
                               }
                       } 
                     catch (AuthenticationException e) 
                       {
                           System.out.println(e.getMessage());
                           try 
                              {
                                response.sendRedirect("errorpage.html");
                              } 
                           catch (IOException e1) 
                              {
                                    // TODO Auto-generated catch block
                                e1.printStackTrace();
                              }                   
                       }
                            

                        catch (IOException e) 
                           {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                           } 
                        catch (ServletException e) 
                           {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                           }
                    }
    /*----------------------------------------------logout-----------------------------------------------*/
                	else
                		if(Action.equalsIgnoreCase("Logout"))
                        {
                               System.out.println("dwedweded");
                                try 
                                   {
                                      
                                            session.removeAttribute("user");
                                            session.invalidate(); 
                                            rd=request.getRequestDispatcher("index.html");
                                            rd.forward(request, response);
                                         
                                   } 
                                 catch (IOException e) 
                                   {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                   } 
                                catch (ServletException e) 
                                   {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                   }
                                
                            }
                	
	  }

}
