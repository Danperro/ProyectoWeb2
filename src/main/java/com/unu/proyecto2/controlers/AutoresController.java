package com.unu.proyecto2.controlers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.unu.proyecto2.models.AutoresModel;



public class AutoresController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AutoresModel modelo = new AutoresModel();

	public AutoresController() {
		super();
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
		if (request.getParameter("op") == null) {
			Listar(request, response);
			return;
		}
		String operation = request.getParameter("op");
		switch (operation) {
		case "Listar": {
			Listar(request, response);
			break;
		}
		case "Nuevo":
			return;
		}
	}

	private void Listar(HttpServletRequest request, HttpServletResponse response) {
		 try {
				request.setAttribute("listaAutores", modelo.listaAutores());
				request.getRequestDispatcher("/autores/listaAutores.jsp").forward(request, response);
		 	} catch (ServletException | IOException ex) {
			 Logger.getLogger(AutoresController.class.getName()).log(Level.SEVERE,null,ex);
		 	}


	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException{
		processRequest(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}
}
