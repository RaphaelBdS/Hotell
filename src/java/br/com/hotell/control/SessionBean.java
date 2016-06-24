package br.com.financas.beans;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Raphael Bragança
 */
public class SessionBean {
    public static HttpSession getSession() {
		return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
	}
	public static HttpServletRequest getRequest() {
		return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
	}
	public static String getUsuario() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		return session.getAttribute("email").toString();
	}
	public static String getUsuarioID() {
		HttpSession session = getSession();
		if (session != null) {
			return (String) session.getAttribute("userid");
		} else {
			return null;
		}
	}
}
