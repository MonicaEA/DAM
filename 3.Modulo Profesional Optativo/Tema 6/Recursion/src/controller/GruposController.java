package controller;

import model.Grupo;
import model.Usuario;

public class GruposController {

    public boolean pertenece(Grupo grupo, Usuario usuario) {
        // 1. Caso base: ¿Está en el grupo actual?
        if (grupo.getUsuarios().contains(usuario)) {
            return true;
        }

        // 2. Si no, buscamos en cada subgrupo
        for (Grupo subGrupo : grupo.getSubGrupos()) {
            // ¡IMPORTANTE! Solo retornamos true si lo encontramos aquí.
            // Si retorna false, debemos dejar que el bucle siga con el siguiente subgrupo.
            if (pertenece(subGrupo, usuario)) {
                return true;
            }
        }

        // 3. Si terminó el bucle y nadie devolvió true, no está.
        return false;
    }
}