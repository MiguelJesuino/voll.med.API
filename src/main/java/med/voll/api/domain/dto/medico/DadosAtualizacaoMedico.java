package med.voll.api.domain.dto.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.dto.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        long id,

        String nome,
        String telefone,
        DadosEndereco endereco) {
}
