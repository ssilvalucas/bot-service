package ssilvalucas.botservice.service

import org.springframework.stereotype.Service
import ssilvalucas.botservice.data.repository.AbastecimentoRepository
import ssilvalucas.botservice.mapper.AbastecimentoMapper
import ssilvalucas.botservice.web.dto.request.AbastecimentoRequest
import ssilvalucas.botservice.web.dto.response.CreatedResource

@Service
class AbastecimentoService(val repository: AbastecimentoRepository, val mapper: AbastecimentoMapper) {

    fun save(request: AbastecimentoRequest): CreatedResource {
        val saved = repository.save(mapper.requestToEntity(request))
        return CreatedResource(saved.id)
    }
}