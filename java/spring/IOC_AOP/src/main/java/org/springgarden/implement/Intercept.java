package org.springgarden.implement;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;

/**
 * Classe génératrice de logs.
 * 
 * @author Scub-Foundation
 */
public class Intercept {

	private static Logger logger = Logger.getLogger(Intercept.class);
	
	/**
	 * Cette méthode est appelée à chaque fois (et avant) qu'une méthode est interceptée
	 * 
	 * @param joinPoint
	 */
	public void logMethodEntry(JoinPoint joinPoint) {

		Object[] args = joinPoint.getArgs();

		// Nom de la méthode interceptée
		String name = joinPoint.getSignature().toLongString();
		StringBuffer sb = new StringBuffer(name	+ " appelé avec en paramètre : [");

		// Liste des valeurs des arguments reçus par la méthode
		for (int i = 0; i < args.length; i++) {
			Object o = args[i];
			sb.append("'" + o + "'");
			sb.append((i == args.length - 1) ? "" : ", ");
		}
		sb.append("]");

		logger.debug(sb);
	}

	/**
	 * Cette méthode est appelée à chaque fois (et après) qu'une méthode est interceptée.
	 * 
	 * Elle reçoit en argument 'result' qui est le retour de la méthode interceptée
	 * 
	 * @param staticPart
	 * @param result
	 */
	public void logMethodExit(StaticPart staticPart, Object result) {

		// Nom de la méthode interceptée
		String name = staticPart.getSignature().toLongString();
		logger.debug(name + " retourne : [" + result + "]");
	}

}