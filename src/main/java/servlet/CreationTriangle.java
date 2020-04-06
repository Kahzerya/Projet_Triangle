package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.PointDistance;
import bean.Triangle;
import bean.envoiEnBase;

public class CreationTriangle extends HttpServlet {

	private int P1Xnum;
	private int P1Ynum;
	private int P2Xnum;
	private int P2Ynum;
	private int P3Xnum;
	private int P3Ynum;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// coord. du premier point
		String P1X = request.getParameter("firstPointX");
		P1Xnum = Integer.parseInt(P1X);
		String P1Y = request.getParameter("firstPointY");
		P1Ynum = Integer.parseInt(P1Y);

		String message1 = "Le premier point créée a pour coordonnées : " + P1Xnum + " et " + P1Ynum;

		request.setAttribute("message1", message1);

		// coord. du second point
		String P2X = request.getParameter("secondPointX");
		P2Xnum = Integer.parseInt(P2X);
		String P2Y = request.getParameter("secondPointY");
		P2Ynum = Integer.parseInt(P2Y);

		String message2 = "Le second point créée a pour coordonnées : " + P2Xnum + " et " + P2Ynum;

		request.setAttribute("message2", message2);

		// coord. du troisième point
		String P3X = request.getParameter("thirdPointX");
		P3Xnum = Integer.parseInt(P3X);
		String P3Y = request.getParameter("thirdPointY");
		P3Ynum = Integer.parseInt(P3Y);

		String message3 = "Le troisième point créée a pour coordonnées : " + P3Xnum + " et " + P3Ynum;

		request.setAttribute("message3", message3);

		PointDistance p1 = new PointDistance(P1Ynum, P1Ynum);
		PointDistance p2 = new PointDistance(P2Xnum, P2Ynum);
		PointDistance p3 = new PointDistance(P3Xnum, P3Ynum);

		Triangle t1 = new Triangle(p1, p2, p3);
		String typeTriangle = "Le triangle est " + t1.getType();

		String distance1 = "Distance p1-p2 : " + p1.distance(p2);
		String distance2 = "Distance p1-p3 : " + p1.distance(p3);
		String distance3 = "Distance p2-p3 : " + p2.distance(p3);

		request.setAttribute("triangle", typeTriangle);
		request.setAttribute("distance1", distance1);
		request.setAttribute("distance2", distance2);
		request.setAttribute("distance3", distance3);

		this.getServletContext().getRequestDispatcher("/afficherResult.jsp").forward(request, response);
		
		envoiEnBase.envoi(P1Xnum, P1Ynum, P2Xnum, P2Ynum, P3Xnum, P3Ynum);

	}

}
