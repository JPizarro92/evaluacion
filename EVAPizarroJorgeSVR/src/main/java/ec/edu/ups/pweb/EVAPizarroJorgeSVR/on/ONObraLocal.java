package ec.edu.ups.pweb.EVAPizarroJorgeSVR.on;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.pweb.EVAPizarroJorgeSVR.model.Obra;

@Local
public interface ONObraLocal {
	public void guardar(Obra o);
	public List<Obra> getListado();
}
