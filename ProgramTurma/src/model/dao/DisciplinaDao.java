package model.dao;

import java.util.List;

import model.entities.Disciplina;

public interface DisciplinaDao {
	void insert(Disciplina obj);
	void update(Disciplina obj);
	void deleteByid(Integer id);
	Disciplina findByid(Integer id);
	List<Disciplina> findAll();
}
