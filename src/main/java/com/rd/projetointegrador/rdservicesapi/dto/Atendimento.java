package com.rd.projetointegrador.rdservicesapi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rd.projetointegrador.rdservicesapi.entity.AgPacienteEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigInteger;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Atendimento {

    private BigInteger idAtendimento;

    private Usuario paciente;

    private OutputMedico medico;

    private Prontuario prontuario;

    private AgPaciente agPaciente;

    private Float vlPeso;

    private Float vlAltura;

    private String dsHabitosVicios;

    private String dsAlergiasRestricoes;

    private String dsMedicacaoUsoContinuo;

    private String dsProblemasSaude;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dtAtendimento;

}
