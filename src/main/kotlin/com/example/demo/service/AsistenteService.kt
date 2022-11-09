package com.example.demo.service

import com.example.demo.model.Asistente
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import com.example.demo.repository.AsistenteRepository

@Service
class AsistenteService {
    @Autowired
    lateinit var asistenteRepository:AsistenteRepository

    fun list ():List<Asistente>{
        return asistenteRepository.findAll()
    }

    fun save (asistente: Asistente):Asistente{
        return asistenteRepository.save(asistente)
    }
}