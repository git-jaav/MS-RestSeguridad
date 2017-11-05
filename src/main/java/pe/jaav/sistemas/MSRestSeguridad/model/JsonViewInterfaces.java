package pe.jaav.sistemas.MSRestSeguridad.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class JsonViewInterfaces {
	
	public static String[] generalJsonIgnoreProperties = 
		 { "urlJson","numeroFilas","inicio", "visibled","numeroColumnas" ,"accionDB","valorStringSup","valorIntSup"};
	
	public interface ViewGeneral {}
}
