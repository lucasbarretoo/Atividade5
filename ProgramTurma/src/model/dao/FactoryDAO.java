package model.dao;

import model.db.DB;

public class FactoryDAO {

	public static CursoDAO createCursoDAO() {
		return new CursoDAOImpl(DB.getConexao());
	}
	
	public static AlunoDAO createAlunoDAO() {
		return new AlunoDAOImpl(DB.getConexao());
	}

	public static DisciplinaDao createDisciplinaDAO() {
		return new DisciplinaDAOImpl(DB.getConexao());
	}
}
