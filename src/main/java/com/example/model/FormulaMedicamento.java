
package com.example.model;

public class FormulaMedicamento {

    private Integer formulaId;
    private Integer medicamentoId;
    public FormulaMedicamento() {
    }
    public FormulaMedicamento(Integer formulaId, Integer medicamentoId) {
        this.formulaId = formulaId;
        this.medicamentoId = medicamentoId;
    }

    public Integer getFormulaId() {
        return formulaId;
    }

    public void setFormulaId(Integer formulaId) {
        this.formulaId = formulaId;
    }

    public Integer getMedicamentoId() {
        return medicamentoId;
    }

    public void setMedicamentoId(Integer medicamentoId) {
        this.medicamentoId = medicamentoId;
    }

    @Override
    public String toString() {
        return "FormulaMedicamento{" +
                "formulaId=" + formulaId +
                ", medicamentoId=" + medicamentoId +
                '}';
    }
}
