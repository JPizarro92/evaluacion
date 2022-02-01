package ec.edu.ups.pweb.EVAPizarroJorgeSVR.on;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pweb.EVAPizarroJorgeSVR.dao.DAOObra;
import ec.edu.ups.pweb.EVAPizarroJorgeSVR.model.Obra;

@Stateless
public class ONObra implements ONObraLocal{

	@Inject
	private DAOObra daoObra;
	
	public void guardar(Obra o) {
		daoObra.insert(o);
	}
	
	public List<Obra> getListado(){
		return daoObra.getObras();
	}
	
}
