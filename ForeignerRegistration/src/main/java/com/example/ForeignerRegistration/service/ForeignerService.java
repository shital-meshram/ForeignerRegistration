package com.example.ForeignerRegistration.service;

import com.example.ForeignerRegistration.model.TCsForeignerRegistration;
import com.example.ForeignerRegistration.model.TCsForeignerRegistrationPK;
import com.example.ForeignerRegistration.repository.ForeignerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ForeignerService {

    @Autowired
    private ForeignerRepository foreignerRepository;

    public List<TCsForeignerRegistration> getAllForeigners() {
        return foreignerRepository.findAll();
    }

    public TCsForeignerRegistration getForeignerById(TCsForeignerRegistrationPK id) {
        Optional<TCsForeignerRegistration> optionalForeigner = foreignerRepository.findById(id);
        return optionalForeigner.orElse(null);
    }

    public TCsForeignerRegistration createForeigner(TCsForeignerRegistration foreigner) {
        return foreignerRepository.save(foreigner);
    }

    public TCsForeignerRegistration updateForeigner(TCsForeignerRegistrationPK id, TCsForeignerRegistration foreigner) {
        if (foreignerRepository.existsById(id)) {
            foreigner.setId(id);
            return foreignerRepository.save(foreigner);
        }
        return null; // Or throw an exception
    }

    public void deleteForeigner(TCsForeignerRegistrationPK id) {
        foreignerRepository.deleteById(id);
    }

    //Pagination and Sorting
    public Page<TCsForeignerRegistration> getForeignerResultsByPaginationAndSorting(Integer pageNum, Integer pageSize, String sortProperty) {

        Pageable pageable = null;
        if(null!=sortProperty){
            //sorting with the user input property
            pageable = PageRequest.of(pageNum, pageSize, Sort.Direction.ASC, sortProperty);
        }else{
            //sorting with the default property
            pageable = PageRequest.of(pageNum, pageSize, Sort.Direction.ASC, "applicationDt");
        }

        return foreignerRepository.findAll(pageable);
    }


}
