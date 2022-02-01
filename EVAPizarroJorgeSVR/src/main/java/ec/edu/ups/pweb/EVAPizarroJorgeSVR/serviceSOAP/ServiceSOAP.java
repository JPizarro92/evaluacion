package ec.edu.ups.pweb.EVAPizarroJorgeSVR.serviceSOAP;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.pweb.EVAPizarroJorgeSVR.model.Obra;
import ec.edu.ups.pweb.EVAPizarroJorgeSVR.on.ONObraLocal;

@WebService
public class ServiceSOAP {
	@Inject
	ONObraLocal onObra;
	
	@WebMethod
	public boolean insertarObra(Obra o) {
		try {
			onObra.guardar(o);
			return true;
		} catch (Exception e) {
			System.out.println("Fallo al guardar");
			return false;
		}
		
	}
	
	@WebMethod
	public List<Obra> getObras() {
		return onObra.getListado();
	}
	
}
