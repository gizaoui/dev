package com.xmlbuilds;

import java.io.File;

import noNamespace.RootDocument;
import noNamespace.RootDocument.Root;
import noNamespace.RootDocument.Root.People.Employee;

import org.apache.log4j.Logger;


/**
 * Effectuer un 'generate-sources' afin d'exploiter les beans ci-dessous
 * /!\ Modifier l'interface (IXmlBuilds) puis 'enregistrer' pour supprimer 
 *     l'erreur après avoir regénéré les beans
 */
public class XmlBeansCorporation implements IXmlBeans { 

	private static Logger logger = Logger.getLogger(XmlBeansCorporation.class);

	private String fileName;

	@Override
	public String getFileName() {
		return fileName;
	}

	@Override
	public void setFileName(String fileName) {
		this.fileName = System.getProperty("user.dir") + fileName;
	}

	@Override
	public void ReadFile() {

		try {

			File inputXMLFile = new File(fileName + ".xml");
			RootDocument rootDocument = RootDocument.Factory.parse(inputXMLFile);

			Root root = rootDocument.getRoot();
			logger.debug("Corporation: " + root.getCorporation().getName());
			
			logger.debug("Adresse: " + root.getAdresse().getDeliveryAddress().getLine1());

			
			
			Employee[] employee = root.getPeople().getEmployeeArray();
			logger.debug("There are " + employee.length + " employees.");

			for (int pp = 0; pp < employee.length; pp++) {

				logger.debug("Employee name: " + employee[pp].getName());
				logger.debug("    Gender: " + employee[pp].getGender().toString());
				logger.debug("    Location: " + employee[pp].getDesc().toString());
				logger.debug("    Cell phone: " + employee[pp].getData().getCellPhone());

				String employeeTaxStatus = employee[pp].getTaxStatus().toString();
				if (employeeTaxStatus.equalsIgnoreCase("US-W2")) {

					logger.debug("    Tax status: W2");
					logger.debug("        Employee number: " + employee[pp].getUSW2().getEmpNumber());
					logger.debug("        Employee manager: " + employee[pp].getUSW2().getManager());
					logger.debug("        Employee start year: " + employee[pp].getUSW2().getYearStart());

				} else if (employeeTaxStatus.equalsIgnoreCase("US-1099")) {

					logger.debug("    Tax status: 1099");
					logger.debug("        SSN number: " + employee[pp].getUS1099().getSsnNumber());
					logger.debug("        Phone number: " + employee[pp].getUS1099().getPhone());
					logger.debug("        Corp name: " + employee[pp].getUS1099().getCorpName());
					logger.debug("        Corp address: " + employee[pp].getUS1099().getCorpAddress());
					logger.debug("        Corp relationship: " + employee[pp].getUS1099().getRelationship().toString());
				} else {
					logger.debug("No tax status specified");
				}
			}

		} catch (Exception e) {
			logger.debug("Error! Exception caught");
			e.printStackTrace();
		}
	}


	@Override
	public void WriteFile() {
		// TODO Stub de la méthode généré automatiquement
		
	}
	
	
	@Override
	public String toString() {
		return "XmlBeansCorporation [fileName=" + fileName + "]";
	}

}
