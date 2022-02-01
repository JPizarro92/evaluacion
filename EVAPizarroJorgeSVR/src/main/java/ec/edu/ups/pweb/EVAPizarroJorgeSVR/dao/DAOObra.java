package ec.edu.ups.pweb.EVAPizarroJorgeSVR.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pweb.EVAPizarroJorgeSVR.model.Obra;

@Stateless
public class DAOObra {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Obra p) {
		em.persist(p);
	}
	
	public List<Obra> getObras(){
		List<Obra> listado = new ArrayList<Obra>();
		String jpql = "SELECT o FROM Obra o ";
		Query query = em.createQuery(jpql, Obra.class);
		listado = query.getResultList();
		return listado;
	}
	
}
