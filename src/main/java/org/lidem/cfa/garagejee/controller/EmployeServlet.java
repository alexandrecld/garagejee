package org.lidem.cfa.garagejee.controller;
import org.lidem.cfa.garagejee.model.Employe;
import org.lidem.cfa.garagejee.service.EmployeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeServlet", urlPatterns = {"/employes"})
public class EmployeServlet extends HttpServlet {

    private EmployeService employeService;

    @Override
    public void init() {
        employeService = new EmployeService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("doGet");
        // Récupérer les employés de la base de données
        List<Employe> employes = employeService.findAll();

        // Stocker les employés dans la requête
        request.setAttribute("employes", employes);

        // Rediriger vers la vue employes.jsp
        request.getRequestDispatcher("./employes.jsp").forward(request, response);
    }

    @Override
    public void destroy() {
        employeService.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Récupérer les données du formulaire
        String type = request.getParameter("type");
        String nom = request.getParameter("nom");

        // Créer un nouvel employé et l'ajouter à la base de données (à implémenter)
        Employe nouvelEmploye = new Employe(type, nom);
        employeService.save(nouvelEmploye);

        // Rediriger vers la liste des employés
        response.sendRedirect(request.getContextPath() + "/employes.jsp");
    }
}
