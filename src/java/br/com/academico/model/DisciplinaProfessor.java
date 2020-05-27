/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.academico.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Família
 */
@Entity
@Table(name = "disciplina_professor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DisciplinaProfessor.findAll", query = "SELECT d FROM DisciplinaProfessor d")})
public class DisciplinaProfessor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_disciplina_disciplina")
    private Integer idDisciplinaDisciplina;
    @JoinColumn(name = "id_disciplina_disciplina", referencedColumnName = "id_disciplina", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Disciplina disciplina;
    @JoinColumn(name = "id_disciplina_professor", referencedColumnName = "id_professor")
    @ManyToOne
    private Professor idDisciplinaProfessor;

    public DisciplinaProfessor() {
    }

    public DisciplinaProfessor(Integer idDisciplinaDisciplina) {
        this.idDisciplinaDisciplina = idDisciplinaDisciplina;
    }

    public Integer getIdDisciplinaDisciplina() {
        return idDisciplinaDisciplina;
    }

    public void setIdDisciplinaDisciplina(Integer idDisciplinaDisciplina) {
        this.idDisciplinaDisciplina = idDisciplinaDisciplina;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getIdDisciplinaProfessor() {
        return idDisciplinaProfessor;
    }

    public void setIdDisciplinaProfessor(Professor idDisciplinaProfessor) {
        this.idDisciplinaProfessor = idDisciplinaProfessor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDisciplinaDisciplina != null ? idDisciplinaDisciplina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DisciplinaProfessor)) {
            return false;
        }
        DisciplinaProfessor other = (DisciplinaProfessor) object;
        if ((this.idDisciplinaDisciplina == null && other.idDisciplinaDisciplina != null) || (this.idDisciplinaDisciplina != null && !this.idDisciplinaDisciplina.equals(other.idDisciplinaDisciplina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.academico.model.DisciplinaProfessor[ idDisciplinaDisciplina=" + idDisciplinaDisciplina + " ]";
    }
    
}
