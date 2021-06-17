package model.entities;

public class Disciplina {
	
	private Integer iddisciplina;
	private String nomedisciplina;
	private Integer cargahoraria;
	
	public Disciplina() {

	}
	
	public Disciplina(Integer iddisciplina, String nomedisciplina, Integer cargahoraria) {
		this.iddisciplina = iddisciplina;
		this.nomedisciplina = nomedisciplina;
		this.cargahoraria = cargahoraria;
	}

	public Integer getIdDisciplina() {
		return iddisciplina;
	}

	public void setIdDisciplina(Integer iddisciplina) {
		this.iddisciplina = iddisciplina;
	}

	public String getNomeDisciplina() {
		return nomedisciplina;
	}

	public void setNomeDisciplina(String nomedisciplina) {
		this.nomedisciplina = nomedisciplina;
	}
	public Integer getCargaHorariaDisciplina() {
		return cargahoraria;
	}
	public void setCargaHorariaDisciplina(Integer cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((iddisciplina == null) ? 0 : iddisciplina.hashCode());
		result = prime * result + ((nomedisciplina == null) ? 0 : nomedisciplina.hashCode());
		result = prime * result + ((cargahoraria == null) ? 0 : cargahoraria.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (iddisciplina == null) {
			if (other.iddisciplina != null)
				return false;
		} else if (!iddisciplina.equals(other.iddisciplina))
			return false;
		if (nomedisciplina == null) {
			if (other.nomedisciplina != null)
				return false;
		} else if (!nomedisciplina.equals(other.nomedisciplina))
			return false;
		if (cargahoraria == null) {
			if (other.cargahoraria != null)
				return false;
		} else if (!cargahoraria.equals(other.cargahoraria))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disciplina [iddisciplina=" + iddisciplina + ", nomedisciplina=" + nomedisciplina + ", cargahoraria=" + cargahoraria + "]";
	}

	
}
