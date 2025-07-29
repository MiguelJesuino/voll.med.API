package med.voll.api.domain.dto.medico;

import med.voll.api.domain.model.Especialidade;
import med.voll.api.domain.model.Medico;

public record DadosListagemMedico(
        Long id,
        String nome,
        String email,
        String crm,
        Especialidade especialidade) {

    public DadosListagemMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }

    // os getters foram criados por meio da notação @Getter do lombok


}
