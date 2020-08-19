package az.developia.course.service;

import az.developia.course.dto.Sector;
import az.developia.course.repository.SectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SectorServiceImpl implements SectorService {

    @Autowired
    SectorRepository sectorRepository;

    @Override
    public List<Sector> getSectorList() {
        Iterable<Sector> all = sectorRepository.findAll();
        List<Sector> sectorList = new ArrayList<>();
        all.forEach(sectorList::add);
        return sectorList;
    }
}
