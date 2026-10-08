package com.example.model;

public class FormulaMedicamento {
    private Long formulaId;
    private Long medicamentoId;

    public FormulaMedicamento(Long formulaId, Long medicamentoId) {
        this.formulaId = formulaId;
        this.medicamentoId = medicamentoId;
    }

    public Long getFormulaId() {
        return formulaId;
    }

    public void setFormulaId(Long formulaId) {
        this.formulaId = formulaId;
    }

    public Long getMedicamentoId() {
        return medicamentoId;
    }

    public void setMedicamentoId(Long medicamentoId) {
        this.medicamentoId = medicamentoId;
    }
}
