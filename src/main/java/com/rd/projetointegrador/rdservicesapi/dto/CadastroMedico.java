package com.rd.projetointegrador.rdservicesapi.dto;

import com.rd.projetointegrador.rdservicesapi.entity.CidadeEntity;
import com.rd.projetointegrador.rdservicesapi.entity.EspMedEntity;
import com.rd.projetointegrador.rdservicesapi.entity.UfEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CadastroMedico {

    private List<CidadeEntity> cidades;
    private List<UfEntity> ufs;
    private List<EspMedEntity> especialidades;
}
