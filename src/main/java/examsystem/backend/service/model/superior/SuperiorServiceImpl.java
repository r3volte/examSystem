package examsystem.backend.service.model.superior;

import examsystem.backend.dto.SuperiorDTO;
import examsystem.backend.model.entity.Superior;
import examsystem.backend.service.beans.MappingModel;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class SuperiorServiceImpl {

  private final SuperiorService service;
  private final MappingModel model;

  @Autowired
  public SuperiorServiceImpl(SuperiorService service,
                             MappingModel model) {
    this.service = service;
    this.model = model;
  }

  public List<SuperiorDTO> findAllSuperiorsDTO() {
    List<Superior> mySuperiors = service.findAllSuperiors();
    return mySuperiors
            .stream()
            .map(this::convertToDTO)
            .collect(Collectors.toList());
  }

  public SuperiorDTO findSuperiorByLastName(String surname) {
    Superior superior = service.findSuperiorByLastName(surname);
    return convertToDTO(superior);
  }

  public Superior addSuperior(SuperiorDTO superiorDTO) {
    Superior superior = convertToEntity(superiorDTO);
    return service.addTrainer(superior);
  }

  public void deleteSuperior(SuperiorDTO superiorDTO) {
    Superior superior = convertToEntity(superiorDTO);
    service.deleteSuperior(superior);
  }

  @Transactional
  public void updateSuperior(SuperiorDTO superiorDTO) {
    Superior superior = convertToEntity(superiorDTO);
    service.updateSuperior(superior);
  }


  private SuperiorDTO convertToDTO(Superior superior) {
    return model.modelMapper().map(superior, SuperiorDTO.class);
  }

  private Superior convertToEntity(SuperiorDTO superiorDTO) {
    Superior superior = model
            .modelMapper()
            .map(superiorDTO, Superior.class);
    if (superiorDTO.getId() != null) {
      Superior oldTrainer = service
              .findSuperiorByID(superiorDTO.getId());
      superior.setId(oldTrainer.getId());
    }
    return superior;
  }
}
