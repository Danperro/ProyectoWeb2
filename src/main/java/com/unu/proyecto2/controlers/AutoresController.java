package com.unu.proyecto2.controlers;

import java.io.IOException;

import com.unu.proyecto2.models.AutoresModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AutoresController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AutoresModel modelo = new AutoresModel();

	public AutoresController() {
		super();
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
		if (request.getParameter("op") == null) {
			return;
		}
		String operation = request.getParameter("op");
		switch (operation) {
		case "Listar": {
			break;
		}
		case "Nuevo":
			return;
		}
	}

	private void Listar(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("listaAutores", modelo.listaAutores());
		request.getRequestDispatcher("/autores/listarAutores.jsp");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException{
		response.getWriter().append("served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
