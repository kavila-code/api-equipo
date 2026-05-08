package com.equipo.api;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipo")
public class EquipoController {

    // Endpoint base — no modificar
    @GetMapping
    public List<String> integrantes() {
        return List.of("Equipo listo. Cada integrante agrega su endpoint abajo.");
    }

    // ─────────────────────────────────────────────────────────────────
    // ZONA DE TRABAJO DEL EQUIPO
    // Cada integrante del equipo agrega su método en esta sección.
    // Rama: feature/tu-nombre
    // ─────────────────────────────────────────────────────────────────
    @GetMapping("/Juan-Felipe-Gordillo")
    public String saludo() {
        return "Hola, soy Juan Felipe Gordillo y este es mi endpoint.";
    }

// Endpoint de Kelly
@GetMapping("/kelly")
public String saludo() {
    return "Hola, soy Kelly y este es mi endpoint.";
}

    @GetMapping("/Juan-Salazar")
    public String saludo() {
        return "Hola, soy Juan-Salazar y este es mi endpoint.";
    }


    @GetMapping("/Jhon-Velez")
    public String saludo() {
        return "Hola, soy Jhon Velez y este es mi endpoint.";
    }

    @GetMapping("/Juan Fernando Ramirez Delgado")
    public String saludo() {
        return "Hola, soy Juan Fernando Ramirez Delgado y este es mi endpoint.";
    }
}

