package com.portfolio.claribel.Interface;

import com.portfolio.claribel.Entity.Persona;
import java.util.List;



public interface IPersonaService {
   //traer persona 
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar usuario por Id
    public void deletePersona(Long id);
    
    //buscar persona por Id
    public Persona findPersona(Long id);
}
